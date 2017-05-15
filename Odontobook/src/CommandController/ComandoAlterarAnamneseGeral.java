package CommandController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import facade.Facade;

public class ComandoAlterarAnamneseGeral implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("----------- COMANDO ALTERAR ANAMNESE GERAL! ");
		HttpSession sessao = req.getSession();
		String login = (String) sessao.getAttribute("login");
		String perfil = (String) sessao.getAttribute("perfil");
		String identificador = (String) sessao.getAttribute("identificador");

		//ATRIBUTOS DA PAGINA DE EDITAR ANAMNESE GERAL
		String apresentaProblemas = (String) req.getParameter("apresentaProblemaDeSaude");
		String estaEmTratamentoMedico =(String) req.getParameter("estaEmTratamentoMedico");
		String nomeMedico =(String) req.getParameter("nomeMedico" );
		String telefoneMedico =(String) req.getParameter("telefoneMedico");  
		String tomaMedicamento =(String) req.getParameter("tomaMedicamento" );
		String qualMedicamento =(String) req.getParameter("qualMedicamento" );
		String quandoMedicoUltimaVez =(String) req.getParameter("quandoMedicoUltimaVez"); 
		String qualUltimoTratamento =(String) req.getParameter("qualUltimoTratamento");
		String jaPassouCirurgia =(String) req.getParameter("jaPassouCirurgia"); 		 
		String tipoCirurgia=(String) req.getParameter("tipoCirurgia" );
		String dataCirurgia=(String) req.getParameter("dataCirurgia" );
		String doencaSeria=(String) req.getParameter("doencaSeria" );
		String qualDoencaSeria=(String) req.getParameter("qualDoencaSeria"); 
		String antineoplasticoFace=(String) req.getParameter("antineoplasticoFace"); 
		String tempoAntioneoplastico=(String) req.getParameter("tempoAntioneoplastico" );
		String fumante=(String) req.getParameter("fumante");
		String qtdeCigarrosDiarios=(String) req.getParameter("qtdeCigarrosDiarios" );
		String bebidaAlcoolicaFrequente=(String) req.getParameter("bebidaAlcoolicaFrequente"); 
		String gravidaAmamentando=(String) req.getParameter("gravidaAmamentando" );
		String mesesGravidez=(String) req.getParameter("mesesGravidez" );
		String outrasInformacoes=(String) req.getParameter("outrasInformacoes"); 
		String ganhouPerdeuPesoUltimamente=(String) req.getParameter("ganhouPerdeuPesoUltimamente"); 
		String faltaDeAr=(String) req.getParameter("faltaDeAr" );
		String juntasIncham=(String) req.getParameter("juntasIncham"); 
		String tonturasDesmaios=(String) req.getParameter("tonturasDesmaios"); 
		String demoraCicatrizar=(String) req.getParameter("demoraCicatrizar" );
		String hemorragia=(String) req.getParameter("hemorragia" );
		String drogas=(String) req.getParameter("drogas" );
		String tiposDrogas=(String) req.getParameter("tiposDrogas"); 

		if(apresentaProblemas!= null)
		{
			apresentaProblemas = "checked";
		}else{
			apresentaProblemas = "unchecked";
		}


		if(estaEmTratamentoMedico!= null){
			estaEmTratamentoMedico= "checked";
		}else{
			estaEmTratamentoMedico = "unchecked";
		}
			
		if(nomeMedico!= null){
			nomeMedico=nomeMedico.trim();
		}
			
		if(telefoneMedico!= null){
			telefoneMedico=telefoneMedico.trim();
		}
			
		if(tomaMedicamento!= null){
			tomaMedicamento= "checked";
		}else{
			tomaMedicamento = "unchecked";
		}
			
		if(qualMedicamento!= null){
			qualMedicamento=qualMedicamento.trim();
		}
			
		if(quandoMedicoUltimaVez!= null){
			quandoMedicoUltimaVez="NF";
		}else{
			quandoMedicoUltimaVez = "unchecked";
		}
			
		if(qualUltimoTratamento!= null){
			qualUltimoTratamento=qualUltimoTratamento.trim();
		}
		
		if(jaPassouCirurgia!= null){
			jaPassouCirurgia= "checked";
		}else{
			jaPassouCirurgia = "unchecked";
		}
			
		if(tipoCirurgia!= null){
			tipoCirurgia=tipoCirurgia.trim();
		}
			
		if(dataCirurgia!= null){
			dataCirurgia=dataCirurgia.trim();
		}
			
		if(doencaSeria!= null){
			doencaSeria= "checked";
		}else{
			doencaSeria = "unchecked";
		}
			
		if(qualDoencaSeria!= null){
			qualDoencaSeria=qualDoencaSeria.trim();
		}
		if(antineoplasticoFace!= null){
			antineoplasticoFace= "checked";
		}else{
			antineoplasticoFace = "unchecked";
		}
			
		if(tempoAntioneoplastico!= null){
			tempoAntioneoplastico=  "NF";
		}else{
			tempoAntioneoplastico = "unchecked";
		}
			
		if(fumante!= null){
			fumante="checked";
		}else{
			fumante = "unchecked";
		}
			
		if(qtdeCigarrosDiarios!= null){
			qtdeCigarrosDiarios=qtdeCigarrosDiarios.trim();
		}else{
			qtdeCigarrosDiarios = "unchecked";
		}
			
		if(bebidaAlcoolicaFrequente!= null){
			bebidaAlcoolicaFrequente="checked";
		}else{
			bebidaAlcoolicaFrequente = "unchecked";
		}
			
		if(gravidaAmamentando!= null){
			gravidaAmamentando="checked";
		}else{
			gravidaAmamentando = "unchecked";
		}
			
		if(mesesGravidez!= null){
			mesesGravidez=mesesGravidez.trim();
		}
			
		if(outrasInformacoes!= null){
			outrasInformacoes=outrasInformacoes.trim();
		}
			
		if(ganhouPerdeuPesoUltimamente!= null){
			ganhouPerdeuPesoUltimamente="checked";
		}else{
			ganhouPerdeuPesoUltimamente = "unchecked";
		}
			
		if(faltaDeAr!= null){
			faltaDeAr="checked";
		}else{
			faltaDeAr = "unchecked";
		}
			
		if(juntasIncham!= null){
			juntasIncham="checked";
		}else{
			juntasIncham = "unchecked";
		}
			
		if(tonturasDesmaios!= null){
			tonturasDesmaios="checked";
		}else{
			tonturasDesmaios = "unchecked";
		}
			
		if(demoraCicatrizar!= null){
			demoraCicatrizar="checked";
		}else{
			demoraCicatrizar = "unchecked";
		}
			
		if(hemorragia!= null){
			hemorragia="checked";
		}else{
			hemorragia = "unchecked";
		}
			
		if(drogas!= null){
			drogas="checked";
		}else{
			drogas = "unchecked";
		}
			
		if(tiposDrogas!= null){
			tiposDrogas=tiposDrogas.trim();
		}
		
			

		//=======================================================================================
		//						VAI CRIAR ANAMNESE
		//=======================================================================================
		Facade.criaAnameseGeral(login,
				apresentaProblemas,
				estaEmTratamentoMedico,
				nomeMedico,
				telefoneMedico,
				tomaMedicamento,
				qualMedicamento,
				quandoMedicoUltimaVez,
				qualUltimoTratamento,
				jaPassouCirurgia,
				tipoCirurgia,
				dataCirurgia,
				doencaSeria,
				qualDoencaSeria,
				antineoplasticoFace,
				tempoAntioneoplastico,
				fumante,
				qtdeCigarrosDiarios,
				bebidaAlcoolicaFrequente,
				gravidaAmamentando,
				mesesGravidez,
				outrasInformacoes,
				ganhouPerdeuPesoUltimamente,
				faltaDeAr,
				juntasIncham,
				tonturasDesmaios,
				demoraCicatrizar,
				hemorragia,
				drogas,
				tiposDrogas);
		//=======================================================================================
		//						ATUALIZA ANAMNESE
		//=======================================================================================

		sessao.setAttribute("anamnese", Facade.recuperarAnamneseGeralPaciente(login));

		req.setAttribute("resultado",  "<b><font color='red'> Dados da Anamnese Alterados com Sucesso </font></b>");
		return "/jsp/editarAnamneseGeral.jsp";


	}

}
