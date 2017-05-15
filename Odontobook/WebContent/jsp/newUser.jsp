
	

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<script src="${pageContext.request.contextPath}/jquery-1.3.2.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/script.js" type="text/javascript"></script>
		<script src="http://code.jquery.com/jquery-latest.js" type="text/javascript"></script> 
 		<script src="${pageContext.request.contextPath}/jquery.validate.js" type="text/javascript" type="text/javascript"></script>

<script src="${pageContext.request.contextPath}/jquery.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/jquery.maskedinput.js" type="text/javascript"></script>
			<script>
				jQuery(function($){
					   $("#cpf").mask("999.999.999-99" ,{placeholder:" "});
					   $("#cro").mask("CRO-aa-999?.999",{placeholder:" "});
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
	<script>
	function validateForm()
	{		
		var login=document.forms["Form"]["login"].value;
		var senha=document.forms["Form"]["senha"].value;
		var senha2=document.forms["Form"]["senha2"].value;
		var cpf=document.forms["Form"]["cpf"].value;
		var cro=document.forms["Form"]["cro"].value;
		var perfil=document.forms["Form"]["perfil"].value;
		
		if (login==null || login=="")
		 {
			 document.getElementById('valida').innerHTML="<b><font color='red'>O campo Login é Obrigatório!</font></b>";	
		 	 return false;
		 }else
		if(senha != senha2)
		{
			document.getElementById('valida').innerHTML="<b><font color='red'>Senhas devem ser iguais </font></b>";	
		 	 return false;
		}else
		if (senha==null || senha=="")
		 {
			 document.getElementById('valida').innerHTML="<b><font color='red'>O campo Senha é Obrigatório!</font></b>";	
		 	 return false;
		 }else
		if (senha2==null || senha=="")
		 {
			 document.getElementById('valida').innerHTML="<b><font color='red'> Verifique se as duas senhas são iguais! </font></b>";	
		 	 return false;
		 }else
		if (cro==null || senha=="")
		 {
			 document.getElementById('valida').innerHTML="<b><font color='red'>O campo Senha é Obrigatório!</font></b>";	
		 	 return false;
		 }else
		{
			 	document.getElementById('valida').innerHTML="";
			 	return true;
		}
		
	}
	
	
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
	<p><a href="${pageContext.request.contextPath}/jsp/default.jsp"> <img src="${pageContext.request.contextPath}/img/l2.png"></img> </a>
	<hr></hr>


	
	<form method="get" id="Form" action="newUser.ctrl" >
	<c:set var="resultado" value="${resultado}"/>
				<h1> Novo Usuário: </h1>
				<c:choose>
					  <c:when test="${resultado != null || not empty resultado }">
					   	<p> ${resultado }</p>
					  </c:when>
					  <c:otherwise>
					    <p id="valida"> </p>
					  </c:otherwise>
				</c:choose>
							
				<p> Login:  
					<input type="text"  onblur="return validateForm()"   id="login" class="areas" name="login"  MAXLENGTH="16" value="${param.login }"/> </p>
				
				<p> Senha :
					 <input type="password"  id="senha" name="senha" class="areas"  MAXLENGTH="16" /> </p>
				
				<p> Confirmar Senha : 
					<input type="password"  onchange="return validateForm()"   id="senha2" name="senha2" class="areas"  MAXLENGTH="16" /> </p>
				
				<p> Como você se define? 
					<input type="radio" name="perfil" value="1" checked="checked"  />  Paciente | <input type="radio" name="perfil" value="2" uncheck />    Dentista 
				</p>
						<font color="#990000"> Você não poderá alterar a opcção acima. Nunca mais!!</font>
			
					<div id="myRadioGroup">     
						 <div id="Perfil1" class="desc" >        
							<p> CPF: <em>*</em><input onblur="return validateForm()"  type="text" id="cpf" name="cpf" class="areas" /></p> 
						 </div>    
						 <div id="Perfil2" class="desc" style="display: none;">         
							<p> CRO: <em>*</em><input onblur="return validateForm()"  type="text" id="cro" name="cro" class="areas" />    </p>  
						 </div> 
					</div>
					
				<p><INPUT TYPE="submit" name="acao" id="botao" value="Gravar" class="art-button" CHECKED />
				
	
	</form>
	




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
	
	