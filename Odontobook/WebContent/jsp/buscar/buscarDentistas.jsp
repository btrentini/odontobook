
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<script src="${pageContext.request.contextPath}/jquery-1.3.2.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/script.js" type="text/javascript"></script>
		<script src="http://code.jquery.com/jquery-latest.js" type="text/javascript"></script> 
 		<script src="${pageContext.request.contextPath}/jquery.validate.js" type="text/javascript" type="text/javascript"></script>
  		<script src="${pageContext.request.contextPath}/js/validation.js" type="text/javascript" type="text/javascript"></script>
		
<script src="${pageContext.request.contextPath}/jquery.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/jquery.maskedinput.js" type="text/javascript"></script>
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
			  			
						var endereco = unescape(resultadoCEP["tipo_logradouro"])+" "+unescape(resultadoCEP["logradouro"]);
						var bairro = unescape(resultadoCEP["bairro"]);
						var cidade = unescape(resultadoCEP["cidade"]);
						var uf = unescape(resultadoCEP["uf"]);
						
						
						// troca o valor dos elementos
						$("#rua").val(endereco);
						$("#bairro").val(bairro);
						$("#cidade").val(cidade);
						$("#estado").val(uf);
						
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
						
						var endereco = unescape(resultadoCEP["tipo_logradouro"])+" "+unescape(resultadoCEP["logradouro"]);
						var bairro = unescape(resultadoCEP["bairro"]);
						var cidade = unescape(resultadoCEP["cidade"]);
						var uf = unescape(resultadoCEP["uf"]);
						
						
						$("#enderecoConsultorio").val(endereco);
						$("#bairroConsultorio").val(bairro);
						$("#cidadeConsultorio").val(cidade);
						$("#ufConsultorio").val(uf);
						
					}else{
						alert("Endereço não encontrado");
					}
				});				
			}			
	}
</script>
			<script>
				jQuery(function($){
					   $("#dataNascimento").mask("99/99/9999" );
					   $("#cro").mask("CRO-aa-999?.999",{placeholder:" "});
					   $("#cpf").mask("999.999.999-99",{placeholder:" "});
					   $("#rgPessoa").mask("9.999.999-9",{placeholder:" "});
					   $("#fone1Pessoa").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#fone2Pessoa").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#fone3Pessoa").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#foneRecadoPessoa").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#cep").mask("99.999-999",{placeholder:" "});
					   $("#numeroCasa").mask("9?99999999",{placeholder:" "});
					   $("#numeroConsultorio").mask("9?99999999",{placeholder:" "});
					   $("#telefone1Consultorio").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#telefone2Consultorio").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#cepConsultorio").mask("99.999-999",{placeholder:" "});
					   $("#faxConsultorio").mask("(99) 9999-9999 ?R:9999",{placeholder:" "});
					   $("#anoFormacaoCurriculo").mask("9999",{placeholder:" "});
					 
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
<c:set var="perfil" value="${sessionScope.identificador }}"/>
	<br></br>
	<p><a href="${pageContext.request.contextPath}/jsp/default.jsp"> <img src="${pageContext.request.contextPath}/img/l2.png"></img></a>
	<a href="${pageContext.request.contextPath}/jsp/logoff.ctrl"> <img src="${pageContext.request.contextPath}/img/l1.png"></img></a></p>
	<hr></hr>

	<p> ${resultado}</p> 
<div id="principal">

<form method="get" id="customForm" action="concederPermissoes.ctrl" >
<table style="text-align: center;">

<tr>
	<td colspan="5" style="text-align: center; vertical-align: middle; ">
		<font size="4" color="#7FB30F ">
			<b>Selecione os dentistas para compartilhar suas informações! </b>
		</font>
	</td>
</tr>
<tr><td style="text-align: right; vertical-align: middle; border: none;"></td><td style="text-align: right; vertical-align: middle; border: none;"></td></tr>
<tr><td style="text-align: right; vertical-align: middle; border: none;"></td ><td style="text-align: right; vertical-align: middle; border: none;"></td></tr>

	<tr>
		<td style="text-align: right; vertical-align: middle;" > Nome </td>

		<td style="text-align: right; vertical-align: middle;" > CRO  </td>

	
		<td style="text-align: right; vertical-align: middle;" > Especialidade </td>
	
		<td style="text-align: right; vertical-align: middle; "> Endereco </td>
	
		<td style="text-align: right; vertical-align: middle; "> Selecionar </td>

	</tr>
	<c:set var="contTot" value="0"/>
		<c:set var="valorTot" value="0"/>
		<c:set var="qtde" value="1"/>
	
		<c:forEach var="dentista" items="${sessionScope.dentistas}">
			<tr>
				<td><center>${dentista.nome}</center></td>
				<td><center>${dentista.identificador}</center></td>
				<td><center>${dentista.dentista.especialidade} </center></td>
				<td><center>${dentista.dentista.endereco} </center></td>
				<td><center><input type="checkbox" name="dent" value="${dentista.identificador}"> </center></td>
			</tr>
		</c:forEach>
	</table>
	</form>

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
	
	