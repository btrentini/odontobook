<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	 <c:set var="usuario" value="${login}"/>
	<c:if test="${usuario == null || empty usuario }">
	
		<c:redirect url="/default.jsp"/>
	
	</c:if>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/estiloLivre.css" type="text/css" media="screen"  />
    <!--[if IE 6]><link rel="stylesheet" href="${pageContext.request.contextPath}/style.ie6.css" type="text/css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="$${pageContext.request.contextPath}/style.ie7.css" type="text/css" media="screen" /><![endif]-->
    
	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
	
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/script.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Dados Dente </title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/estiloLivre.css" type="text/css" media="screen"  />
    <!--[if IE 6]><link rel="stylesheet" href="${pageContext.request.contextPath}/style.ie6.css" type="text/css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="$${pageContext.request.contextPath}/style.ie7.css" type="text/css" media="screen" /><![endif]-->
</head>
<body>
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

<br></br>
	<p><a href="${pageContext.request.contextPath}/jsp/default.jsp"> <img src="${pageContext.request.contextPath}/img/l2.png"></img></a>
		<a href="${pageContext.request.contextPath}/jsp/Prognostico.jsp"> <img src="${pageContext.request.contextPath}/img/dentesBt.png"></img></a>
	<a href="${pageContext.request.contextPath}/jsp/logoff.ctrl"> <img src="${pageContext.request.contextPath}/img/l1.png"></img></a></p>	
<hr></hr>
<br />
<div id="dadosDente">
<table>
	<tr>
		<td width="100" style="text-align: right; vertical-align: middle; border: none;"></td>
		<td width="250" style="text-align: right; vertical-align: middle; border: none;"></td>
		 <c:if test="${perfil == 'dentista' }">	
		<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> <b>Dentista:</b> </td>
		
			<td style="border-top: none; border-left: none; border-right: none;"> ${sessionScope.login }</td>
		</c:if>

	</tr>
	<c:if test="${perfil == 'dentista' }">	
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;" ><b>Paciente: </b></td>
		<td style="border-top: none; border-left: none; border-right: none;">${sessionScope.cpfDoCara}</td>
	</tr>	
	</c:if>
	<c:if test="${perfil == 'paciente' }">	
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;" ><b>Paciente: </b></td>
		<td style="border-top: none; border-left: none; border-right: none;">${sessionScope.login}</td>
	</tr>	
	</c:if>
		<tr>
		<td style="text-align: right; vertical-align: middle; border: none;""><b>Dente: </b></td>
		<td style="border-top: none; border-left: none; border-right: none;">${sessionScope.numDente}</td>
	</tr>
</table>
<br><br>

<form method="get" id="customForm" action="gravarDadosDente.ctrl">
<table>

<tr>
	<td class="tituloTabela" width="150"> <center> Dado </center>  </td>
	<td class="tituloTabela" width="200">  <center> Descrição  </center> </td>
	
</tr>
		<c:if test="${perfil == 'dentista' }">	
			  <tr> 
			  <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Paciente </td>
			  <td>${sessionScope.cpfDoCara}</td>
			  </tr> 
		</c:if>
		<c:if test="${perfil == 'paciente' }">	
			  <tr> 
			  <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Paciente </td>
			  <td>${sessionScope.login}</td>
			  </tr> 
		</c:if>
		
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Numero do Dente</td><td>${sessionScope.numDente}</td> 	  
	  
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;">  Situacao </td>
	  <td><input type="text" id="situacaoPresente"
				name="situacaoPresente" class="areas2" maxlength="24" 
				value="${sessionScope.dadosDente.situacaoPresente}" <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;" /></td> 	 
	   
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Canal</td>
	  <td><input type="text" id="canal"
				name="canal" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.canal}"  /></td> 	 
	   
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> CAD</td>
	  <td><input type="text" id="CAD"
				name="CAD" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.CAD}"  /></td> 	  
	  
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> CTEX</td>
	  <td><input type="text" id="CTEX"
				name="CTEX" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.CTEX}"  /></td> 	  
	  
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> CTG</td>
	  <td><input type="text" id="CTG"
				name="CTG" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.CTG}"  /></td> 	  
	  
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> CTES</td>
	  <td><input type="text" id="CTES"
				name="CTES" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.CTES}"  /></td> 	 
	   
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> CRD</td>
	  <td><input type="text" id="CRD"
				name="CRD" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.CRD}"  /></td> 	  
	  
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> CT</td>
	  <td><input type="text" id="CT"
				name="CT" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.CT}"  /></td> 	 
	   
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Referencia</td>
	  <td><input type="text" id="referencia"
				name="referencia" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.referencia}"  /></td> 	  
	  
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Instrumento</td>
	  <td><input type="text" id="instrumento"
				name="instrumento" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.instrumento}"  /></td> 	 
	   
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Instrumento de Patencia</td>
	  <td><input type="text" id="instrumentoPatencia"
				name="instrumentoPatencia" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.instrumentoPatencia}"  /></td> 	  
	  
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> numDA</td>
	  <td><input type="text" id="numDA"
				name="numDA" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.numDA}"  /></td> 	  
	  
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> numDC</td>
	  <td><input type="text" id="numDC"
				name="numDC" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.numDC}"  /></td> 	 
	   
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> X</td>
	  <td><input type="text" id="X"
				name="X" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.incidenciaDoRX}"  /></td> 	 
	   
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Incidencia Do RX</td>
	  <td><input type="text" id="incidenciaDoRX"
				name="incidenciaDoRX" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.incidenciaDoRX}"  /></td> 	 

	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Cone Principal</td>
	  <td><input type="text" id="conePrincipal"
				name="conePrincipal" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.conePrincipal}"  /></td> 	  
	  
	  </tr> 
	  
	  <tr> <td class="tituloDados" style="text-align: right; vertical-align: middle;"> Cimento Obturador</td>
	  <td><input type="text" id="cimentoObturador"
				name="cimentoObturador" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.cimentoObturador}"  /></td> 	  
	  
	  </tr> 
	  
	  <tr><td class="tituloDados" style="text-align: right; vertical-align: middle;"> Tecnica Obturacao</td>
	  <td><input type="text" id="tecnicaObturacao"
				name="tecnicaObturacao" class="areas2" maxlength="24"  <c:if test="${perfil == 'paciente' }">	readonly </c:if> style="cursor: default;"
				value="${sessionScope.dadosDente.tecnicaObturacao}"  /></td> 	  
	  
	  </tr> 
	  <c:if test="${perfil == 'dentista' }">	
	 <tr>
	 <td>
			
			<INPUT TYPE="submit" name="acao" id="botao" value="Gravar" class="art-button" CHECKED />
		
		</td>
			</c:if>

	<tr>

</table>
</form>
</div>
</body>
</html>