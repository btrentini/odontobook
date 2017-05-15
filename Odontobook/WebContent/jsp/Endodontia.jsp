
	

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
<script language="javascript">
function bustOut(){
	

   
}

window.onLoad = bustOut; //this should work but often doesn't. Lack of parens () is correct.
</script>



</head>
<!-- ============================================================================================================ -->
<!-- ======									NAO MEXA DAQUI PRA BAIXO!              						  ======= -->
<!-- ============================================================================================================ -->
<body onLoad="bustOut()" >


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
	<a href="${pageContext.request.contextPath}/jsp/Prognostico.jsp"> <img src="${pageContext.request.contextPath}/img/dentesBt.png"></img></a>
	<a href="${pageContext.request.contextPath}/jsp/logoff.ctrl"> <img src="${pageContext.request.contextPath}/img/l1.png"></img></a></p>
	<hr></hr>
	
<p> ${resultado }</p>
<h3> Editar - Endodontia do Paciente</h3>

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
	  <tr> 
			<td style="text-align: right; vertical-align: middle; border: none;" ><b>Dente: </b></td>
		  <td>${sessionScope.numDente}</td> 	  
	  
	  </tr> 
	  
</table>
<br></br>
<div id="principal">
<!--  DADOS GERAIS DO PROGNOSTICO -->
<form method="post" id="customForm" action="alterarPrognostico.ctrl">
	<table style="text-align: center; text-indent: 3px;" class="tabelaAnamnese">
		<tr>
			<td width="200" style="border: none;"></td>
			<td width="100" style="border: none;"></td>
			<td width="200" style="border: none;"></td>
			<td width="100" style="border: none;"></td>
		</tr>
		<tr>
			<td colspan="4">
			<input type="text" name="selecionarDenteDados2" id="selecionarDenteDados2" value="${sessionScope.numDente }"hidden />
				<h4>
				<center> Constatações Endodônticas do Dentista.</center>
				</h4>
			</td>
		</tr>
		
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			sondagemGengival</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.sondagemGen} name="sondagemGengival" id="sondagemGengival" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			grauMobilidade</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.grauMobilid} name="grauMobilidade" id="grauMobilidade" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			exposicaoClinicaFurca</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.exposicaoCl}
				name="exposicaoClinicaFurca" id="exposicaoClinicaFurca" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			retracaoGengival</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.retracaoGen}
				name="retracaoGengival" id="retracaoGengival" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			dorPerussaoVertical</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.dorPerussao}
				name="dorPerussaoVertical" id="dorPerussaoVertical" /> <span/><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			dorPercussaoHorizontal</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.dorPercussa}
				name="dorPercussaoHorizontal" id="dorPercussaoHorizontal" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			dorPalpacaoApical</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.dorPalpacao}
				name="dorPalpacaoApical" id="dorPalpacaoApical" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			presencaDor</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.presencaDor}
				name="presencaDor" id="presencaDor" /><span><span><b></b></span></span></td>
	
	
		</tr>
	
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			esemiaExtraOral</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.esemiaExtra}
				name="esemiaExtraOral" id="esemiaExtraOral" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			carie</td>
			<td style="border: none;"><input type="checkbox" name="carie" ${sessionScope.dadosEndodontia.carie}
				id="carie" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			corCoroaAlterada</td> 
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.corCoroaAlt}
				name="corCoroaAlterada" id="corCoroaAlterada" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			coroaProtetica</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.coroaProtet}
				name="coroaProtetica" id="coroaProtetica" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			exposicaoPulpar</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.exposicaoPu}
				name="exposicaoPulpar" id="exposicaoPulpar" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			fistula</td>
			<td style="border: none;"><input type="checkbox" name="fistula" ${sessionScope.dadosEndodontia.fistula}
				id="fistula" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			fraturaCoroa</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.fraturaCoro}
				name="fraturaCoroa" id="fraturaCoroa" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			luxacaoDental</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.luxacaoDent}
				name="luxacaoDental" id="luxacaoDental" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			restauracao</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.restauracao}
				name="restauracao" id="restauracao" /><span><span><b></b></span></span></td>
		
			<td style="text-align: left; vertical-align: middle; border: none;">
			traumaOclusal</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.traumaOclusal}
				name="traumaOclusal" id="traumaOclusal" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			outrosSinaisClinicos</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.outrosSinaiCli}
				name="outrosSinaisClinicos" id="outrosSinaisClinicos" /><span><span><b></b></span></span></td>
		
			<td style="text-align: left; vertical-align: middle; border: none;">
			carieCoroa</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.carieCoroa}
				name="carieCoroa" id="carieCoroa" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			carieRaiz</td>
			<td style="border: none;"><input type="checkbox" name="carieRaiz" ${sessionScope.dadosEndodontia.carieRaiz}
				id="carieRaiz" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			calcificacaoCanal</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.calcificaca}
				name="calcificacaoCanal" id="calcificacaoCanal" /><span><span><b></b></span></span></td>
		</tr>
	
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			noduloPulpar</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.noduloPulpa}
				name="noduloPulpar" id="noduloPulpar" /><span><span><b></b></span></span></td>
			<td style="text-align: left; vertical-align: middle; border: none;">
			canaisObturados</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.canaisObtur}
				name="canaisObturados" id="canaisObturados" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			sobreObturacao</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.sobreObtura}
				name="sobreObturacao" id="sobreObturacao" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			instrumentoFraturado</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.instrumento}
				name="instrumentoFraturado" id="instrumentoFraturado" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			espessamentoPeriodontalApical</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.espessamenAPIC}
				name="espessamentoPeriodontalApical"
				id="espessamentoPeriodontalApical" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			espessamentoPeriodontalLateral</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.espessament}
				name="espessamentoPeriodontalLateral"
				id="espessamentoPeriodontalLateral" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			nucleoMetalico</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.nucleoMetal}
				name="nucleoMetalico" id="nucleoMetalico" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			perficacaoRadicular</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.perficacaoR}
				name="perficacaoRadicular" id="perficacaoRadicular" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			pulpotomia</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.pulpotomia}
				name="pulpotomia" id="pulpotomia" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			lesaoPeriodontalLateral</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.lesaoPeriaLATE}
				name="lesaoPeriodontalLateral" id="lesaoPeriodontalLateral"
				/><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			lesaoPeriapical</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.lesaoPeriod}
				name="lesaoPeriapical" id="lesaoPeriapical" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">
			hipercrementose</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.hipercremen}
				name="hipercrementose" id="hipercrementose" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			reabsorcaoExtremaCervical</td> 
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.reabsorcaoE}
				name="reabsorcaoExtremaCervical" id="reabsorcaoExtremaCervical"
				/><span><span><b></b></span></span></td>
		
			<td style="text-align: left; vertical-align: middle; border: none;">
			reabsorcaoInterna</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.reabsorcaoI}
				name="reabsorcaoInterna" id="reabsorcaoInterna" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			lesaoFurca</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.lesaoFurca}
				name="lesaoFurca" id="lesaoFurca" /><span><span><b></b></span></span></td>
		
			<td style="text-align: left; vertical-align: middle; border: none;">
			raizCurva</td> 
			<td style="border: none;"><input type="checkbox" name="raizCurva" ${sessionScope.dadosEndodontia.raizCurva}
				id="raizCurva" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			raizDelgada</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.raizDelgada}
				name="raizDelgada" id="raizDelgada" /><span><span><b></b></span></span></td>
		
			<td style="text-align: left; vertical-align: middle; border: none;">
			rizogeneseIncompleta</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.rizogeneseI}
				name="rizogeneseIncompleta" id="rizogeneseIncompleta" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			densidadeDente</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.densidadeDe}
				name="densidadeDente" id="densidadeDente" /><span><span><b></b></span></span></td>
		
			<td style="text-align: left; vertical-align: middle; border: none;">
			fraturaRaiz</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.fraturaRaiz}
				name="fraturaRaiz" id="fraturaRaiz" /><span><span><b></b></span></span></td>
		</tr>
	
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			outrosSinaisRadiograficos</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.outrosSinai}
				name="outrosSinaisRadiograficos" id="outrosSinaisRadiograficos"
				/><span><span><b></b></span></span></td>
		
			<td style="text-align: left; vertical-align: middle; border: none;">
			polpaNormal</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.polpaNormal}
				name="polpaNormal" id="polpaNormal" /><span><span><b></b></span></span></td>
		</tr>
	
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">
			pulpiteAgudaReversivel</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.pulpiteAguREVER}
				name="pulpiteAgudaReversivel" id="pulpiteAgudaReversivel" /><span><span><b></b></span></span></td>
		
			<td style="text-align: left; vertical-align: middle; border: none;">
			pulpiteAgudaReversibilidadeDuvidosa</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.pulpiteAgud}
				name="pulpiteAgudaReversibilidadeDuvidosa"
				id="pulpiteAgudaReversibilidadeDuvidosa" /><span><span><b></b></span></span></td>
		</tr>
	
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">lesaoEndoPeriodontal</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.lesaoEndoPe}
				name="lesaoEndoPeriodontal" id="lesaoEndoPeriodontal" /><span><span><b></b></span></span></td>
		
			<td style="text-align: left; vertical-align: middle; border: none;">
			pulpiteCronicaHiperplastica</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.pulpiteCron}
				name="pulpiteCronicaHiperplastica" id="pulpiteCronicaHiperplastica"
				/><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">necrosePulpar</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.necrosePulp}
				name="necrosePulpar" id="necrosePulpar" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">pericementiteApicalAguda</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.pericementi}
				name="pericementiteApicalAguda" id="pericementiteApicalAguda"
				/><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">abcessoDentoAlveolarAgudoFaseInicial</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.abcessoDINI}
				name="abcessoDentoAlveolarAgudoFaseInicial"
				id="abcessoDentoAlveolarAgudoFaseInicial" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">abcessoDentoAlveolarAgudoFaseEvolucao</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.abcessoDenEVOt}
				name="abcessoDentoAlveolarAgudoFaseEvolucao"
				id="abcessoDentoAlveolarAgudoFaseEvolucao" /><span><span><b></b></span></span></td>
		</tr>
	
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">abcessoDentoAlveolarAgudoFaseEvoluida</td>
			<td style="border: none;"><input type="checkbox"
				name="abcessoDentoAlveolarAgudoFaseEvoluida" ${sessionScope.dadosEndodontia.abcessoDent}
				id="abcessoDentoAlveolarAgudoFaseEvoluida" /><span><span><b></b></span></span></td>
	
			<td style="text-align: left; vertical-align: middle; border: none;">lesaoPeriapicalCronicaCircunscrita</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.lesaoPeriapCIRCUN}
				name="lesaoPeriapicalCronicaCircunscrita"
				id="lesaoPeriapicalCronicaCircunscrita" /><span><span><b></b></span></span></td>
		</tr>
		<tr>
			<td style="text-align: left; vertical-align: middle; border: none;">lesaoPeriapicalCronicaDifusa</td>
			<td style="border: none;"><input type="checkbox" ${sessionScope.dadosEndodontia.lesaoPeriap}
				name="lesaoPeriapicalCronicaDifusa" id="lesaoPeriapicalCronicaDifusa"
				/><span><span><b></b></span></span></td>
	

		</tr>
	

</table>
		<c:if test="${perfil == 'dentista' }">	
			<p><input type="submit" name="acao" id="botao" value="Gravar" class="art-button"  /></p>
		</c:if>
</form>



<!--  FIM DA TABELA LAYOUT PROGNOSTICO -->
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
	
	