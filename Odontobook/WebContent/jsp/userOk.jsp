<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	

    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/estiloLivre.css" type="text/css" media="screen"  />
    <!--[if IE 6]><link rel="stylesheet" href="${pageContext.request.contextPath}/style.ie6.css" type="text/css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="$${pageContext.request.contextPath}/style.ie7.css" type="text/css" media="screen" /><![endif]-->
    
	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
	
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/script.js"></script>


				
 <c:set var="usuario" value="${login}"/>
	<c:if test="${usuario == null || empty usuario }">
	
		<c:redirect url="/default.jsp"/>
	
	</c:if>

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
	<p><a href="${pageContext.request.contextPath}/jsp/default.jsp"> <img src="${pageContext.request.contextPath}/img/l2.png"></img></a>
	<a href="${pageContext.request.contextPath}/jsp/logoff.ctrl"> <img src="${pageContext.request.contextPath}/img/l1.png"></img></a></p>	

<div id="principal">
		
<p> ${resultado }</p>
<table>
	<tr>
		<td width="100" style="text-align: right; vertical-align: middle; border: none;"></td>
		<td width="250" style="text-align: right; vertical-align: middle; border: none;"></td>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> <font color="black"><b>Usuário:</b> </font></td>
		<td style="border-top: none; border-left: none; border-right: none;">${sessionScope.login}</td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;" > <font color="black"><b>Perfil: </b> </font></td>
		<td style="border-top: none; border-left: none; border-right: none;">${sessionScope.perfil}</td>
	</tr>
</table>
<hr></hr>
<table>
	<tr><td style="text-align: right; vertical-align: middle; border: none;"><p><a href="${pageContext.request.contextPath}/jsp/editarPerfil.jsp"> Editar Perfil </a> </p></td>
		<td style="text-align: left; vertical-align: middle; border: none;">Editar suas opções pessoais.</td></tr>
		<tr><td style="text-align: right; vertical-align: middle; border: none;"><p><a href="solicitacoesPendentes.brun"> Tratamentos </a> </p></td>
		<td style="text-align: left; vertical-align: middle; border: none;">Visualizar Tratamentos.</td></tr>
<!-- ============================================================================================================ -->
<!-- ======									OPCOES PARA DENTISTA                 						  ======= -->
<!-- ============================================================================================================ -->	
<c:set var="usuario" value="${perfil}"/>

	<c:if test="${perfil == 'dentista' }">	

		<tr><td style="text-align: right; vertical-align: middle; border: none;"><p><a href="buscarPacientes.brun"> Pacientes </a> </p></td>
			<td style="text-align: left; vertical-align: middle; border: none;"> Visualizar lista de Pacientes e editar opções.</td></tr>
	</c:if>
<c:set var="usuario" value="${perfil}"/>
<!-- ============================================================================================================ -->
<!-- ======									OPCOES PARA PACIENTE                 						  ======= -->
<!-- ============================================================================================================ -->
<c:if test="${perfil == 'paciente' }">

		
		<tr><td style="text-align: right; vertical-align: middle; border: none;"><p><a href="recuperarAnamnese.brun"> Minha Anamnese </a> </p></td>
			<td style="text-align: left; vertical-align: middle; border: none;">Atualizar dados clínicos.</td></tr>
		
		<tr><td style="text-align: right; vertical-align: middle; border: none;"><p><a href="buscarDentistas.brun"> Buscar Dentistas </a> </p></td>
			<td style="text-align: left; vertical-align: middle; border: none;"> Adicione dentistas as suas permissões</td></tr>
		
		<tr><td style="text-align: right; vertical-align: middle; border: none;"><p><a href="${pageContext.request.contextPath}/jsp/Prognostico.jsp""> Prognóstico </a> </p></td>
			<td style="text-align: left; vertical-align: middle; border: none;"> Visualizar prognóstico.</td></tr>
	</c:if>

</table>

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

