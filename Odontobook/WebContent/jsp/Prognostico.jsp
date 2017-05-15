

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<script src="${pageContext.request.contextPath}/jquery-1.3.2.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/script.js" type="text/javascript"></script>
		<script src="http://code.jquery.com/jquery-latest.js" type="text/javascript"></script> 
 		<script src="${pageContext.request.contextPath}/jquery.validate.js" type="text/javascript" type="text/javascript"></script>
 
		
<script src="${pageContext.request.contextPath}/jquery.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/jquery.maskedinput.js" type="text/javascript"></script>
	
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
<script >

$(document).ready(function() { 
	
	$('.dente').hover(
			
			function(){
				$(this).animate({opacity: ".1"}, 50);				
			}, 
			function(){
				$(this).animate({opacity: "1.0"}, 100);					
			}		
			);
	
	$('.dente').click(function() {
		
		var txt = $(this).attr('alt');
		
		$("#selecionarDenteEndodontia").val(txt);
		$("#selecionarDenteDados").val(txt);
		$("#selecionarDenteDados2").val(txt);
		$("#selecionarDenteDados3").val(txt);
		$("#campoDente").val(txt);
		$("#tituloDente").text("Dente #" + txt);
	  	$("#hidden").show();
		
		
	});
	 }); 



</script>
	<script>
				jQuery(function($){
					   $("#dataEndodontia").mask("99/9999" );
					
					});
			</script>
<br />
<!-- ============================================================================================================ -->
<!-- ======									AQUI COMEÇA O CONTEUDO!               						  ======= -->
<!-- ============================================================================================================ -->
	<br></br>
	<table>
		<tr>
	<td style="text-align: right; vertical-align: middle; border: none;"><a href="${pageContext.request.contextPath}/jsp/default.jsp"> <img src="${pageContext.request.contextPath}/img/l2.png"></img></a></td>
	<c:if test="${perfil == 'dentista' }">	
	<td style="text-align: right; vertical-align: middle; border: none;"><a href="buscarPacientes.brun"> <img src="${pageContext.request.contextPath}/img/visuPacientes.png"></img></a></td>
	</c:if>
	<td style="text-align: right; vertical-align: middle; border: none;"><a href="${pageContext.request.contextPath}/jsp/logoff.ctrl"> <img src="${pageContext.request.contextPath}/img/l1.png"></img></a></p></td>
		
		</tr>
	
	</table>

	<hr></hr>
	<h3> ${resultado }</h3>
	<table>
	<tr>
		<td width="100" style="text-align: right; vertical-align: middle; border: none;"></td>
		<td width="250" style="text-align: right; vertical-align: middle; border: none;"></td>
	<c:if test="${perfil == 'dentista' }">	
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;"> <b>Dentista:</b> </td>
		<td style="border-top: none; border-left: none; border-right: none;"> ${sessionScope.login} </td>
	</tr>
	</c:if>
	<c:if test="${perfil == 'dentista' }">	
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;" ><b>Paciente: </b></td>
		<td style="border-top: none; border-left: none; border-right: none;"> ${sessionScope.cpfDoCara } </td></tr>

	</c:if>
	<c:if test="${perfil == 'paciente' }">	
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;" ><b>Paciente: </b></td>
		<td style="border-top: none; border-left: none; border-right: none;"> ${sessionScope.login } </td></tr>

	</c:if>

</table>
<br><br>
	<table>
	<input type="text" name="campoDente" id="campoDente" hidden />
		<tr>
			<form method="post" id="customForm" action="pegaDent.ctrl">
				<input type="hidden" value="18"  name="getit">
				
			</form>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/18.png" width="54"  name="denteSelecionado" alt="18" ></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/17.png" width="54"  name="denteSelecionado" alt="17"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/16.png" width="54"  name="denteSelecionado" alt="16"></img></a></td>		
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/15.png" width="54"  name="denteSelecionado" alt="15"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/14.png" width="54"  name="denteSelecionado" alt="14"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/13.png" width="54"  name="denteSelecionado" alt="13"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/12.png" width="54"  name="denteSelecionado" alt="12"></img></a></td>		
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/11.png" width="54"  name="denteSelecionado" alt="11"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/21.png" width="54"  name="denteSelecionado" alt="21"> </img></a></td>		
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/22.png" width="54"  name="denteSelecionado" alt="22"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/23.png" width="54"  name="denteSelecionado" alt="23"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/24.png" width="54"  name="denteSelecionado" alt="24"></img></a></td>		
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/25.png" width="54"  name="denteSelecionado" alt="25"></img></a></td>	
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/26.png" width="54"  name="denteSelecionado" alt="26"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/27.png" width="54"  name="denteSelecionado" alt="27"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/28.png" width="54"  name="denteSelecionado" alt="28"></img></a></td>		
							
		</tr>
		<tr>
			<td class="tituloTabela"><center>18</center></td>
			<td class="tituloTabela"><center>17</center></td>
			<td class="tituloTabela"><center>16</center></td>
			<td class="tituloTabela"><center>15</center></td>
			<td class="tituloTabela"><center>14</center></td>
			<td class="tituloTabela"><center>13</center></td>
			<td class="tituloTabela"><center>12</center></td>
			<td class="tituloTabela"><center>11</center></td>
			<td class="tituloTabela"><center>21</center></td>
			<td class="tituloTabela"><center>22</center></td>
			<td class="tituloTabela"><center>23</center></td>
			<td class="tituloTabela"><center>24</center></td>
			<td class="tituloTabela"><center>25</center></td>
			<td class="tituloTabela"><center>26</center></td>
			<td class="tituloTabela"><center>27</center></td>
			<td class="tituloTabela"><center>28</center></td>				
		</tr>
		<tr>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/38.png" width="54"  name="denteSelecionado" alt="38"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/37.png" width="54"  name="denteSelecionado" alt="37"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/36.png" width="54"  name="denteSelecionado" alt="36"></img></a></td>		
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/35.png" width="54"  name="denteSelecionado" alt="35"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/34.png" width="54"  name="denteSelecionado" alt="34"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/33.png" width="54"  name="denteSelecionado" alt="33"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/32.png" width="54"  name="denteSelecionado" alt="32"></img></a></td>		
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/31.png" width="54"  name="denteSelecionado" alt="31"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/41.png" width="54"  name="denteSelecionado" alt="41"></img></a></td>		
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/42.png" width="54"  name="denteSelecionado" alt="42"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/43.png" width="54"  name="denteSelecionado" alt="43"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/44.png" width="54"  name="denteSelecionado" alt="44"></img></a></td>		
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/45.png" width="54"  name="denteSelecionado" alt="45"></img></a></td>	
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/46.png" width="54"  name="denteSelecionado" alt="46"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/47.png" width="54"  name="denteSelecionado" alt="47"></img></a></td>
			<td><a href="#"><img class="dente" src="${pageContext.request.contextPath}/img/dentes/48.png" width="54"  name="denteSelecionado" alt="48"></img></a></td>									
		</tr>
		<tr>
			<td class="tituloTabela"><center>38</center></td>
			<td class="tituloTabela"><center>37</center></td>
			<td class="tituloTabela"><center>36</center></td>
			<td class="tituloTabela"><center>35</center></td>
			<td class="tituloTabela"><center>34</center></td>
			<td class="tituloTabela"><center>33</center></td>
			<td class="tituloTabela"><center>32</center></td>
			<td class="tituloTabela"><center>31</center></td>
			<td class="tituloTabela"><center>41</center></td>
			<td class="tituloTabela"><center>42</center></td>
			<td class="tituloTabela"><center>43</center></td>
			<td class="tituloTabela"><center>44</center></td>
			<td class="tituloTabela"><center>45</center></td>
			<td class="tituloTabela"><center>46</center></td>
			<td class="tituloTabela"><center>47</center></td>
			<td class="tituloTabela"><center>48</center></td>				
		</tr>
	</table>
<br></br>
<!-- -------------------------------------------------------------------------------------------------------------- -->


<div id="hidden" style="display: none;">

<table>
<tr>

		<td width="500" style="border: none;"></td>

</tr>
<tr>
	<td style="text-align: left; vertical-align: middle;" colspan="2"><center><font color="#990000" size="5"><p id="tituloDente"></p></center></font></td>
</tr>
<!--  BOTAO PARA EXIBIR DADOS DO DENTE -->
<tr>
		<form method="post" id="customForm" action="dadosDente.ctrl">
					<td height="30">
						<input type="text" name="selecionarDenteDados" id="selecionarDenteDados" hidden />
						<INPUT TYPE="submit" name="acao"  class="botaoDadosDente"  value=""/>
					</td>
		</form>
		</tr>
						
	
		 <tr>
		 	<form method="post" id="customForm" action="pegaDent.ctrl">
					<td height="35">
						<input type="text" name="selecionarDenteDados3" id="selecionarDenteDados3" hidden  />
								<INPUT TYPE="submit" name="acao"  class="botaoPegaDados"  value=""/>
					</td>
		 </form>
	</tr>
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
	
	