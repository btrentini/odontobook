
	

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
					   $("#dataUltimaConsulta").mask("99/9999" );
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
	<a href="${pageContext.request.contextPath}/jsp/logoff.ctrl"> <img src="${pageContext.request.contextPath}/img/l1.png"></img></a></p>
	<hr></hr>
<h1> Ola, ${sessionScope.login} </h1>
<h3> Edite sua Anamnese Clinica</h3>

<div id="principal">

<form method="post" id="customForm" action="alterarAnamneseClinica.ctrl">
<table style="text-align: center; text-indent: 3px; " class="tabelaAnamnese" >
<tr>
<td width="400" style="border: none;"></td>
<td width="400" style="border: none;"></td>
</tr>
	<tr >
		<td colspan="2"> <h4><center>Marque todas que se aplicam.</center></h4></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> Data da última consulta </td>
		<td style="border: none;"><input type="text" name="dataUltimaConsulta" id="dataUltimaConsulta" ><span><b>(MM/AAAA)</b></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> Você sente dor em algum Dente? </td>
		<td style="border: none;"><input type="checkbox" name="dorDente" id="dorDente" value=""><span><span><b></b></span></span></td>
	</tr> 
	 <tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> 	 Já teve problemas ao extrair algum dente?</td>
		<td style="border: none;"><input type="checkbox" name="problemasExtrairDente" id="problemasExtrairDente" value=""><span><span><b></b></span></span></td>
	</tr> 
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> 	 Sua gengiva sangra muito?</td>
		<td style="border: none;"><input type="checkbox" name="gengivaSangraMuito" id="gengivaSangraMuito" value=""><span><span><b></b></span></span></td>
	</tr> 
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> 	 Tem dificuldade de abrir ou fechar a boca?</td>
		<td style="border: none;"><input type="checkbox" name="dificuldadeAbrirOuFecharBoca" id="dificuldadeAbrirOuFecharBoca" value=""><span><span><b></b></span></span></td>
	</tr> 
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> 	 Faz barulho ao abrir/fechar a boca?</td>
		<td style="border: none;"><input type="checkbox" name="barulhoAbrirBoca" id="barulhoAbrirBoca" value=""><span><span><b></b></span></span></td>
	</tr> 		 
		<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> 	 Você tem dores na face?</td>
		<td style="border: none;"><input type="checkbox" name="doresFace" id="doresFace" value=""><span><span><b></b></span></span></td>
	</tr> 	 
		<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> 	 Você possui protese? </td>
		<td style="border: none;"><input type="checkbox" name="possuiProtese" id="possuiProtese" value=""><span><span><b></b></span></span></td>
	</tr> 	 	 

	 

</table>


<p><INPUT TYPE="submit" name="acao" id="botao" value="Gravar"
	class="art-button" CHECKED/></p>
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
	
	