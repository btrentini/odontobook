
	

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<script src="${pageContext.request.contextPath}/jquery-1.3.2.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/script.js" type="text/javascript"></script>
		<script src="http://code.jquery.com/jquery-latest.js" type="text/javascript"></script> 
 		<script src="${pageContext.request.contextPath}/jquery.validate.js" type="text/javascript" type="text/javascript"></script>
  		<script src="${pageContext.request.contextPath}/js/validation.js" type="text/javascript" type="text/javascript"></script>
 <c:set var="usuario" value="${login}"/>
	<c:if test="${usuario == null || empty usuario }">
	
		<c:redirect url="/default.jsp"/>
	
	</c:if>
<script src="${pageContext.request.contextPath}/jquery.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/jquery.maskedinput.js" type="text/javascript"></script>

	
	<script>

function limitTextCount(limitField_id, limitCount_id, limitNum)

{

    var limitField = document.getElementById(limitField_id);

    var limitCount = document.getElementById(limitCount_id);



    var fieldLEN = limitField.value.length;



    if (fieldLEN > limitNum)

    {

        limitField.value = limitField.value.substring(0, limitNum);

    }

    else

    {

        limitCount.innerHTML = 'Restam ' +(limitNum - fieldLEN) + ' caracteres.';

    }

}
</script>
	<script type="text/javascript">
	// Função única que fará a transação
	function getEndereco() {
			// Se o campo CEP não estiver vazio
			if($.trim($("#cep").val()) != ""){
				/* 
					Para conectar no serviço e executar o json, precisamos usar a função
					getScript do jQuery, o getScript e o dataType:"jsonp" conseguem fazer o cross-domain, os outros
					dataTypes não possibilitam esta interação entre domínios diferentes
					Estou chamando a url do serviço passando o parâmetro "formato=javascript" e o CEP digitado no formulário
					http://cep.republicavirtual.com.br/web_cep.php?formato=javascript&cep="+$("#cep").val()
				*/
				$.getScript("http://cep.republicavirtual.com.br/web_cep.php?formato=javascript&cep="+$("#cep").val(), function(){
					// o getScript dá um eval no script, então é só ler!
					//Se o resultado for igual a 1
			  		if(resultadoCEP["resultado"]){
						// troca o valor dos elementos
						$("#rua").val(unescape(resultadoCEP["tipo_logradouro"])+" "+unescape(resultadoCEP["logradouro"]));
						$("#bairro").val(unescape(resultadoCEP["bairro"]));
						$("#cidade").val(unescape(resultadoCEP["cidade"]));
						$("#estado").val(unescape(resultadoCEP["uf"]));
					}else{
						alert("Endereço não encontrado");
					}
				});				
			}			
	}
</script>
	<script type="text/javascript">
	// Função única que fará a transação
	function getEnderecoConsultorio() {
			// Se o campo CEP não estiver vazio
			if($.trim($("#cepConsultorio").val()) != ""){
				/* 
					Para conectar no serviço e executar o json, precisamos usar a função
					getScript do jQuery, o getScript e o dataType:"jsonp" conseguem fazer o cross-domain, os outros
					dataTypes não possibilitam esta interação entre domínios diferentes
					Estou chamando a url do serviço passando o parâmetro "formato=javascript" e o CEP digitado no formulário
					http://cep.republicavirtual.com.br/web_cep.php?formato=javascript&cep="+$("#cep").val()
				*/
				$.getScript("http://cep.republicavirtual.com.br/web_cep.php?formato=javascript&cep="+$("#cepConsultorio").val(), function(){
					// o getScript dá um eval no script, então é só ler!
					//Se o resultado for igual a 1
			  		if(resultadoCEP["resultado"]){
						// troca o valor dos elementos
						$("#enderecoConsultorio").val(unescape(resultadoCEP["tipo_logradouro"])+" "+unescape(resultadoCEP["logradouro"]));
						$("#bairroConsultorio").val(unescape(resultadoCEP["bairro"]));
						$("#cidadeConsultorio").val(unescape(resultadoCEP["cidade"]));
						$("#ufConsultorio").val(unescape(resultadoCEP["uf"]));
					}else{
						alert("Endereço não encontrado");
					}
				});				
			}			
	}
</script>
			<script>
				jQuery(function($){
					   $("#dataCirurgia").mask("99/9999" );
					   $("#cro").mask("CRO-aa-999?.999",{placeholder:" "});
					   $("#cpf").mask("999.999.999-99",{placeholder:" "});
					   $("#rgPessoa").mask("9.999.999-9",{placeholder:" "});
					   $("#fone1Pessoa").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#fone2Pessoa").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#fone3Pessoa").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#foneRecadoPessoa").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#nacionalidade").mask("aaaaaaaaaaaaaaaaaaa",{placeholder:" "});
					   $("#naturalidade").mask("aaaaaaaaaaaaaaaaaaa",{placeholder:" "});
					   $("#cep").mask("99.999-999",{placeholder:" "});
					   $("#numeroCasa").mask("999999999",{placeholder:" "});
					   $("#numeroConsultorio").mask("999999999",{placeholder:" "});
					   $("#telefoneMedico").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#telefone2Consultorio").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#cepConsultorio").mask("99.999-999",{placeholder:" "});
					   $("#faxConsultorio").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#anoFormacaoCurriculo").mask("9999",{placeholder:" "});
					   $("#nomePessoa").mask("aaaaaaaaaaaaaaaaaaaaaaaa",{placeholder:" "});
					   $("#sobrenomePessoa").mask("aaaaaaaaaaaaaaaaaaaaaaaa",{placeholder:" "});
					   $("#qtdeCigarrosDiarios").mask("999",{placeholder:" "});
						$("#mesesGravidez").mask("9",{placeholder:" "});
					});
			</script>

			<script>	
				$(document).ready(function() { 
					
		
				        
					   
				$("input[name$='perfil']").click(function() {				
		
				    
					 var test = $(this).val();         
					 $("div.desc").hide();      	 
					 $("#Perfil" + test).show(); 
					 });
			    
				 }); 
			</script>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"[]>
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">


<head>

  
    <title>Faceodonto Book </title>
<!-- META -->    
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
     
    <meta name="description" content="Faceodonto book é uma aplicação online para pacientes e dentistas! 
   Realizado como Projeto de Conclusão de Curso no Bacharelado em Sistemas de Informação - PUCPR - 2011 " />
    						
    <meta name="keywords" content="dentista prognostico sistema" />
    
    
<!-- SCRIPTS -->

    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/estiloLivre.css" type="text/css" media="screen"  />
     <link rel="stylesheet" href="${pageContext.request.contextPath}/css/general.css" type="text/css" media="screen"  />
    <!--[if IE 6]><link rel="stylesheet" href="${pageContext.request.contextPath}/style.ie6.css" type="text/css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="$${pageContext.request.contextPath}/style.ie7.css" type="text/css" media="screen" /><![endif]-->
    
	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
			
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/script.js"></script>
</head>
<!-- ============================================================================================================ -->
<!-- ======									NAO MEXA DAQUI PRA BAIXO!              						  ======= -->
<!-- ============================================================================================================ -->
<body>
<!-- BODY -->

<div id="art-page-background-glare">
    <div id="art-page-background-glare-image"> </div>
</div>
<div id="art-main">
    <div class="art-header">
        <div class="art-header-clip">
        <div class="art-header-center">
            <div class="art-header-png"></div>
        </div>
        </div>
    <div class="art-header-wrapper">
    <div class="art-header-inner">
        <div class="art-headerobject"></div>
        <div class="art-logo">
                 <h1 class="art-logo-name"><a href="./index.html">Face Odonto Book</a></h1>
                         <h2 class="art-logo-text">Seu repositorio online de servicos odontologicos!</h2>
                </div>
    </div>
    </div>
    </div>
    <div class="cleared reset-box"></div><div class="art-nav">
	<div class="art-nav-l"></div>
	<div class="art-nav-r"></div>
<div class="art-nav-outer">
<div class="art-nav-wrapper">
<div class="art-nav-inner">

</div>
</div>
</div>
</div>

<div class="art-sheet">
        <div class="art-sheet-body">
            <div class="art-content-layout">
                <div class="art-content-layout-row">
                    <div class="art-layout-cell art-content">
<div class="art-post">
    <div class="art-post-body">
<div class="art-post-inner art-article">
<div class="art-postcontent">


<br />

<!-- ============================================================================================================ -->
<!-- ======									AQUI COMEÇA O CONTEUDO!               						  ======= -->
<!-- ============================================================================================================ -->
	<br></br>
	<p><a href="${pageContext.request.contextPath}/jsp/default.jsp"> <img src="${pageContext.request.contextPath}/img/l2.png"></img></a>
	<c:if test="${perfil == 'dentista' }">	
	<td style="text-align: right; vertical-align: middle; border: none;"><a href="buscarPacientes.brun"> <img src="${pageContext.request.contextPath}/img/visuPacientes.png"></img></a></td>
	</c:if>
		
	<a href="${pageContext.request.contextPath}/jsp/logoff.ctrl"> <img src="${pageContext.request.contextPath}/img/l1.png"></img></a></p>
	<hr></hr>
	<p> ${resultado }</p>
<h1> Ola, ${sessionScope.login} </h1>

	<c:if test="${perfil == 'paciente' }">	
<h3> Edite sua Anamnese Geral</h3>
	</c:if>
	<c:if test="${perfil == 'dentista' }">	
	<h3> Visualize a  Anamnese Geral do paciente: ${ sessionScope.cpfDoCara}</h3>
	</c:if>
<div id="principal">
<form method="post" id="customForm" action="alterarAnamneseGeral.ctrl">
<table style="text-align: center; text-indent: 3px; " class="tabelaAnamnese" >
<tr>
<td width="400" style="border: none;"></td>
<td width="400" style="border: none;"></td>
</tr>
	<tr >
		<td colspan="2"> <h4><center>Marque todas que se aplicam.</center></h4></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> Apresenta problemas de Saúde? </td>
		<td style="border: none;"><input type="checkbox" name="apresentaProblemaDeSaude" class="check" ${sessionScope.anamnese.apresentaProblemaDeSaude }  ><span><b></b></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> Está em tratamento médico? </td>
		<td style="border: none;"><input type="checkbox" name="estaEmTratamentoMedico" ${sessionScope.anamnese.estaEmTratamentoMedico } ><span><span><b></b></span></span></td>
	</tr> 
	 	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">  Nome do Médico</td>
		<td style="border: none;"><input type="text" id="nomeMedico" name="nomeMedico" class="areas2" maxlength="24"  value="${sessionScope.anamnese.nomeMedico}" /> </td>
	</tr> 
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">   Telefone do Médico</td>
		<td style="border: none;"><input type="text" id="telefoneMedico" name="telefoneMedico"  class="areas2"    value="${sessionScope.anamnese.telefoneMedico}"/> <span> Ramal é Opcional</span></td>
	</tr> 
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">   Você toma medicamento?  </td>
		<td style="border: none;"> <input type="checkbox" name="tomaMedicamento" ${sessionScope.anamnese.tomaMedicamento } ><span><b></b></span></td>
	</tr> 
	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">   Quais medicamentos você toma?</td>
		<td style="border: none;"> <input type="text" id="qualMedicamento" name="qualMedicamento" class="areas2" maxlength="24" value="${sessionScope.anamnese.qualMedicamento}"  /></td>
	</tr> 

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Qual foi seu último tratamento? </td>
		<td style="border: none;"><input type="text" id="qualUltimoTratamento" name="qualUltimoTratamento" class="areas2" maxlength="24"   value="${sessionScope.anamnese.qualUltimoTratamento}" /> </td>
	</tr> 
		<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Já passou por alguma cirurgia? </td>
		<td style="border: none;"><input type="checkbox" name="jaPassouCirurgia" id="jaPassouCirurgia" ${sessionScope.anamnese.jaPassouCirurgia }><span><b></b></span> </td>
	</tr> 
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">     Qual foi o tipo de cirurgia? </td>
		<td style="border: none;"><input type="text" id="tipoCirurgia" name="tipoCirurgia" class="areas2" maxlength="24" value="${sessionScope.anamnese.tipoCirurgia}"  /> </td>
	</tr>  
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">     Qual foi a data da cirurgia? </td>
		<td style="border: none;"><input type="text" id="dataCirurgia" name="dataCirurgia" class="areas2" value="${sessionScope.anamnese.dataCirurgia}" /> <span> MM/AAAA</span></td>
	</tr>  
	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Você tem alguma doenca séria? </td>
		<td style="border: none;"><input type="checkbox" name="doencaSeria" id="doencaSeria" ${sessionScope.anamnese.doencaSeria}><span><b></b></span>  </td>
	</tr>  
	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">   Qual doenca séria? </td>
		<td style="border: none;"> <input type="text" id="qualDoencaSeria" name="qualDoencaSeria" class="areas2" maxlength="24" value="${sessionScope.anamnese.qualDoencaSeria}"  /></td>
	</tr>  
	  <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">   Possui antineoplastico na face? </td>
		<td style="border: none;"><input type="checkbox" name="antineoplasticoFace" id="antineoplasticoFace"  ${sessionScope.anamnese.antineoplasticoFace }><span><b></b></span> | <span><font color="#990000"> Se não sabe é porque não tem!</font></span>  </td>
	</tr>  

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Fumante? </td>
		<td style="border: none;"><input type="checkbox" name="fumante" id="fumante" ${sessionScope.anamnese.fumante }><span><b></b></span>  </td>
	</tr>  
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Quantos cigarros você fuma diariamente? </td>
		<td style="border: none;"><input type="text" id="qtdeCigarrosDiarios" name="qtdeCigarrosDiarios" class="areas2" maxlength="3" value="${sessionScope.anamnese.qtdeCigarrosDiarios}"  /> </td>
	</tr>  
	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Você bebe frequentemente?  </td>
		<td style="border: none;"><input type="checkbox" name="bebidaAlcoolicaFrequente" id="bebidaAlcoolicaFrequente" ${sessionScope.anamnese.bebidaAlcoolicaFrequente} ><span><b></b></span>  </td>
	</tr>  
	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Está grávida/amamentando? </td>
		<td style="border: none;"><input type="checkbox" name="gravidaAmamentando" id="gravidaAmamentando"  ${sessionScope.anamnese.gravidaAmamentando} ><span><b></b></span> </td>
	</tr>  
	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">      Se está grávida, há quantos meses? </td>
		<td style="border: none;"> <input type="text" id="mesesGravidez" name="mesesGravidez" class="areas2" maxlength="1" value="${sessionScope.anamnese.mesesGravidez}"/>  </td>
	</tr> 
	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Quer acrescentar alguma outra informação relevante? </td>
		<td style="border: none;"><textarea rows="3" cols="20" id="outrasInformacoes" name="outrasInformacoes" style="resize: none;" value="${sessionScope.anamnese.outrasInformacoes}"
									onkeyup="limitTextCount('outrasInformacoes', 'divcount2', 240);" onkeydown="limitTextCount('outrasInformacoes', 'divcount2', 240);">
									${sessionScope.anamnese.outrasInformacoes}
									</textarea>
									<font color="#990000"><span id="divcount2"> Restam 240 caracteres.</span></font> </td>								
	</tr>
	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">   Ganhou ou perdeu peso ultimamente? </td>
		<td style="border: none;"><input type="checkbox" name="ganhouPerdeuPesoUltimamente" id="ganhouPerdeuPesoUltimamente" ${sessionScope.anamnese.ganhouPerdeuPesoUltimamente}><span><b></b></span> </td>
	</tr> 
	 	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">   Sente falta de ar? </td>
		<td style="border: none;"><input type="checkbox" name="faltaDeAr" id="faltaDeAr " ${sessionScope.anamnese.faltaDeAr} ><span><b></b></span> </td>
	</tr> 
	 	 	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">  Suas juntas incham com frequencia? </td>
		<td style="border: none;"> <input type="checkbox" name="juntasIncham" id="juntasIncham " ${sessionScope.anamnese.juntasIncham}  ><span><b></b></span></td>
	</tr> 
		 	 	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">   Sente tonturas ou sofre desmaios? </td>
		<td style="border: none;"> <input type="checkbox" name="tonturasDesmaios" id="tonturasDesmaios " ${sessionScope.anamnese.tonturasDesmaios}  /><span><b></b></span></td>
	</tr> 
			 	 	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Apresenta demora para cicatrizar ferimentos? </td>
		<td style="border: none;"><input type="checkbox" name="demoraCicatrizar" id="demoraCicatrizar " ${sessionScope.anamnese.demoraCicatrizar} ><span><b></b></span> </td>
	</tr> 
				 	 	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">    Já apresentou hemorragia? </td>
		<td style="border: none;"><input type="checkbox" name="hemorragia" id="hemorragia " ${sessionScope.anamnese.hemooragia}><span><b></b></span> </td>
	</tr>  
	 				 	 	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;">     Usa algum tipo de droga? </td>
		<td style="border: none;"><input type="checkbox" name="drogas" id="drogas "  ${sessionScope.anamnese.drogas}><span><b></b></span> </td>
	</tr>  
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">     Se sim, especifique: </td>
		<td style="border: none;">
			<textarea rows="3" cols="20" id="tiposDrogas" name="tiposDrogas" style="resize: none;"
			onkeyup="limitTextCount('tiposDrogas', 'divcount', 240);" onkeydown="limitTextCount('tiposDrogas', 'divcount', 240);">
			${sessionScope.anamnese.tiposDrogas}
			</textarea><br></br><font color="#990000"><span id="divcount"> Restam 240 caracteres.</font></span>    
		</td>
	</tr>  

		
</table>

<c:if test="${perfil == 'paciente' }">	

<INPUT TYPE="submit" name="acao" id="botao" value="Gravar"
	class="art-button" CHECKED/>
	</c:if>
</form>
<hr></hr>

</div>


<!-- ============================================================================================================ -->
<!-- ======									AQUI TERMINA O CONTEUDO!               						  ======= -->
<!-- ============================================================================================================ -->
   </div>       
<!-- ============================================================================================================ -->
<!-- ======									NAO MEXA DAQUI PRA BAIXO!            						  ======= -->
<!-- ============================================================================================================ -->

                <div class="cleared"></div></div>

		<div class="cleared"></div>
    </div>
</div>

                      <div class="cleared"></div>
                    </div>
                </div>
            </div>
            <div class="cleared"></div>
            
    		<div class="cleared"></div>
        </div>
    </div>
    <div class="art-footer">
        <div class="art-footer-t"></div>
        <div class="art-footer-body">
            <div class="art-footer-center">
                <div class="art-footer-wrapper">
                    <div class="art-footer-text">
                        <a href="#" class="art-rss-tag-icon" title="RSS"></a>
                        
<p><a href="http://www.pucpr.br">PUCPR</a> | <a href="http://www.facebook.com#">Facebook</a> | <a href="#">Sobre</a></p>
<p> Bacharelado em Sistemas de Informação - 2011. Criado para fins acadêmicos. </p>


                        <div class="cleared"></div>
                        <p class="art-page-footer"></p>
                    </div>
                </div>
            </div>
            <div class="cleared"></div>
        </div>
    </div>
</div>

</body>
</html>
	
	