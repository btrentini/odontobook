package facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.derby.client.am.SqlException;
import org.hibernate.exception.GenericJDBCException;


import util.Conexao;

import model.AnamneseGeral;
import model.Dente;
import model.Endodontia;
import model.Paciente;
import model.Permissao;
import model.Pessoa;
import dao.impl.SQLUsuarios;

public class Facade {



	public static Pessoa autenticar(String usuario, String senha) throws GenericJDBCException, PersistenceException, SQLException, NoResultException {

		SQLUsuarios sql = new SQLUsuarios();
		Pessoa validar = sql.validaLogin(usuario, senha);
		return validar;
	}


	public static boolean inserirUsuario(String login, String senha, String perfil, String identificador)
	{
		SQLUsuarios sql = new SQLUsuarios();

		if(perfil.equals("dentista"))
			return sql.criarDentista(login, senha, perfil, identificador);
		else
			return sql.criarPaciente(login, senha, perfil, identificador);

	}
	public static boolean editarPerfilDentista(String login, String perfil,  String dataNascimentoPessoa, String estadoCivilPessoa, String rgPessoa, String nacionalidadePessoa, String naturalidadePessoa, String emailPessoa, String enderecoResidencialPessoa, String cidadePessoa, String bairroPessoa, String ufPessoa, String cepPessoa, String fone1Pessoa, String fone2Pessoa, String fone3Pessoa, String foneRecadoPessoa, String nomeRecadoPessoa, String nomePaiPessoa, String nomeMaePessoa,  String nome, String sobrenome, String consultorioDentista, String enderecoConsultorio, String telefone1Consultorio, String telefone2Consultorio, String cidadeConsultorio, String bairroConsultorio, String ufConsultorio, String faxConsultorio, String websiteConsultorio, String graduacaoCurriculo, String especializacaoCurriculo, String anoFormacaoCurriculo)
	{
		SQLUsuarios sql = new SQLUsuarios();
		return sql.editarPerfilDentista( login , 
				perfil , 
				dataNascimentoPessoa , 
				estadoCivilPessoa , 
				rgPessoa , 
				nacionalidadePessoa , 
				naturalidadePessoa ,
				emailPessoa,					
				enderecoResidencialPessoa ,
				cidadePessoa, 
				bairroPessoa,
				ufPessoa, 
				cepPessoa, 
				fone1Pessoa, 
				fone2Pessoa, 
				fone3Pessoa, 
				foneRecadoPessoa, 
				nomeRecadoPessoa, 
				nomePaiPessoa, 
				nomeMaePessoa, 
				nome, 
				sobrenome,
				consultorioDentista, 
				enderecoConsultorio,  
				telefone1Consultorio, 
				telefone2Consultorio,
				cidadeConsultorio, 
				bairroConsultorio,
				ufConsultorio,
				faxConsultorio, 
				websiteConsultorio, 
				graduacaoCurriculo,
				especializacaoCurriculo, 
				anoFormacaoCurriculo);	
	}
	public static boolean editarPerfilPaciente(String login, String perfil, String dataNascimentoPessoa, String estadoCivilPessoa, String rgPessoa, String nacionalidadePessoa, String naturalidadePessoa, String emailPessoa, String enderecoResidencialPessoa, String cidadePessoa, String bairroPessoa, String ufPessoa, String cepPessoa, String fone1Pessoa, String fone2Pessoa, String fone3Pessoa, String foneRecadoPessoa, String nomeRecadoPessoa, String nomePaiPessoa, String nomeMaePessoa, String nome, String sobrenome, String nomeResponsavelPaciente, String ocupacaoPaciente, String profissaoPaciente, String indicacaoPaciente)
	{
		SQLUsuarios sql = new SQLUsuarios();
		return sql.editarPerfilPaciente( 
				login , 
				perfil , 
				dataNascimentoPessoa , 
				estadoCivilPessoa , 
				rgPessoa , 
				nacionalidadePessoa , 
				naturalidadePessoa ,
				emailPessoa,					
				enderecoResidencialPessoa ,
				cidadePessoa, 
				bairroPessoa,
				ufPessoa, 
				cepPessoa, 
				fone1Pessoa, 
				fone2Pessoa, 
				fone3Pessoa, 
				foneRecadoPessoa, 
				nomeRecadoPessoa, 
				nomePaiPessoa, 
				nomeMaePessoa, 
				nome, 
				sobrenome,
				nomeResponsavelPaciente,
				ocupacaoPaciente,
				profissaoPaciente,
				indicacaoPaciente);
	}

	public static boolean validaJaExiste(String login, String identificador, String perfil) throws GenericJDBCException, NoResultException, PersistenceException, SqlException {

		SQLUsuarios sql = new SQLUsuarios();
		return sql.validaJaExiste(login, identificador, perfil);

	}


	public static List buscarDentistas() {

		SQLUsuarios sql = new SQLUsuarios();
		return sql.buscarDentistas();
	}


	public static boolean concederPermissao(String cro, String cpf) throws Exception {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.concederPermissao(cro, cpf);

	}


	public static List recuperarPacientes() {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.recuperarPacientes();
	}


	public static List recuperarPermissoesPaciente(String cpf) {
		// TODO Auto-generated method stub
		SQLUsuarios sql = new SQLUsuarios();
		return sql.recuperarPermissoesPaciente(cpf);
	}


	public static List recuperarPermissoesDentista(String cro) {
		// TODO Auto-generated method stub
		SQLUsuarios sql = new SQLUsuarios();
		return sql.recuperarPermissoesDentista(cro);
	}


	public static Pessoa recuperarPessoa(String login) {
		// TODO Auto-generated method stub
		SQLUsuarios sql = new SQLUsuarios();
		return sql.recuperarPessoa(login);
	}


	public static boolean atualizarAnamneseGeral() {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.editarAnamneseGeral();	

	}


	public static boolean existeAnamneseGeral(String login) {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.verificaExistenciaAnamneseGeral(login);	
	}


	public static boolean criaAnameseGeral(String login, String apresentaProblemas, 
			String estaEmTratamentoMedico, String nomeMedico, String telefoneMedico,
			String tomaMedicamento, String qualMedicamento, 
			String quandoMedicoUltimaVez, String qualUltimoTratamento, 
			String jaPassouCirurgia, String tipoCirurgia, String dataCirurgia, 
			String doencaSeria, String qualDoencaSeria, String antineoplasticoFace, 
			String tempoAntioneoplastico, String fumante, String qtdeCigarrosDiarios, 
			String bebidaAlcoolicaFrequente, String gravidaAmamentando, String mesesGravidez, 
			String outrasInformacoes, String ganhouPerdeuPesoUltimamente, String faltaDeAr, 
			String juntasIncham, String tonturasDesmaios, String demoraCicatrizar, String hemorragia, 
			String drogas, String tiposDrogas){
		
		SQLUsuarios sql = new SQLUsuarios();
		return sql.criaAnamneseGeral(login, apresentaProblemas,
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

	}


	public static boolean refresh(String login) {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.refresh(login);	
		
	}


	public static AnamneseGeral recuperarAnamneseGeralPaciente(String login) {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.recuperarAnamneseGeralPaciente(login);
	}


	public static boolean gravarDadosDente(String loginPaciente, String numeroDente, String situacaoPresente, String canal, String cAD, String cTEX, String cTG, String cTES, String cRD, String cT, String referencia, String instrumento, String instrumentoPatencia, String numDA, String numDC, String x, String incidenciaDoRX, String conePrincipal, String cimentoObturador, String tecnicaObturacao){
		
		SQLUsuarios sql = new SQLUsuarios();

		return sql.gravarDadosDente(loginPaciente,
				numeroDente,
				situacaoPresente,
				canal,
				cAD,
				cTEX,
				cTG,
				cTES,
				cRD,
				cT,
				referencia,
				instrumento,
				instrumentoPatencia,
				numDA,
				numDC,
				x,
				incidenciaDoRX,
				conePrincipal,
				cimentoObturador,
				tecnicaObturacao);
		
	}


	public static Dente recuperarDadosDente(String paciente, String numeroDente) {
		// TODO Auto-generated method stub
		SQLUsuarios sql = new SQLUsuarios();
		return sql.recuperarDadosDente(paciente, numeroDente);
	}


	public static boolean updateDente(String loginPaciente, String numeroDente, String situacaoPresente, String canal, String cAD, String cTEX, String cTG, String cTES, String cRD, String cT, String referencia, String instrumento, String instrumentoPatencia, String numDA, String numDC, String x, String incidenciaDoRX, String conePrincipal, String cimentoObturador, String tecnicaObturacao) {
		// TODO Auto-generated method stub
		SQLUsuarios sql = new SQLUsuarios();
		return sql.updateDente(loginPaciente,
				numeroDente,
				situacaoPresente,
				canal,
				cAD,
				cTEX,
				cTG,
				cTES,
				cRD,
				cT,
				referencia,
				instrumento,
				instrumentoPatencia,
				numDA,
				numDC,
				x,
				incidenciaDoRX,
				conePrincipal,
				cimentoObturador,
				tecnicaObturacao);
		
	}


	public static boolean denteExiste(String numeroDente, String paciente) {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.denteExiste(numeroDente, paciente);
		
	}


	public static boolean criarPrognostico(String numeroDente, String loginPaciente, String dataEndodontia, String presencaDor, String sondagemGengival, String grauMobilidade, String exposicaoClinicaFurca, String retracaoGengival, String dorPerussaoVertical, String dorPercussaoHorizontal, String dorPalpacaoApical, String testesSensibilidadePulparUtilizado, String edemiaIntraBucal, String esemiaExtraOral, String carie, String corCoroaAlterada, String coroaProtetica, String exposicaoPulpar, String fistula, String fraturaCoroa, String luxacaoDental, String restauracao, String traumaOclusal, String outrosSinaisClinicos, String carieCoroa, String carieRaiz, String calcificacaoCanal, String noduloPulpar, String canaisObturados, String sobreObturacao, String instrumentoFraturado, String espessamentoPeriodontalApical, String espessamentoPeriodontalLateral, String nucleoMetalico, String perficacaoRadicular, String pulpotomia, String lesaoPeriodontalLateral, String lesaoPeriapical, String hipercrementose, String reabsorcaoExtremaCervical, String reabsorcaoInterna, String lesaoFurca, String raizCurva, String raizDelgada, String rizogeneseIncompleta, String densidadeDente, String fraturaRaiz, String outrosSinaisRadiograficos, String polpaNormal, String pulpiteAgudaReversivel, String pulpiteAgudaReversibilidadeDuvidosa, String pulpiteAgudaIrreversivel, String pulpiteCronicaHiperplastica, String necrosePulpar, String pericementiteApicalAguda, String abcessoDentoAlveolarAgudoFaseInicial, String abcessoDentoAlveolarAgudoFaseEvolucao, String abcessoDentoAlveolarAgudoFaseEvoluida, String lesaoPeriapicalCronicaCircunscrita, String lesaoPeriapicalCronicaDifusa, String lesaoEndoPeriodontal, String tratamentoIndicato) {
	
		SQLUsuarios sql = new SQLUsuarios();
		return sql.criarPrognostico(numeroDente, 
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


	public static boolean EndodontiaExiste(String numeroDente,
			String loginPaciente) {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.EndodontiaExiste(numeroDente, loginPaciente);
	}


	public static boolean updateEndodontia(String numeroDente,
			String loginPaciente, String dataEndodontia, String presencaDor,
			String sondagemGengival, String grauMobilidade,
			String exposicaoClinicaFurca, String retracaoGengival,
			String dorPerussaoVertical, String dorPercussaoHorizontal,
			String dorPalpacaoApical,
			String testesSensibilidadePulparUtilizado, String edemiaIntraBucal,
			String esemiaExtraOral, String carie, String corCoroaAlterada,
			String coroaProtetica, String exposicaoPulpar, String fistula,
			String fraturaCoroa, String luxacaoDental, String restauracao,
			String traumaOclusal, String outrosSinaisClinicos,
			String carieCoroa, String carieRaiz, String calcificacaoCanal,
			String noduloPulpar, String canaisObturados, String sobreObturacao,
			String instrumentoFraturado, String espessamentoPeriodontalApical,
			String espessamentoPeriodontalLateral, String nucleoMetalico,
			String perficacaoRadicular, String pulpotomia,
			String lesaoPeriodontalLateral, String lesaoPeriapical,
			String hipercrementose, String reabsorcaoExtremaCervical,
			String reabsorcaoInterna, String lesaoFurca, String raizCurva,
			String raizDelgada, String rizogeneseIncompleta,
			String densidadeDente, String fraturaRaiz,
			String outrosSinaisRadiograficos, String polpaNormal,
			String pulpiteAgudaReversivel,
			String pulpiteAgudaReversibilidadeDuvidosa,
			String pulpiteAgudaIrreversivel,
			String pulpiteCronicaHiperplastica, String necrosePulpar,
			String pericementiteApicalAguda,
			String abcessoDentoAlveolarAgudoFaseInicial,
			String abcessoDentoAlveolarAgudoFaseEvolucao,
			String abcessoDentoAlveolarAgudoFaseEvoluida,
			String lesaoPeriapicalCronicaCircunscrita,
			String lesaoPeriapicalCronicaDifusa, String lesaoEndoPeriodontal,
			String tratamentoIndicato) {
		// TODO Auto-generated method stub
		SQLUsuarios sql = new SQLUsuarios();
		return sql.updateEndodontia(numeroDente, 
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


	public static Endodontia recuperarEndodontia(String loginPaciente,
			String numeroDente) {
		// TODO Auto-generated method stub
		SQLUsuarios sql = new SQLUsuarios();
		return sql.recuperarEndodontia(loginPaciente, numeroDente);
	}


	public static boolean updatePermissao(String paciente, String identificador, String duracaoTratamentoEstimada, String valorEstimadoTratamento, String numeroConsultasEstimadas, String numeroProntuario, String dataInicio) {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.updatePermissao(paciente, 
				identificador, 
				duracaoTratamentoEstimada,
				valorEstimadoTratamento,
				numeroConsultasEstimadas,
				numeroProntuario,
				dataInicio);
		
	}


	public static boolean excluirPermissao(String identificador, String paciente) {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.excluirPermissao( identificador,  paciente);
		
	}


	public static boolean verificarExistenciaPermissao(String cro, String cpf) {
		SQLUsuarios sql = new SQLUsuarios();
		return sql.verificarExistenciaPermissao( cro,  cpf);
		
		
	}



}
