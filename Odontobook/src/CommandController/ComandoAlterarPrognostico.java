package CommandController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Endodontia;
import facade.Facade;

public class ComandoAlterarPrognostico implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("----------- COMANDO ALTERAR PROGNOSTICO! ");
	
		HttpSession sessao = req.getSession();
		String login = (String) sessao.getAttribute("login");
		String perfil = (String) sessao.getAttribute("perfil");
		String identificador = (String) sessao.getAttribute("identificador");
		String loginPaciente = null;
		System.out.println("(1)");
		if(perfil.equals("dentista"))
		 loginPaciente = (String) sessao.getAttribute("cpfDoCara");
		else
		 loginPaciente = (String) sessao.getAttribute("login");
		
		String numeroDente = (String) sessao.getAttribute("numDente");

		System.out.println(numeroDente);
		System.out.println(loginPaciente);
		
		System.out.println("(2)");
		//TEXTO
		//-------------------------------------------------------------------------------------------------------
		String dataEndodontia="";
		//-------------------------------------------------------------------------------------------------------
		String testesSensibilidadePulparUtilizado="";
		//-------------------------------------------------------------------------------------------------------
		String tratamentoIndicato="";
		//-------------------------------------------------------------------------------------------------------
		System.out.println("(3)");
		
		//CHECKBOXES		
		String presencaDor=(String) req.getParameter("presencaDor");
		if(presencaDor!= null)
		{
			presencaDor = "checked";
		}else{
			presencaDor = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String sondagemGengival=(String) req.getParameter("sondagemGengival");
		if(sondagemGengival!= null)
		{
			sondagemGengival = "checked";
		}else{
			sondagemGengival = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String grauMobilidade=(String) req.getParameter("grauMobilidade");
		if(grauMobilidade!= null)
		{
			grauMobilidade = "checked";
		}else{
			grauMobilidade = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String exposicaoClinicaFurca=(String) req.getParameter("exposicaoClinicaFurca");
		if(exposicaoClinicaFurca!= null)
		{
			exposicaoClinicaFurca = "checked";
		}else{
			exposicaoClinicaFurca = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String retracaoGengival=(String) req.getParameter("retracaoGengival");
		if(retracaoGengival!= null)
		{
			retracaoGengival = "checked";
		}else{
			retracaoGengival = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String dorPerussaoVertical=(String) req.getParameter("dorPerussaoVertical");
		if(dorPerussaoVertical!= null)
		{
			dorPerussaoVertical = "checked";
		}else{
			dorPerussaoVertical = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String dorPercussaoHorizontal=(String) req.getParameter("dorPercussaoHorizontal");
		if(dorPercussaoHorizontal!= null)
		{
			dorPercussaoHorizontal = "checked";
		}else{
			dorPercussaoHorizontal = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String dorPalpacaoApical=(String) req.getParameter("dorPalpacaoApical");
		if(dorPalpacaoApical!= null)
		{
			dorPalpacaoApical = "checked";
		}else{
			dorPalpacaoApical = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String edemiaIntraBucal=(String) req.getParameter("edemiaIntraBucal");
		if(edemiaIntraBucal!= null)
		{
			edemiaIntraBucal = "checked";
		}else{
			edemiaIntraBucal = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String esemiaExtraOral=(String) req.getParameter("esemiaExtraOral");
		if(esemiaExtraOral!= null)
		{
			esemiaExtraOral = "checked";
		}else{
			esemiaExtraOral = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String carie=(String) req.getParameter("carie");
		if(carie!= null)
		{
			carie = "checked";
		}else{
			carie = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String corCoroaAlterada=(String) req.getParameter("corCoroaAlterada");
		if(corCoroaAlterada!= null)
		{
			corCoroaAlterada = "checked";
		}else{
			corCoroaAlterada = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String coroaProtetica=(String) req.getParameter("coroaProtetica");
		if(coroaProtetica!= null)
		{
			coroaProtetica = "checked";
		}else{
			coroaProtetica = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String exposicaoPulpar=(String) req.getParameter("exposicaoPulpar");
		if(exposicaoPulpar!= null)
		{
			exposicaoPulpar = "checked";
		}else{
			exposicaoPulpar = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String fistula=(String) req.getParameter("fistula");
		if(fistula!= null)
		{
			fistula = "checked";
		}else{
			fistula = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String fraturaCoroa=(String) req.getParameter("fraturaCoroa");
		if(fraturaCoroa!= null)
		{
			fraturaCoroa = "checked";
		}else{
			fraturaCoroa = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String luxacaoDental=(String) req.getParameter("luxacaoDental");
		if(luxacaoDental!= null)
		{
			luxacaoDental = "checked";
		}else{
			luxacaoDental = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String restauracao=(String) req.getParameter("restauracao");
		if(restauracao!= null)
		{
			restauracao = "checked";
		}else{
			restauracao = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String traumaOclusal=(String) req.getParameter("traumaOclusal");
		if(traumaOclusal!= null)
		{
			traumaOclusal = "checked";
		}else{
			traumaOclusal = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String outrosSinaisClinicos=(String) req.getParameter("outrosSinaisClinicos");
		if(outrosSinaisClinicos!= null)
		{
			outrosSinaisClinicos = "checked";
		}else{
			outrosSinaisClinicos = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String carieCoroa=(String) req.getParameter("carieCoroa");
		if(carieCoroa!= null)
		{
			carieCoroa = "checked";
		}else{
			carieCoroa = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String carieRaiz=(String) req.getParameter("carieRaiz");
		if(carieRaiz!= null)
		{
			carieRaiz = "checked";
		}else{
			carieRaiz = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String calcificacaoCanal=(String) req.getParameter("calcificacaoCanal");
		if(calcificacaoCanal!= null)
		{
			calcificacaoCanal = "checked";
		}else{
			calcificacaoCanal = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String noduloPulpar=(String) req.getParameter("noduloPulpar");
		if(noduloPulpar!= null)
		{
			noduloPulpar = "checked";
		}else{
			noduloPulpar = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String canaisObturados=(String) req.getParameter("canaisObturados");
		if(canaisObturados!= null)
		{
			canaisObturados = "checked";
		}else{
			canaisObturados = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String sobreObturacao=(String) req.getParameter("sobreObturacao");
		if(sobreObturacao!= null)
		{
			sobreObturacao = "checked";
		}else{
			sobreObturacao = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String instrumentoFraturado=(String) req.getParameter("instrumentoFraturado");
		if(instrumentoFraturado!= null)
		{
			instrumentoFraturado = "checked";
		}else{
			instrumentoFraturado = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String espessamentoPeriodontalApical=(String) req.getParameter("espessamentoPeriodontalApical");
		if(espessamentoPeriodontalApical!= null)
		{
			espessamentoPeriodontalApical = "checked";
		}else{
			espessamentoPeriodontalApical = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String espessamentoPeriodontalLateral=(String) req.getParameter("espessamentoPeriodontalLateral");
		if(espessamentoPeriodontalLateral!= null)
		{
			espessamentoPeriodontalLateral = "checked";
		}else{
			espessamentoPeriodontalLateral = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String nucleoMetalico=(String) req.getParameter("nucleoMetalico");
		if(nucleoMetalico!= null)
		{
			nucleoMetalico = "checked";
		}else{
			nucleoMetalico = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String perficacaoRadicular=(String) req.getParameter("perficacaoRadicular");
		if(perficacaoRadicular!= null)
		{
			perficacaoRadicular = "checked";
		}else{
			perficacaoRadicular = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String pulpotomia=(String) req.getParameter("pulpotomia");
		if(pulpotomia!= null)
		{
			pulpotomia = "checked";
		}else{
			pulpotomia = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String lesaoPeriodontalLateral=(String) req.getParameter("lesaoPeriodontalLateral");
		if(lesaoPeriodontalLateral!= null)
		{
			lesaoPeriodontalLateral = "checked";
		}else{
			lesaoPeriodontalLateral = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String lesaoPeriapical=(String) req.getParameter("lesaoPeriapical");
		if(lesaoPeriapical!= null)
		{
			lesaoPeriapical = "checked";
		}else{
			lesaoPeriapical = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String hipercrementose=(String) req.getParameter("hipercrementose");
		if(hipercrementose!= null)
		{
			hipercrementose = "checked";
		}else{
			hipercrementose = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String reabsorcaoExtremaCervical=(String) req.getParameter("reabsorcaoExtremaCervical");
		if(reabsorcaoExtremaCervical!= null)
		{
			reabsorcaoExtremaCervical = "checked";
		}else{
			reabsorcaoExtremaCervical = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String reabsorcaoInterna=(String) req.getParameter("reabsorcaoInterna");
		if(reabsorcaoInterna!= null)
		{
			reabsorcaoInterna = "checked";
		}else{
			reabsorcaoInterna = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String lesaoFurca=(String) req.getParameter("lesaoFurca");
		if(lesaoFurca!= null)
		{
			lesaoFurca = "checked";
		}else{
			lesaoFurca = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String raizCurva=(String) req.getParameter("raizCurva");
		if(raizCurva!= null)
		{
			raizCurva = "checked";
		}else{
			raizCurva = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String raizDelgada=(String) req.getParameter("raizDelgada");
		if(raizDelgada!= null)
		{
			raizDelgada = "checked";
		}else{
			raizDelgada = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String rizogeneseIncompleta=(String) req.getParameter("rizogeneseIncompleta");
		if(rizogeneseIncompleta!= null)
		{
			rizogeneseIncompleta = "checked";
		}else{
			rizogeneseIncompleta = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String densidadeDente=(String) req.getParameter("densidadeDente");
		if(densidadeDente!= null)
		{
			densidadeDente = "checked";
		}else{
			densidadeDente = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String fraturaRaiz=(String) req.getParameter("fraturaRaiz");
		if(fraturaRaiz!= null)
		{
			fraturaRaiz = "checked";
		}else{
			fraturaRaiz = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String outrosSinaisRadiograficos=(String) req.getParameter("outrosSinaisRadiograficos");
		if(outrosSinaisRadiograficos!= null)
		{
			outrosSinaisRadiograficos = "checked";
		}else{
			outrosSinaisRadiograficos = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String polpaNormal=(String) req.getParameter("polpaNormal");
		if(polpaNormal!= null)
		{
			polpaNormal = "checked";
		}else{
			polpaNormal = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String pulpiteAgudaReversivel=(String) req.getParameter("pulpiteAgudaReversivel");
		if(pulpiteAgudaReversivel!= null)
		{
			pulpiteAgudaReversivel = "checked";
		}else{
			pulpiteAgudaReversivel = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String pulpiteAgudaReversibilidadeDuvidosa=(String) req.getParameter("pulpiteAgudaReversibilidadeDuvidosa");
		if(pulpiteAgudaReversibilidadeDuvidosa!= null)
		{
			pulpiteAgudaReversibilidadeDuvidosa = "checked";
		}else{
			pulpiteAgudaReversibilidadeDuvidosa = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String pulpiteAgudaIrreversivel=(String) req.getParameter("pulpiteAgudaIrreversivel");
		if(pulpiteAgudaIrreversivel!= null)
		{
			pulpiteAgudaIrreversivel = "checked";
		}else{
			pulpiteAgudaIrreversivel = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String pulpiteCronicaHiperplastica=(String) req.getParameter("pulpiteCronicaHiperplastica");
		if(pulpiteCronicaHiperplastica!= null)
		{
			pulpiteCronicaHiperplastica = "checked";
		}else{
			pulpiteCronicaHiperplastica = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String necrosePulpar=(String) req.getParameter("necrosePulpar");
		if(necrosePulpar!= null)
		{
			necrosePulpar = "checked";
		}else{
			necrosePulpar = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String pericementiteApicalAguda=(String) req.getParameter("pericementiteApicalAguda");
		if(pericementiteApicalAguda!= null)
		{
			pericementiteApicalAguda = "checked";
		}else{
			pericementiteApicalAguda = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String abcessoDentoAlveolarAgudoFaseInicial=(String) req.getParameter("abcessoDentoAlveolarAgudoFaseInicial");
		if(abcessoDentoAlveolarAgudoFaseInicial!= null)
		{
			abcessoDentoAlveolarAgudoFaseInicial = "checked";
		}else{
			abcessoDentoAlveolarAgudoFaseInicial = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String abcessoDentoAlveolarAgudoFaseEvolucao=(String) req.getParameter("abcessoDentoAlveolarAgudoFaseEvolucao");
		if(abcessoDentoAlveolarAgudoFaseEvolucao!= null)
		{
			abcessoDentoAlveolarAgudoFaseEvolucao = "checked";
		}else{
			abcessoDentoAlveolarAgudoFaseEvolucao = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String abcessoDentoAlveolarAgudoFaseEvoluida=(String) req.getParameter("abcessoDentoAlveolarAgudoFaseEvoluida");
		if(abcessoDentoAlveolarAgudoFaseEvoluida!= null)
		{
			abcessoDentoAlveolarAgudoFaseEvoluida = "checked";
		}else{
			abcessoDentoAlveolarAgudoFaseEvoluida = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String lesaoPeriapicalCronicaCircunscrita=(String) req.getParameter("lesaoPeriapicalCronicaCircunscrita");
		if(lesaoPeriapicalCronicaCircunscrita!= null)
		{
			lesaoPeriapicalCronicaCircunscrita = "checked";
		}else{
			lesaoPeriapicalCronicaCircunscrita = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String lesaoPeriapicalCronicaDifusa=(String) req.getParameter("lesaoPeriapicalCronicaDifusa");
		if(lesaoPeriapicalCronicaDifusa!= null)
		{
			lesaoPeriapicalCronicaDifusa = "checked";
		}else{
			lesaoPeriapicalCronicaDifusa = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------
		String lesaoEndoPeriodontal=(String) req.getParameter("lesaoEndoPeriodontal");
		if(lesaoEndoPeriodontal!= null)
		{
			lesaoEndoPeriodontal = "checked";
		}else{
			lesaoEndoPeriodontal = "unchecked";
		}
		//-------------------------------------------------------------------------------------------------------

		//=======================================================================================
		//							
		//										SALVA DADOS
		//
		//=======================================================================================
		System.out.println("(4)");
		try{
			// Verifica se ja existe
			if(Facade.EndodontiaExiste(numeroDente, loginPaciente))
			{ //Se sim, UPDATE
				Facade.updateEndodontia(numeroDente, 
						  loginPaciente,
						  dataEndodontia,
						  presencaDor,
						  sondagemGengival,
						  grauMobilidade,
						  exposicaoClinicaFurca,
						  retracaoGengival,
						  dorPerussaoVertical,
						  dorPercussaoHorizontal,
						  dorPalpacaoApical,
						  testesSensibilidadePulparUtilizado,
						  edemiaIntraBucal,
						  esemiaExtraOral,
						  carie,
						  corCoroaAlterada,
						  coroaProtetica,
						  exposicaoPulpar,
						  fistula,
						  fraturaCoroa,
						  luxacaoDental,
						  restauracao,
						  traumaOclusal,
						  outrosSinaisClinicos,
						  carieCoroa,
						  carieRaiz,
						  calcificacaoCanal,
						  noduloPulpar,
						  canaisObturados,
						  sobreObturacao,
						  instrumentoFraturado,
						  espessamentoPeriodontalApical,
						  espessamentoPeriodontalLateral,
						  nucleoMetalico,
						  perficacaoRadicular,
						  pulpotomia,
						  lesaoPeriodontalLateral,
						  lesaoPeriapical,
						  hipercrementose,
						  reabsorcaoExtremaCervical,
						  reabsorcaoInterna,
						  lesaoFurca,
						  raizCurva,
						  raizDelgada,
						  rizogeneseIncompleta,
						  densidadeDente,
						  fraturaRaiz,
						  outrosSinaisRadiograficos,
						  polpaNormal,
						  pulpiteAgudaReversivel,
						  pulpiteAgudaReversibilidadeDuvidosa,
						  pulpiteAgudaIrreversivel,
						  pulpiteCronicaHiperplastica,
						  necrosePulpar,
						  pericementiteApicalAguda,
						  abcessoDentoAlveolarAgudoFaseInicial,
						  abcessoDentoAlveolarAgudoFaseEvolucao,
						  abcessoDentoAlveolarAgudoFaseEvoluida,
						  lesaoPeriapicalCronicaCircunscrita,
						  lesaoPeriapicalCronicaDifusa,
						  lesaoEndoPeriodontal,
						  tratamentoIndicato);
			}else
			{
				//Se nao, cria
				Facade.criarPrognostico(numeroDente, 
						  loginPaciente,
						  dataEndodontia,
						  presencaDor,
						  sondagemGengival,
						  grauMobilidade,
						  exposicaoClinicaFurca,
						  retracaoGengival,
						  dorPerussaoVertical,
						  dorPercussaoHorizontal,
						  dorPalpacaoApical,
						  testesSensibilidadePulparUtilizado,
						  edemiaIntraBucal,
						  esemiaExtraOral,
						  carie,
						  corCoroaAlterada,
						  coroaProtetica,
						  exposicaoPulpar,
						  fistula,
						  fraturaCoroa,
						  luxacaoDental,
						  restauracao,
						  traumaOclusal,
						  outrosSinaisClinicos,
						  carieCoroa,
						  carieRaiz,
						  calcificacaoCanal,
						  noduloPulpar,
						  canaisObturados,
						  sobreObturacao,
						  instrumentoFraturado,
						  espessamentoPeriodontalApical,
						  espessamentoPeriodontalLateral,
						  nucleoMetalico,
						  perficacaoRadicular,
						  pulpotomia,
						  lesaoPeriodontalLateral,
						  lesaoPeriapical,
						  hipercrementose,
						  reabsorcaoExtremaCervical,
						  reabsorcaoInterna,
						  lesaoFurca,
						  raizCurva,
						  raizDelgada,
						  rizogeneseIncompleta,
						  densidadeDente,
						  fraturaRaiz,
						  outrosSinaisRadiograficos,
						  polpaNormal,
						  pulpiteAgudaReversivel,
						  pulpiteAgudaReversibilidadeDuvidosa,
						  pulpiteAgudaIrreversivel,
						  pulpiteCronicaHiperplastica,
						  necrosePulpar,
						  pericementiteApicalAguda,
						  abcessoDentoAlveolarAgudoFaseInicial,
						  abcessoDentoAlveolarAgudoFaseEvolucao,
						  abcessoDentoAlveolarAgudoFaseEvoluida,
						  lesaoPeriapicalCronicaCircunscrita,
						  lesaoPeriapicalCronicaDifusa,
						  lesaoEndoPeriodontal,
						  tratamentoIndicato);
			}
						
			Endodontia e = Facade.recuperarEndodontia(loginPaciente, numeroDente);
			System.out.println();
			System.out.println("------------------------------------");
			System.out.println("DADOS DA ENDODONTIA PARA SEÇÃO");
			System.out.println();
			System.out.println("DENTE: " + e.getNumeroDente());
			System.out.println("LOGIN: " + e.getLoginPacien());
			System.out.println("CARIE? " + e.getCarie());
			System.out.println("------------------------------------");
			
			sessao.removeAttribute("dadosEndodontia");
			sessao.setAttribute("dadosEndodontia", e);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			req.setAttribute("resultado",  "<b><font color='red'> Ocorreu um erro de database ao salvar o Prognóstico! </font></b>");
			return "/jsp/Endodontia.jsp";
		}
		
		
		
		
		req.setAttribute("resultado",  "<b><font color='red'> Dados do PROGNOSTICO foram salvos! Dente #"+ numeroDente + " Paciente: " + loginPaciente + "</font></b>");

		return "/jsp/Endodontia.jsp";
	}

}
