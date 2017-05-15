
	

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<script src="${pageContext.request.contextPath}/jquery-1.3.2.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/script.js" type="text/javascript"></script>
		<script src="http://code.jquery.com/jquery-latest.js" type="text/javascript"></script> 
 		<script src="${pageContext.request.contextPath}/jquery.validate.js" type="text/javascript" type="text/javascript"></script>
 
 <c:set var="usuario" value="${login}"/>
	<c:if test="${usuario == null || empty usuario }">
	
		<c:redirect url="/default.jsp"/>
	
	</c:if>		
<script src="${pageContext.request.contextPath}/jquery.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/jquery.maskedinput.js" type="text/javascript"></script>
	

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

<script>
	jQuery(function($) {
		$("#dataInicio").mask("99/99/9999");
		$("#duracaoTratamentoEstimada").mask("9?999");
		$("#valorEstimadoTratamento").mask("R$9?99?.?999?,?99");
		$("#numeroConsultasEstimadas").mask("9?999");
		$("#numeroProntuario").mask("9?999");

	

	});
</script>
<br />
<!-- ============================================================================================================ -->
<!-- ======									AQUI COMEÇA O CONTEUDO!               						  ======= -->
<!-- ============================================================================================================ -->
	<br></br>
	<p><a href="${pageContext.request.contextPath}/jsp/default.jsp"> <img src="${pageContext.request.contextPath}/img/l2.png"></img></a>
	<a href="${pageContext.request.contextPath}/jsp/logoff.ctrl"> <img src="${pageContext.request.contextPath}/img/l1.png"></img></a></p>
	<hr></hr>
	<h3> ${resultado }</h3>
<h1> Solicitações de <font color="#000000">${sessionScope.login}</font>:  </h1> 

	<table class="tabelas">
		<tr class="tituloTabela"  height="30">
		<c:if test="${perfil == 'dentista' }">	
			<td style="text-align: center; vertical-align: middle; ">  Login do Paciente </td>
		</c:if>			
		<c:if test="${perfil == 'paciente' }">	
			<td style="text-align: center; vertical-align: middle; ">  Login do Dentista </td>
		</c:if>	
		<c:if test="${perfil == 'dentista' }">	
			<td style="text-align: center; vertical-align: middle; ">  Nome do Paciente </td>
		</c:if>			
		<c:if test="${perfil == 'paciente' }">	
			<td style="text-align: center; vertical-align: middle; ">  Nome do Dentista </td>
		</c:if>	
			<td style="text-align: center; vertical-align: middle; ">  Duracao Estimada do Tratamento  </td>
			<td style="text-align: center; vertical-align: middle; " > Valor Estimado do Tratamento</td>
			<td style="text-align: center; vertical-align: middle; ">  Numero de Consultas Estimadas </td>
			<td style="text-align: center; vertical-align: middle; ">  Prontuario </td>
			<td style="text-align: center; vertical-align: middle; ">  Data Inicio </td>
<c:if test="${perfil == 'dentista' }">	
			<td style="text-align: center; vertical-align: middle; ">  Ação </td>
		</c:if>	
		</tr>
		 <c:set var="teste" value="${sessionScope.permissoes}"/>
		<c:if test="${teste == null || empty teste }">
			<c:if test="${perfil == 'dentista' }">	
      			 <td colspan="7" width="200px"> <center>  <h3> <font color="red"> Você ainda não tem tratamentos... </font></h3> </center></td>	
			</c:if>
			<c:if test="${perfil == 'paciente' }">	
      			 <td colspan="6" width="200px"> <center>  <h3> <font color="red"> Você ainda não tem tratamentos... </font></h3> </center></td>	
			</c:if>
		</c:if>
		
			<c:set var="cont" value="0"/>
		
		
		<c:forEach var="permissao" items="${sessionScope.permissoes}">	
		
		<form method="post" id="customForm${cont}" name="customForm${cont}" action="gravarTratamento.ctrl">	
		<input type="text" name="nomePaciente${cont}" hidden value="${permissao.paciente.pessoa.login}"></input>
		<input type="text" name="contador" hidden value="${cont}"/>
			<tr>
						<c:if test="${perfil == 'dentista' }">	
			<td style="text-align: right; vertical-align: middle; ">${permissao.paciente.pessoa.login}	</td>
				
				
				</c:if>
				
				<c:if test="${perfil == 'paciente' }">	
			<td style="text-align: right; vertical-align: middle; ">${permissao.dentista.pessoa.login}</td>	
				</c:if>
			
			<c:if test="${perfil == 'dentista' }">	
			<td style="text-align: right; vertical-align: middle; ">${permissao.paciente.pessoa.nome}</td>
				
				
				</c:if>
				
				<c:if test="${perfil == 'paciente' }">	
			<td style="text-align: right; vertical-align: middle; ">${permissao.dentista.pessoa.nome}</td>	
				</c:if>
				<td style="text-align: right; vertical-align: middle; ">
					<input type="text" id="duracaoTratamentoEstimada" 
					name="duracaoTratamentoEstimada"  
					value="${permissao.duracaoTratamentoEstimada}" 
					<c:if test="${perfil == 'paciente' }">	 readonly="readonly" </c:if>/></td>
				

				<td style="text-align: right; vertical-align: middle; ">
					<input type="text"  id="valorEstimadoTratamento" name="valorEstimadoTratamento"  value="${permissao.valorEstimadoTratamento}" <c:if test="${perfil == 'paciente' }">	 readonly="readonly"  </c:if>/></td>
				
				
				<td style="text-align: right; vertical-align: middle; ">
					<input type="text" id="numeroConsultasEstimadas" name="numeroConsultasEstimadas"  value="${permissao.numeroConsultasEstimadas}" <c:if test="${perfil == 'paciente' }">	 readonly="readonly" </c:if>/></td>		
				

				<td style="text-align: right; vertical-align: middle; ">
					<input type="text" id="numeroProntuario" name="numeroProntuario"  value="${permissao.numeroProntuario}" <c:if test="${perfil == 'paciente' }">	 readonly="readonly" </c:if> /></td>
				
				<td style="text-align: right; vertical-align: middle; ">
					<input type="text" id="dataInicio" name="dataInicio"  value="${permissao.dataInicio}" <c:if test="${perfil == 'paciente' }">	 readonly="readonly" </c:if>/></td>
				<c:if test="${perfil == 'dentista' }">	
					<td style="text-align: right; vertical-align: middle; ">
							<INPUT TYPE="submit" name="acao" id="botao" value="Gravar" class="art-button" CHECKED onclick="document.forms['customForm${cont}'].submit()" /></td>
				</c:if>
	
				
			</tr>
			</form>
			<c:set var="cont" value="${cont + 1}"/>
	</c:forEach>

	</table>




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
	
	