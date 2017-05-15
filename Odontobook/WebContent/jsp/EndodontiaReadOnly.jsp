
	

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
					   $("#dataEndodontia").mask("99/9999" );
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
	<a href="${pageContext.request.contextPath}/jsp/Prognostico.jsp"> <img src="${pageContext.request.contextPath}/img/dentesBt.png"></img></a>
	<a href="${pageContext.request.contextPath}/jsp/logoff.ctrl"> <img src="${pageContext.request.contextPath}/img/l1.png"></img></a></p>
	<hr></hr>
	

<h3> Visualizar - Endodontia do Paciente</h3>

<table>
	<tr>
		<td width="100" style="text-align: right; vertical-align: middle; border: none;"></td>
		<td width="250" style="text-align: right; vertical-align: middle; border: none;"></td>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;" ><b>Paciente: </b></td>
		<td style="border-top: none; border-left: none; border-right: none;"></td>
	</tr>
		<tr>
		<td style="text-align: right; vertical-align: middle; border: none;""><b>Dente: </b></td>
		<td style="border-top: none; border-left: none; border-right: none;"></td>
	</tr>
</table>
<br></br>
<div id="principal">

<form method="post" id="customForm" action="alterarAnamneseClinica.ctrl">
<table style="text-align: center; text-indent: 3px;"
	class="tabelaAnamnese">
	<tr>
		<td width="400" style="border: none;"></td>
		<td width="400" style="border: none;"></td>
	</tr>
	<tr>
		<td colspan="2">
		<h4>
		<center> Constatações Endodônticas do Dentista.</center>
		</h4>
		</td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		dataEndodontia</td>
		<td style="border: none;"><input type="text" disabled
			name="dataEndodontia" id="dataEndodontia"><span><b>(MM/AAAA)</b></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		presencaDor</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="presencaDor" id="presencaDor" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		sondagemGengival</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="sondagemGengival" id="sondagemGengival" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		grauMobilidade</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="grauMobilidade" id="grauMobilidade" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		exposicaoClinicaFurca</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="exposicaoClinicaFurca" id="exposicaoClinicaFurca" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		retracaoGengival</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="retracaoGengival" id="retracaoGengival" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		dorPerussaoVertical</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="dorPerussaoVertical" id="dorPerussaoVertical" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		dorPercussaoHorizontal</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="dorPercussaoHorizontal" id="dorPercussaoHorizontal" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		dorPalpacaoApical</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="dorPalpacaoApical" id="dorPalpacaoApical" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		testesSensibilidadePulparUtilizado</td>
		<td style="border: none;"><input type="text" disabled
			name="testesSensibilidadePulparUtilizado"
			id="testesSensibilidadePulparUtilizado"></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		edemiaIntraBucal</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="edemiaIntraBucal" id="edemiaIntraBucal" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		esemiaExtraOral</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="esemiaExtraOral" id="esemiaExtraOral" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		carie</td>
		<td style="border: none;"><input type="checkbox"  disabled  name="carie"
			id="carie" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		corCoroaAlterada</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="corCoroaAlterada" id="corCoroaAlterada" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		coroaProtetica</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="coroaProtetica" id="coroaProtetica" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		exposicaoPulpar</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="exposicaoPulpar" id="exposicaoPulpar" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		fistula</td>
		<td style="border: none;"><input type="checkbox"  disabled  name="fistula"
			id="fistula" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		fraturaCoroa</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="fraturaCoroa" id="fraturaCoroa" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		luxacaoDental</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="luxacaoDental" id="luxacaoDental" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		restauracao</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="restauracao" id="restauracao" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		traumaOclusal</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="traumaOclusal" id="traumaOclusal" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		outrosSinaisClinicos</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="outrosSinaisClinicos" id="outrosSinaisClinicos" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		carieCoroa</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="carieCoroa" id="carieCoroa" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		carieRaiz</td>
		<td style="border: none;"><input type="checkbox"  disabled  name="carieRaiz"
			id="carieRaiz" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		calcificacaoCanal</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="calcificacaoCanal" id="calcificacaoCanal" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		noduloPulpar</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="noduloPulpar" id="noduloPulpar" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		canaisObturados</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="canaisObturados" id="canaisObturados" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		sobreObturacao</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="sobreObturacao" id="sobreObturacao" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		instrumentoFraturado</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="instrumentoFraturado" id="instrumentoFraturado" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		espessamentoPeriodontalApical</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="espessamentoPeriodontalApical"
			id="espessamentoPeriodontalApical" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		espessamentoPeriodontalLateral</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="espessamentoPeriodontalLateral"
			id="espessamentoPeriodontalLateral" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		nucleoMetalico</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="nucleoMetalico" id="nucleoMetalico" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		perficacaoRadicular</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="perficacaoRadicular" id="perficacaoRadicular" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		pulpotomia</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="pulpotomia" id="pulpotomia" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		lesaoPeriodontalLateral</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="lesaoPeriodontalLateral" id="lesaoPeriodontalLateral"
			value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		lesaoPeriapical</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="lesaoPeriapical" id="lesaoPeriapical" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		hipercrementose</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="hipercrementose" id="hipercrementose" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		reabsorcaoExtremaCervical</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="reabsorcaoExtremaCervical" id="reabsorcaoExtremaCervical"
			value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		reabsorcaoInterna</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="reabsorcaoInterna" id="reabsorcaoInterna" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		lesaoFurca</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="lesaoFurca" id="lesaoFurca" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		raizCurva</td>
		<td style="border: none;"><input type="checkbox"  disabled  name="raizCurva"
			id="raizCurva" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		raizDelgada</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="raizDelgada" id="raizDelgada" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		rizogeneseIncompleta</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="rizogeneseIncompleta" id="rizogeneseIncompleta" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		densidadeDente</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="densidadeDente" id="densidadeDente" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		fraturaRaiz</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="fraturaRaiz" id="fraturaRaiz" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		outrosSinaisRadiograficos</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="outrosSinaisRadiograficos" id="outrosSinaisRadiograficos"
			value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		polpaNormal</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="polpaNormal" id="polpaNormal" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		pulpiteAgudaReversivel</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="pulpiteAgudaReversivel" id="pulpiteAgudaReversivel" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		pulpiteAgudaReversibilidadeDuvidosa</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="pulpiteAgudaReversibilidadeDuvidosa"
			id="pulpiteAgudaReversibilidadeDuvidosa" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		pulpiteAgudaIrreversivel</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="pulpiteAgudaIrreversivel" id="pulpiteAgudaIrreversivel"
			value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">
		pulpiteCronicaHiperplastica</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="pulpiteCronicaHiperplastica" id="pulpiteCronicaHiperplastica"
			value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">necrosePulpar</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="necrosePulpar" id="necrosePulpar" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">pericementiteApicalAguda</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="pericementiteApicalAguda" id="pericementiteApicalAguda"
			value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">abcessoDentoAlveolarAgudoFaseInicial</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="abcessoDentoAlveolarAgudoFaseInicial"
			id="abcessoDentoAlveolarAgudoFaseInicial" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">abcessoDentoAlveolarAgudoFaseEvolucao</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="abcessoDentoAlveolarAgudoFaseEvolucao"
			id="abcessoDentoAlveolarAgudoFaseEvolucao" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">abcessoDentoAlveolarAgudoFaseEvoluida</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="abcessoDentoAlveolarAgudoFaseEvoluida"
			id="abcessoDentoAlveolarAgudoFaseEvoluida" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">lesaoPeriapicalCronicaCircunscrita</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="lesaoPeriapicalCronicaCircunscrita"
			id="lesaoPeriapicalCronicaCircunscrita" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">lesaoPeriapicalCronicaDifusa</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="lesaoPeriapicalCronicaDifusa" id="lesaoPeriapicalCronicaDifusa"
			value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>

	<tr>
		<td style="text-align: right; vertical-align: middle; border: none;">lesaoEndoPeriodontal</td>
		<td style="border: none;"><input type="checkbox"  disabled 
			name="lesaoEndoPeriodontal" id="lesaoEndoPeriodontal" value="Sim"><span><span><b>Sim</b></span></span></td>
	</tr>
	<tr>
	<td style="text-align: right; vertical-align: middle; border: none;">Tratamento Indicado</td>
	<td style="border: none;"><textarea rows="3" cols="20"
		id="tratamentoIndicato" name="tratamentoIndicato" disabled
		style="resize: none;"
		onkeyup="limitTextCount('tratamentoIndicato', 'divcount', 240);"
		onkeydown="limitTextCount('tratamentoIndicato', 'divcount', 240);">
			</textarea><br></br>
	<font color="#990000"><span id="divcount"> Restam 240
	caracteres.</font></span></td>
	</tr>
</table>
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
	
	