package dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import model.AnamneseGeral;
import model.Dente;
import model.Dentista;
import model.Endodontia;
import model.Paciente;
import model.Permissao;
import model.Pessoa;

import org.apache.derby.client.am.SqlException;
import org.hibernate.exception.GenericJDBCException;

import util.EntityManagerHelper;
import dao.UserDAO;

public class SQLUsuarios implements UserDAO{

	//=======================================================================================
	//	Pessoa validaLogin(String login, String senha) -----> VERIFICA SE JA EXISTE LOGIN
	//=======================================================================================
	@Override
	public Pessoa validaLogin(String login, String senha) throws GenericJDBCException, PersistenceException, SQLException, NoResultException  {

		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		
		Query q = em.createQuery("select p from Pessoa p where p.login=?1 and p.senha=?2");

		q.setParameter(1, login);
		q.setParameter(2, senha);

		Pessoa user = new Pessoa();

			user = (Pessoa) q.getSingleResult();

			if(user.getPerfil().equals("dentista"))
				user.setIdentificador(user.getDentista().getCro());
			else
				user.setIdentificador(user.getPaciente().getCpfPaciente());


			if(user == null || user.equals(null))
				return null;

		em.refresh(user);
		return user;
	}

	//=======================================================================================
	//	criarDentista(String login, String senha, String perfil, String cro)
	//=======================================================================================
	@Override
	public boolean criarDentista(String login, String senha, String perfil, String cro) {

		try
		{
			EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

			Pessoa pessoa = new Pessoa();
			pessoa.setLogin(login);
			pessoa.setSenha(senha);
			pessoa.setPerfil(perfil);

			Dentista dentista = new Dentista();
			dentista.setCro(cro);
			dentista.setPessoa(pessoa);
			pessoa.setDentista(dentista);

			em.getTransaction().begin();
			em.persist(dentista);
			em.getTransaction().commit();

			return true;
		}catch (Exception e) {
			return false;
		}
	}
	//=======================================================================================
	//	criarPaciente(String login, String senha, String perfil, String cpf)
	//=======================================================================================
	public boolean criarPaciente(String login, String senha, String perfil, String cpf) {

		try
		{
			EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

			Pessoa pessoa = new Pessoa();
			pessoa.setLogin(login);
			pessoa.setSenha(senha);
			pessoa.setPerfil(perfil);

			Paciente paciente = new Paciente();
			paciente.setCpfPaciente(cpf);
			paciente.setPessoa(pessoa);
			pessoa.setPaciente(paciente);

			em.getTransaction().begin();
			em.persist(paciente);
			em.getTransaction().commit();

			return true;
		}catch (Exception e) {
			return false;
		}

	}
	//=======================================================================================
	//						UPDATE DENTISTA
	//=======================================================================================
	public boolean editarPerfilDentista(String login, String perfil, 
			String dataNascimentoPessoa, String estadoCivilPessoa, String rgPessoa, 
			String nacionalidadePessoa, String naturalidadePessoa, String emailPessoa, String enderecoResidencialPessoa, 
			String cidadePessoa, String bairroPessoa, String ufPessoa, String cepPessoa, String fone1Pessoa, 
			String fone2Pessoa, String fone3Pessoa, String foneRecadoPessoa, String nomeRecadoPessoa, 
			String nomePaiPessoa, String nomeMaePessoa, String nome, String sobrenome, 
			String consultorioDentista, String enderecoConsultorio, String telefone1Consultorio, 
			String telefone2Consultorio, String cidadeConsultorio, String bairroConsultorio, 
			String ufConsultorio, String faxConsultorio, String websiteConsultorio, 
			String graduacaoCurriculo, String especializacaoCurriculo, String anoFormacaoCurriculo) {


		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("select p.codigoPessoa from Pessoa p where p.login=?1");
		q.setParameter(1, login);

		List pessoas =  q.getResultList();
		String id = (String) pessoas.get(0).toString();

		System.out.println("=====================================");
		System.out.println(id);
		System.out.println("=====================================");

		long idLong = Long.parseLong(id);

		updatePessoa( login,  perfil,  dataNascimentoPessoa, 
				estadoCivilPessoa,  rgPessoa,  nacionalidadePessoa,  naturalidadePessoa, 
				emailPessoa,  enderecoResidencialPessoa,  cidadePessoa,  bairroPessoa, 
				ufPessoa,  cepPessoa,  fone1Pessoa,  fone2Pessoa,  fone3Pessoa, 
				foneRecadoPessoa,  nomeRecadoPessoa,  nomePaiPessoa,  nomeMaePessoa, 
				nome,  sobrenome);

		em.getTransaction().begin();

		String dentistaUpdate = "update Dentista p set " +
		"p.consultorioDentista = :novoconsultorioDentista, "  +  
		"p.enderecoConsultorio = :novoenderecoConsultorio, "  +  
		"p.telefone1Consultorio = :novotelefone1Consultorio, "  +  
		"p.telefone2Consultorio = :novotelefone2Consultorio, " + 
		"p.cidadeConsultorio = :novocidadeConsultorio, " + 
		"p.bairroConsultorio = :novobairroConsultorio, " + 
		"p.ufConsultorio = :novoufConsultorio, " + 
		"p.faxConsultorio = :novofaxConsultorio, " + 
		"p.websiteConsultorio = :novowebsiteConsultorio, " + 
		"p.graduacaoCurriculo = :novograduacaoCurriculo, " + 
		"p.especializacaoCurriculo = :novoespecializacaoCurriculo, " + 
		"p.anoFormacaoCurriculo = :novoanoFormacaoCurriculo " + 
		"where p.pessoa.codigoPessoa = (select c.codigoPessoa from Pessoa c where c.codigoPessoa=:idp)";


		int updatedDentista = em.createQuery(dentistaUpdate).
		setParameter("novoconsultorioDentista", consultorioDentista).
		setParameter("novoenderecoConsultorio", enderecoConsultorio). 
		setParameter("novotelefone1Consultorio", telefone1Consultorio).
		setParameter("novotelefone2Consultorio", telefone2Consultorio).
		setParameter("novocidadeConsultorio", cidadeConsultorio).
		setParameter("novobairroConsultorio", bairroConsultorio). 
		setParameter("novoufConsultorio", ufConsultorio).
		setParameter("novofaxConsultorio", faxConsultorio).
		setParameter("novowebsiteConsultorio", websiteConsultorio).
		setParameter("novograduacaoCurriculo", graduacaoCurriculo). 
		setParameter("novoespecializacaoCurriculo", especializacaoCurriculo). 
		setParameter("novoanoFormacaoCurriculo", anoFormacaoCurriculo).
		setParameter("idp", idLong).executeUpdate();
		em.getTransaction().commit();

		System.out.println(updatedDentista + "Dentista ATUALIZADO");

		return true;
	}

	//=======================================================================================
	//						UPDATE PACIENTE
	//=======================================================================================
	public boolean editarPerfilPaciente(String login, String perfil, String dataNascimentoPessoa, 
			String estadoCivilPessoa, String rgPessoa, String nacionalidadePessoa, String naturalidadePessoa, 
			String emailPessoa, String enderecoResidencialPessoa, String cidadePessoa, String bairroPessoa, 
			String ufPessoa, String cepPessoa, String fone1Pessoa, String fone2Pessoa, String fone3Pessoa, 
			String foneRecadoPessoa, String nomeRecadoPessoa, String nomePaiPessoa, String nomeMaePessoa, 
			String nome, String sobrenome, String nomeResponsavelPaciente, 
			String ocupacaoPaciente, String profissaoPaciente, String indicacaoPaciente) {


		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("select p.codigoPessoa from Pessoa p where p.login=?1");
		q.setParameter(1, login);

		List pessoas =  q.getResultList();
		String id = (String) pessoas.get(0).toString();

		long idLong = Long.parseLong(id);

		updatePessoa( login,  perfil,  dataNascimentoPessoa, 
				estadoCivilPessoa,  rgPessoa,  nacionalidadePessoa,  naturalidadePessoa, 
				emailPessoa,  enderecoResidencialPessoa,  cidadePessoa,  bairroPessoa, 
				ufPessoa,  cepPessoa,  fone1Pessoa,  fone2Pessoa,  fone3Pessoa, 
				foneRecadoPessoa,  nomeRecadoPessoa,  nomePaiPessoa,  nomeMaePessoa, 
				nome,  sobrenome);

		em.getTransaction().begin();

		String pacienteUpdate = "update Paciente p set " +
		"p.nomeResponsavelPaciente = :novonomeResponsavelPaciente, "  +  
		"p.ocupacaoPaciente = :novoocupacaoPaciente, "  +  
		"p.profissaoPaciente = :novoprofissaoPaciente, "  +  
		"p.indicacaoPaciente = :novoindicacaoPaciente " + 
		"where p.pessoa.codigoPessoa = (select c.codigoPessoa from Pessoa c where c.codigoPessoa=:idp)";


		int updatedPaciente = em.createQuery(pacienteUpdate).
		setParameter("novonomeResponsavelPaciente", nomeResponsavelPaciente).
		setParameter("novoocupacaoPaciente", ocupacaoPaciente). 
		setParameter("novoprofissaoPaciente", profissaoPaciente).
		setParameter("novoindicacaoPaciente", indicacaoPaciente).
		setParameter("idp", idLong).executeUpdate();
		em.getTransaction().commit();



		System.out.println(updatedPaciente + "PACIENTE ATUALIZADO");

		return true;
	}
	//=======================================================================================
	//	validaJaExiste(String login,  String identificador)
	//=======================================================================================
	public boolean validaJaExiste(String login,  String identificador, String perfil) throws PersistenceException, GenericJDBCException, SqlException, NoResultException {


			EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

			Query q;
			
			if(perfil.equals("dentista"))
			{
					q = em.createQuery("select p from Pessoa p where p.login=?1 or p.dentista.cro=?2");

				q.setParameter(1, login);
				q.setParameter(2, identificador);
				
			}else
			{
					q = em.createQuery("select p from Pessoa p where p.login=?1 or p.paciente.cpfPaciente=?2");

				q.setParameter(1, login);
				q.setParameter(2, identificador);
			}
			
			List pessoas =  q.getResultList();

			if(pessoas.size()!=0)
				return false;
			else
				return true;		
	
	}
	//=======================================================================================
	//						UPDATE PESSOA()
	//=======================================================================================
	public boolean updatePessoa(String login, String perfil, String dataNascimentoPessoa, String estadoCivilPessoa, String rgPessoa, String nacionalidadePessoa, String naturalidadePessoa, String emailPessoa, String enderecoResidencialPessoa, String cidadePessoa, String bairroPessoa, String ufPessoa, String cepPessoa, String fone1Pessoa, String fone2Pessoa, String fone3Pessoa, String foneRecadoPessoa, String nomeRecadoPessoa, String nomePaiPessoa, String nomeMaePessoa, String nome, String sobrenome)
	{
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		em.getTransaction().begin();

		String ejbqlUpdate = "update Pessoa p set " +
		"p.dataNascimentoPessoa = :novodataNascimentoPessoa, " +    
		"p.estadoCivilPessoa = :novoestadoCivilPessoa, "  +  
		"p.rgPessoa = :novorgPessoa, "  +  
		"p.nacionalidadePessoa = :novonacionalidadePessoa, "  +  
		"p.naturalidadePessoa = :novonaturalidadePessoa, "  +  
		"p.emailPessoa = :novoemailPessoa, "  +  
		"p.enderecoResidencialPessoa = :novoenderecoResidencialPessoa, "  +  
		"p.cidadePessoa = :novocidadePessoa, "  +  
		"p.bairroPessoa = :novobairroPessoa, "  +  
		"p.ufPessoa = :novoufPessoa, "  +  
		"p.cepPessoa = :novocepPessoa, "  +  
		"p.fone1Pessoa = :novofone1Pessoa, "  +  
		"p.fone2Pessoa = :novofone2Pessoa, "  +  
		"p.fone3Pessoa = :novofone3Pessoa, "  +  
		"p.foneRecadoPessoa = :novofoneRecadoPessoa, "   +  
		"p.nomeRecadoPessoa = :novonomeRecadoPessoa, "  +  
		"p.nomePaiPessoa = :novonomePaiPessoa, "  +  
		"p.nomeMaePessoa = :novonomeMaePessoa, "  +  
		"p.nome = :novonome, "  +  
		"p.sobrenome = :novosobrenome "  + 
		"where p.login = :oldLogin ";

		int updatedEntities = em.createQuery(ejbqlUpdate).
		setParameter("novodataNascimentoPessoa", dataNascimentoPessoa).
		setParameter("novoestadoCivilPessoa", estadoCivilPessoa). 

		setParameter("novorgPessoa", rgPessoa).

		setParameter("novonacionalidadePessoa", nacionalidadePessoa).

		setParameter("novonaturalidadePessoa", naturalidadePessoa).

		setParameter("novoemailPessoa",emailPessoa).

		setParameter("novoenderecoResidencialPessoa", enderecoResidencialPessoa).

		setParameter("novocidadePessoa", cidadePessoa).

		setParameter("novobairroPessoa", bairroPessoa).

		setParameter("novoufPessoa", ufPessoa).

		setParameter("novocepPessoa", cepPessoa).

		setParameter("novofone1Pessoa", fone1Pessoa).

		setParameter("novofone2Pessoa", fone2Pessoa).

		setParameter("novofone3Pessoa", fone3Pessoa).

		setParameter("novofoneRecadoPessoa" , foneRecadoPessoa).

		setParameter("novonomeRecadoPessoa", nomeRecadoPessoa).

		setParameter("novonomePaiPessoa", nomePaiPessoa).

		setParameter("novonomeMaePessoa", nomeMaePessoa).

		setParameter("novonome", nome).

		setParameter("novosobrenome", sobrenome).

		setParameter("oldLogin", login).executeUpdate();
		em.getTransaction().commit();
		if(updatedEntities > 0)
		{
			System.out.println(updatedEntities + "PESSOA ATUALIZADA");
			return true;
		}
		else
		{
			return false;
		}	
	}
	//=======================================================================================
	//	buscarDentistas()
	//=======================================================================================
	public List buscarDentistas() {


		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("from Pessoa p where p.perfil =?1");

		q.setParameter(1, "dentista");

		try {
			List listaPessoas;

			listaPessoas =  q.getResultList();	

			return listaPessoas;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}

	//=======================================================================================
	//						recuperarPacientes()
	//=======================================================================================
	@Override
	public List recuperarPacientes() {
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("from Pessoa p where p.perfil =?1");

		q.setParameter(1, "paciente");

		try {
			List listaPessoas;

			listaPessoas =  q.getResultList();	

			return listaPessoas;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	//=======================================================================================
	//	concederPermissao(String cro, String cpf)
	//=======================================================================================
	@Override
	public boolean concederPermissao(String cro, String cpf)  {

		System.out.println("CPF>>>>>>>>>>>>>>>>>>>" + cpf);
		System.out.println("CRO>>>>>>>>>>>>>>>>>>>" + cro);
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query selectPaciente = em.createQuery("from Pessoa p where p.paciente.cpfPaciente =?1");
		selectPaciente.setParameter(1, cpf);

		Query selectDentista = em.createQuery("from Pessoa p where p.dentista.cro =?1");
		selectDentista.setParameter(1, cro);

		try
		{
			Pessoa paciente = new Pessoa();
			Pessoa dentista = new Pessoa();
			Permissao permissao = new Permissao();

			paciente = (Pessoa) selectPaciente.getSingleResult();
			dentista = (Pessoa) selectDentista.getSingleResult();

			permissao.setPaciente(paciente.getPaciente());
			permissao.setDentista(dentista.getDentista());
			paciente.getPaciente().getPermissao().add(permissao);
			dentista.getDentista().getPermissao().add(permissao);

			em.getTransaction().begin();
			em.persist(permissao);
			em.getTransaction().commit();
		
			return true;

		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	//=======================================================================================
	//	recuperarPermissoesPaciente()
	//=======================================================================================
	public List recuperarPermissoesPaciente(String cpf) {

		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("from Permissao p where paciente_permissao =?1");

		q.setParameter(1, cpf);

		try {
			List permissoes;

			permissoes =  q.getResultList();	

			return permissoes;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	

	}
	//=======================================================================================
	//	recuperarPermissoesDentista()
	//=======================================================================================
	@Override
	public List recuperarPermissoesDentista(String cro) {
		// TODO Auto-generated method stub
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("from Permissao p where dentista_permissao =?1");

		q.setParameter(1, cro);

		try {
			List permissoes;

			permissoes =  q.getResultList();	
			for(int i=0;i<permissoes.size();i++)
			{
				Permissao p = (Permissao) permissoes.get(i);
				em.refresh(p);
			}
				
			return permissoes;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	//=======================================================================================
	//	recuperarPaciente()
	//=======================================================================================
	public Pessoa recuperarPessoa(String login) {

		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("select p from Pessoa p where login =?1");

		q.setParameter(1, login);

		try {
			Pessoa p = new Pessoa();
			p= (Pessoa) q.getSingleResult();
			System.out.println("SOBRENOME PESSOA>>> " + p.getSobrenome());

			return p;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	//=======================================================================================
	//	editarAnamneseGeral()
	//=======================================================================================
	public boolean editarAnamneseGeral() {
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");



		System.out.println("ANAMNESE GERAL ATUALIZADA");

		return true;
	}
	//=======================================================================================
	//	VerificaExistenciaAnamneseGeral()
	//=======================================================================================
	public boolean verificaExistenciaAnamneseGeral(String login) {
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("select p from Pessoa p where login =?1");

		q.setParameter(1, login);

		try {
			Pessoa p = new Pessoa();
			p= (Pessoa) q.getSingleResult();
			if(p.getPaciente().getAnameseGeral() == null)
				return false;

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	//=======================================================================================
	//	criaAnamneseGeral
	//=======================================================================================
	public boolean criaAnamneseGeral(String login, String apresentaProblemas, 
			String estaEmTratamentoMedico, String nomeMedico, String telefoneMedico, String tomaMedicamento,
			String qualMedicamento, String quandoMedicoUltimaVez, String qualUltimoTratamento, 
			String jaPassouCirurgia, String tipoCirurgia, String dataCirurgia, String doencaSeria, String qualDoencaSeria, 
			String antineoplasticoFace, String tempoAntioneoplastico, String fumante, String qtdeCigarrosDiarios,
			String bebidaAlcoolicaFrequente, String gravidaAmamentando, String mesesGravidez, String outrasInformacoes, 
			String ganhouPerdeuPesoUltimamente, String faltaDeAr, String juntasIncham, String tonturasDesmaios, 
			String demoraCicatrizar, String hemorragia, String drogas, String tiposDrogas) {
		
		
		try
		{
			EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
			Query q = em.createQuery("select p from Pessoa p where login =?1");

			q.setParameter(1, login);

				AnamneseGeral anamneseGeral= null;
		
				Pessoa p = new Pessoa();
				p= (Pessoa) q.getSingleResult();

				if(p.getPaciente().getAnameseGeral() ==null)
		anamneseGeral = new AnamneseGeral();
				
				else
		anamneseGeral = p.getPaciente().getAnameseGeral();
				
				anamneseGeral.setAntineoplasticoFace(antineoplasticoFace);
				anamneseGeral.setBebidaAlcoolicaFrequente(bebidaAlcoolicaFrequente);
				anamneseGeral.setDataCirurgia(dataCirurgia);
				anamneseGeral.setDemoraCicatrizar(demoraCicatrizar);
				anamneseGeral.setDoencaSeria(qualDoencaSeria);
				anamneseGeral.setDrogas(drogas);
				anamneseGeral.setApresentaProblemaDeSaude(apresentaProblemas);
				anamneseGeral.setEstaEmTratamentoMedico(estaEmTratamentoMedico);
				anamneseGeral.setFaltaDeAr(faltaDeAr);
				anamneseGeral.setFumante(fumante);
				anamneseGeral.setGanhouPerdeuPesoUltimamente(ganhouPerdeuPesoUltimamente);
				anamneseGeral.setGravidaAmamentando(gravidaAmamentando);
				anamneseGeral.setHemooragia(hemorragia);
				anamneseGeral.setJaPassouCirurgia(jaPassouCirurgia);
				anamneseGeral.setJuntasIncham(juntasIncham);
				anamneseGeral.setMesesGravidez(mesesGravidez);
				anamneseGeral.setNomeMedico(nomeMedico);
				anamneseGeral.setOutrasInformacoes(outrasInformacoes);
				anamneseGeral.setPaciente(p.getPaciente());
				anamneseGeral.setQtdeCigarrosDiarios(qtdeCigarrosDiarios);
				anamneseGeral.setQualDoencaSeria(qualDoencaSeria);
				anamneseGeral.setQualMedicamento(qualMedicamento);
				anamneseGeral.setQualUltimoTratamento(qualUltimoTratamento);
				anamneseGeral.setQuandoMedicoUltimaVez(quandoMedicoUltimaVez);
				anamneseGeral.setTelefoneMedico(telefoneMedico);
				anamneseGeral.setTempoAntioneoplastico(tempoAntioneoplastico);
				anamneseGeral.setTipoCirurgia(tipoCirurgia);
				anamneseGeral.setTiposDrogas(tiposDrogas);
				anamneseGeral.setTomaMedicamento(tomaMedicamento);
				anamneseGeral.setTonturasDesmaios(tonturasDesmaios);
				anamneseGeral.setTiposDrogas(tiposDrogas);
				
				p.getPaciente().setAnameseGeral(anamneseGeral);
				em.getTransaction().begin();
				em.persist(p);
				em.persist(anamneseGeral);
				em.getTransaction().commit();
				em.refresh(p);
				em.refresh(anamneseGeral);
				
			return true;
		}catch (Exception e) {
			return false;
		}
	}
//=======================================================================================
//	REFRESH
//=======================================================================================
	public boolean refresh(String login) {
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("select p from Pessoa p where login =?1");

		q.setParameter(1, login);

		try {
			Pessoa p = new Pessoa();
			p= (Pessoa) q.getSingleResult();
			
			em.refresh(p);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
//=======================================================================================
//	RECUPERAR ANAMNESEGERAL
//=======================================================================================	

	public AnamneseGeral recuperarAnamneseGeralPaciente(String login) {
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query q = em.createQuery("select p from Pessoa p where login =?1");

		q.setParameter(1, login);
		
		try {
			Pessoa p = new Pessoa();
			p= (Pessoa) q.getSingleResult();
			
			
			return p.getPaciente().getAnameseGeral();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
//=======================================================================================
//	GRAVAR DADOS DO DENTE
//=======================================================================================	
	public boolean gravarDadosDente(String loginPaciente, String numeroDente, String situacaoPresente,
			String canal, String cAD, String cTEX, String cTG, String cTES, String cRD, String cT, 
			String referencia, String instrumento, String instrumentoPatencia, String numDA, 
			String numDC, String x, String incidenciaDoRX, String conePrincipal, 
			String cimentoObturador, String tecnicaObturacao) {

		
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		Query q = em.createQuery("from Pessoa p where login =?1");

		q.setParameter(1, loginPaciente);

		
		
		try{
			
				Pessoa p = new Pessoa();
				Dente dente = new Dente();

				p = (Pessoa) q.getSingleResult();
				
				System.out.println(p.getPaciente().getCpfPaciente());
				
				dente.setCAD(cAD);
				dente.setCanal(canal);
				dente.setCimentoObturador(cimentoObturador);
				dente.setConePrincipal(conePrincipal);
				dente.setCRD(cRD);
				dente.setCT(cT);
				dente.setCTES(cTES);
				dente.setCTEX(cTEX);
				dente.setCTG(cTG);
				dente.setIncidenciaDoRX(incidenciaDoRX);
				dente.setInstrumento(instrumento);
				dente.setInstrumentoPatencia(instrumentoPatencia);
				dente.setNumDA(numDA);
				dente.setNumDC(numDC);
				dente.setNumeroDente(numeroDente);
				dente.setPaciente(p.getPaciente());
				dente.setReferencia(referencia);
				dente.setSituacaoPresente(situacaoPresente);
				dente.setTecnicaObturacao(tecnicaObturacao);
				dente.setX(x);
				
				dente.setPaciente(p.getPaciente());				
				
				p.getPaciente().getDente().add(dente);
				
				System.out.println("VAZIO? " + p.getPaciente().getDente().isEmpty());
				System.out.println("LOGIN DENTRO DO DENTE> " + dente.getPaciente().getPessoa().getLogin());
				
				em.getTransaction().begin();
				em.persist(dente);
				em.getTransaction().commit();
				System.out.println("GRAVOU!");
								
				return true;
				
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e.getMessage());
				return false;
			}
		
	}
//=======================================================================================
//	RECUPERAR DADOS DO DENTE
//=======================================================================================	
	public Dente recuperarDadosDente(String paciente, String numeroDente) {
		
	
			// TODO Auto-generated method stub
			EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

			Query s = em.createQuery("select p from Pessoa p where login =?1");

			s.setParameter(1, paciente);
			
			Pessoa p = new Pessoa();
			p= (Pessoa) s.getSingleResult();
			
			String cpf = p.getPaciente().getCpfPaciente();
			
			Query q = em.createQuery("from Dente d where paciente_dente =?1 and numeroDente =?2");

			q.setParameter(1, cpf);
			q.setParameter(2, numeroDente);
			
			try {
				List dentes;

				dentes =  q.getResultList();	
				
				Dente dente = (Dente) dentes.get(0);
				em.refresh(dente);

				if(dente == null)
				{
				
					return null;
				}
				return dente;

			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}	
		}
//=======================================================================================
//	UPDATE DATE
//=======================================================================================	
	public boolean updateDente(String loginPaciente, String numeroDente, String situacaoPresente, String canal, String cAD, String cTEX, String cTG, String cTES, String cRD, String cT, String referencia, String instrumento, String instrumentoPatencia, String numDA, String numDC, String x, String incidenciaDoRX, String conePrincipal, String cimentoObturador, String tecnicaObturacao) {
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		em.getTransaction().begin();

		String ejbqlUpdate = "update Dente p set " +
		"p.CAD = :novoCAD, " +    
		"p.canal = :novocanal, "  +  
		"p.cimentoObturador = :novocimentoObturador, "  +  
		"p.conePrincipal = :novoconePrincipal, "  +  
		"p.CRD = :novoCRD, "  +  
		"p.CT = :novoCT, "  +  
		"p.CTES = :novoCTES, "  +  
		"p.CTEX = :novoCTEX, "  +  
		"p.CTG = :novoCTG, "  +  
		"p.incidenciaDoRX = :novoincidenciaDoRX, "  +  
		"p.instrumento = :novoinstrumento, "  +  
		"p.instrumentoPatencia = :novoinstrumentoPatencia, "  +  
		"p.numDA = :novonumDA, "  +  
		"p.numDC = :novonumDC, "  +  
		"p.referencia = :novoreferencia, "  +  
		"p.situacaoPresente = :novosituacaoPresente, "  +  
		"p.tecnicaObturacao = :novotecnicaObturacao, "  +  
		"p.X = :novoX "  + 
		"where p.numeroDente = :oldNumeroDente ";
		

		int updatedEntities = em.createQuery(ejbqlUpdate).
		setParameter("novoCAD", cAD).
		setParameter("novocanal", canal). 

		setParameter("novocimentoObturador", cimentoObturador).

		setParameter("novoconePrincipal", conePrincipal).

		setParameter("novoCRD", cRD).

		setParameter("novoCT",cT).

		setParameter("novoCTES", cTES).

		setParameter("novoCTEX", cTEX).

		setParameter("novoCTG", cTG).

		setParameter("novoincidenciaDoRX", incidenciaDoRX).

		setParameter("novoinstrumento", instrumento).

		setParameter("novoinstrumentoPatencia", instrumentoPatencia).

		setParameter("novonumDA", numDA).

		setParameter("novonumDC", numDC).

		setParameter("novoreferencia", referencia).

		setParameter("novosituacaoPresente", situacaoPresente).

		setParameter("novotecnicaObturacao", tecnicaObturacao).

		setParameter("novoX", x).

		setParameter("oldNumeroDente", numeroDente).executeUpdate();
		em.getTransaction().commit();
		if(updatedEntities > 0)
		{
			System.out.println(updatedEntities + "DENTE ATUALIZADO");
	
			return true;
		}
		else
		{
			return false;
		}	
	}
//=======================================================================================
//	VERIFICA SE O DENTE JA EXISTE
//=======================================================================================	
	public boolean denteExiste(String numeroDente, String paciente) {
		// TODO Auto-generated method stub
		
		System.out.println("ESTA VERIFICANDO SE O DENTE EXISTE..... ");
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		Query q = em.createQuery("from Pessoa p where login =?1");

		q.setParameter(1, paciente);
		
		Pessoa p = new Pessoa();
		Dente dente = new Dente();

		try{
			
			p = (Pessoa) q.getSingleResult();
			//Verifica se Dente ja existe
			
			Query denteExiste = em.createQuery("from Dente d where paciente_dente =?1 ");
			denteExiste.setParameter(1, p.getPaciente().getCpfPaciente());
			
			List dentesExistentes = denteExiste.getResultList();	
			
			for(int i=0;i<dentesExistentes.size();i++)
			{
				dente = (Dente) dentesExistentes.get(i);
				if(numeroDente.equals(dente.getNumeroDente()))
				{
					
					
					return true;
	
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			
		}
			
		return false;
			

	}
//=======================================================================================
//	GRAVANDO NOVO PROGNOSTICO
//=======================================================================================	
	public boolean criarPrognostico(String numeroDente, String loginPaciente, String dataEndodontia, String presencaDor, String sondagemGengival, String grauMobilidade, String exposicaoClinicaFurca, String retracaoGengival, String dorPerussaoVertical, String dorPercussaoHorizontal, String dorPalpacaoApical, String testesSensibilidadePulparUtilizado, String edemiaIntraBucal, String esemiaExtraOral, String carie, String corCoroaAlterada, String coroaProtetica, String exposicaoPulpar, String fistula, String fraturaCoroa, String luxacaoDental, String restauracao, String traumaOclusal, String outrosSinaisClinicos, String carieCoroa, String carieRaiz, String calcificacaoCanal, String noduloPulpar, String canaisObturados, String sobreObturacao, String instrumentoFraturado, String espessamentoPeriodontalApical, String espessamentoPeriodontalLateral, String nucleoMetalico, String perficacaoRadicular, String pulpotomia, String lesaoPeriodontalLateral, String lesaoPeriapical, String hipercrementose, String reabsorcaoExtremaCervical, String reabsorcaoInterna, String lesaoFurca, String raizCurva, String raizDelgada, String rizogeneseIncompleta, String densidadeDente, String fraturaRaiz, String outrosSinaisRadiograficos, String polpaNormal, String pulpiteAgudaReversivel, String pulpiteAgudaReversibilidadeDuvidosa, String pulpiteAgudaIrreversivel, String pulpiteCronicaHiperplastica, String necrosePulpar, String pericementiteApicalAguda, String abcessoDentoAlveolarAgudoFaseInicial, String abcessoDentoAlveolarAgudoFaseEvolucao, String abcessoDentoAlveolarAgudoFaseEvoluida, String lesaoPeriapicalCronicaCircunscrita, String lesaoPeriapicalCronicaDifusa, String lesaoEndoPeriodontal, String tratamentoIndicato) {
		
		
		try{
			System.out.println("ESTA GRAVANDO UM NOVO PROGNOSTICO.... ");
			EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
			
			Endodontia endodontia = new Endodontia();
			
			
			
		
			String loginPacien=loginPaciente;
			String dataEndodon=dataEndodontia;
			String sondagemGen=sondagemGengival;
			String grauMobilid=grauMobilidade;
			String exposicaoCl=exposicaoClinicaFurca;
			String retracaoGen=retracaoGengival;
			String dorPerussaoV=dorPerussaoVertical;
			String dorPercussaH=dorPercussaoHorizontal;
			String dorPalpacao=dorPalpacaoApical;
			String testesSensi=testesSensibilidadePulparUtilizado;
			String edemiaIntra=edemiaIntraBucal;
			String esemiaExtra=esemiaExtraOral;
			String corCoroaAlt=corCoroaAlterada;
			String coroaProtet=coroaProtetica;
			String exposicaoPu=exposicaoPulpar;
			String fraturaCoro=fraturaCoroa;
			String luxacaoDent=luxacaoDental;
			String outrosSinaiCli=outrosSinaisClinicos;
			String calcificaca=calcificacaoCanal;
			String noduloPulpa=noduloPulpar;
			String canaisObtur=canaisObturados;
			String sobreObtura=sobreObturacao;
			String instrumento=instrumentoFraturado;
			String espessamenAPIC=espessamentoPeriodontalApical;
			String espessament=espessamentoPeriodontalLateral;
			String nucleoMetal=nucleoMetalico;
			String perficacaoR=perficacaoRadicular; 
			String lesaoPeriod=lesaoPeriodontalLateral;
			String lesaoPeriaLATE=lesaoPeriapical;
			String hipercremen=hipercrementose;
			String reabsorcaoE=reabsorcaoExtremaCervical;
			String reabsorcaoI=reabsorcaoInterna;
			String rizogeneseI=rizogeneseIncompleta;
			String densidadeDe=densidadeDente;
			String outrosSinai=outrosSinaisRadiograficos;
			String pulpiteAguREVER=pulpiteAgudaReversivel;
			String pulpiteAgud=pulpiteAgudaReversibilidadeDuvidosa;
			String pulpiteCron=pulpiteCronicaHiperplastica;
			String necrosePulp=necrosePulpar;
			String pericementi=pericementiteApicalAguda;
			String abcessoDINI=abcessoDentoAlveolarAgudoFaseInicial;
			String abcessoDenEVOt=abcessoDentoAlveolarAgudoFaseEvolucao;
			String abcessoDent=abcessoDentoAlveolarAgudoFaseEvoluida;
			String lesaoPeriapCIRCUN=lesaoPeriapicalCronicaCircunscrita;
			String lesaoPeriap=lesaoPeriapicalCronicaDifusa;
			String lesaoEndoPe=lesaoEndoPeriodontal;
			String tratamentoI=tratamentoIndicato; 
		
			
			endodontia.setNumeroDente(numeroDente);
			endodontia.setLoginPacien(loginPacien);
			endodontia.setDataEndodon(dataEndodon);
			endodontia.setPresencaDor(presencaDor);
			endodontia.setSondagemGen(sondagemGen);
			endodontia.setGrauMobilid(grauMobilid);
			endodontia.setExposicaoCl(exposicaoCl);
			endodontia.setRetracaoGen(retracaoGen);
			endodontia.setNumeroDente(numeroDente);
			endodontia.setLoginPacien(loginPacien);
			endodontia.setDataEndodon(dataEndodon);
			endodontia.setPresencaDor(presencaDor);
			endodontia.setSondagemGen(sondagemGen);
			endodontia.setGrauMobilid(grauMobilid);
			endodontia.setExposicaoCl(exposicaoCl);
			endodontia.setRetracaoGen(retracaoGen);
			endodontia.setDorPerussao(dorPerussaoV);
			endodontia.setDorPercussa(dorPercussaH);
			endodontia.setDorPalpacao(dorPalpacao);
			endodontia.setTestesSensi(testesSensi);
			endodontia.setEdemiaIntra(edemiaIntra);
			endodontia.setEsemiaExtra(esemiaExtra);
			endodontia.setCarie(carie);
			endodontia.setCorCoroaAlt(corCoroaAlt);
			endodontia.setCoroaProtet(coroaProtet);
			endodontia.setExposicaoPu(exposicaoPu);
			endodontia.setFistula(fistula);
			endodontia.setFraturaCoro(fraturaCoro);
			endodontia.setLuxacaoDent(luxacaoDent);
			endodontia.setRestauracao(restauracao);
			endodontia.setOutrosSinaiCli(outrosSinaiCli);
			endodontia.setCarieCoroa(carieCoroa);
			endodontia.setCarieRaiz(carieRaiz);
			endodontia.setCalcificaca(calcificaca);
			endodontia.setNoduloPulpa(noduloPulpa);
			endodontia.setCanaisObtur(canaisObtur);
			endodontia.setSobreObtura(sobreObtura);
			endodontia.setInstrumento(instrumento);
			endodontia.setEspessamenAPIC(espessamenAPIC);
			endodontia.setEspessament(espessament);
			endodontia.setNucleoMetal(nucleoMetal);
			endodontia.setPerficacaoR(perficacaoR);
			endodontia.setPulpotomia(pulpotomia);
			endodontia.setLesaoPeriod(lesaoPeriod);
			endodontia.setLesaoPeriaLATE(lesaoPeriaLATE);
			endodontia.setHipercremen(hipercremen);
			endodontia.setReabsorcaoE(reabsorcaoE);
			endodontia.setReabsorcaoI(reabsorcaoI);
			endodontia.setLesaoFurca(lesaoFurca);
			endodontia.setRaizCurva(raizCurva);
			endodontia.setRaizDelgada(raizDelgada);
			endodontia.setRizogeneseI(rizogeneseI);
			endodontia.setDensidadeDe(densidadeDe);
			endodontia.setFraturaRaiz(fraturaRaiz);
			endodontia.setOutrosSinai(outrosSinai);
			endodontia.setPolpaNormal(polpaNormal);
			endodontia.setPulpiteAguREVER(pulpiteAguREVER);
			endodontia.setPulpiteAgud(pulpiteAgud);
			endodontia.setPulpiteAgud(pulpiteAgud);
			endodontia.setPulpiteCron(pulpiteCron);
			endodontia.setNecrosePulp(necrosePulp);
			endodontia.setPericementi(pericementi);
			endodontia.setAbcessoDINI(abcessoDINI);
			endodontia.setAbcessoDenEVOt(abcessoDenEVOt);
			endodontia.setAbcessoDent(abcessoDent);
			endodontia.setLesaoPeriapCIRCUN(lesaoPeriapCIRCUN);
			endodontia.setLesaoPeriap(lesaoPeriap);
			endodontia.setLesaoEndoPe(lesaoEndoPe);
			endodontia.setTratamentoI(tratamentoI);
			endodontia.setTraumaOclusal(traumaOclusal);

			// COLOCAR ATRIBUTOS
			
			em.getTransaction().begin();
			em.persist(endodontia);
			em.getTransaction().commit();

			System.out.println("GRAVOU!");
						
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			return false;
		}
		
	}
//=======================================================================================
//	Endodontia Existe
//=======================================================================================	
	public boolean EndodontiaExiste(String numeroDente, String loginPaciente) {
		System.out.println("ESTA VERIFICANDO SE A ENDODONTIA EXISTE..... ");
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		Query q = em.createQuery("from Endodontia p where loginpacien =?1 and numerodente=?2");

		q.setParameter(1, loginPaciente);
		q.setParameter(2, numeroDente);
		
		Endodontia endodontia = new Endodontia();
		try{
			
			endodontia = (Endodontia) q.getSingleResult();
			//Verifica se Dente ja existe
			
		
			if(endodontia == null)
				return false;
			else
				return true;
			
			
		}catch (Exception e) {
			System.out.println("Problemas ao verificar se Endodontia Existe");
			
		}
			
		return false;
	}
//=======================================================================================
//	UPDATE ENDODONTIA
//=======================================================================================	
	public boolean updateEndodontia(String numeroDente, String loginPaciente,
			String dataEndodontia, String presencaDor, String sondagemGengival,
			String grauMobilidade, String exposicaoClinicaFurca,
			String retracaoGengival, String dorPerussaoVertical,
			String dorPercussaoHorizontal, String dorPalpacaoApical,
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
		
		String loginPacien=loginPaciente;
		String dataEndodon=dataEndodontia;
		String sondagemGen=sondagemGengival;
		String grauMobilid=grauMobilidade;
		String exposicaoCl=exposicaoClinicaFurca;
		String retracaoGen=retracaoGengival;
		String dorPerussaoV=dorPerussaoVertical;
		String dorPercussaH=dorPercussaoHorizontal;
		String dorPalpacao=dorPalpacaoApical;
		String testesSensi=testesSensibilidadePulparUtilizado;
		String edemiaIntra=edemiaIntraBucal;
		String esemiaExtra=esemiaExtraOral;
		String corCoroaAlt=corCoroaAlterada;
		String coroaProtet=coroaProtetica;
		String exposicaoPu=exposicaoPulpar;
		String fraturaCoro=fraturaCoroa;
		String luxacaoDent=luxacaoDental;
		String outrosSinaiCli=outrosSinaisClinicos;
		String calcificaca=calcificacaoCanal;
		String noduloPulpa=noduloPulpar;
		String canaisObtur=canaisObturados;
		String sobreObtura=sobreObturacao;
		String instrumento=instrumentoFraturado;
		String espessamenAPIC=espessamentoPeriodontalApical;
		String espessament=espessamentoPeriodontalLateral;
		String nucleoMetal=nucleoMetalico;
		String perficacaoR=perficacaoRadicular; 
		String lesaoPeriod=lesaoPeriodontalLateral;
		String lesaoPeriaLATE=lesaoPeriapical;
		String hipercremen=hipercrementose;
		String reabsorcaoE=reabsorcaoExtremaCervical;
		String reabsorcaoI=reabsorcaoInterna;
		String rizogeneseI=rizogeneseIncompleta;
		String densidadeDe=densidadeDente;
		String outrosSinai=outrosSinaisRadiograficos;
		String pulpiteAguREVER=pulpiteAgudaReversivel;
		String pulpiteAgud=pulpiteAgudaReversibilidadeDuvidosa;
		String pulpiteCron=pulpiteCronicaHiperplastica;
		String necrosePulp=necrosePulpar;
		String pericementi=pericementiteApicalAguda;
		String abcessoDINI=abcessoDentoAlveolarAgudoFaseInicial;
		String abcessoDenEVOt=abcessoDentoAlveolarAgudoFaseEvolucao;
		String abcessoDent=abcessoDentoAlveolarAgudoFaseEvoluida;
		String lesaoPeriapCIRCUN=lesaoPeriapicalCronicaCircunscrita;
		String lesaoPeriap=lesaoPeriapicalCronicaDifusa;
		String lesaoEndoPe=lesaoEndoPeriodontal;
		String tratamentoI=tratamentoIndicato; 
		
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		em.getTransaction().begin();

		String ejbqlUpdate = "update Endodontia p set " +
		"p.loginPacien = :nVloginPacien, " +
		"p.dataEndodon= :nVdataEndodon, " +
		"p.presencaDor= :nVpresencaDor, " +
		"p.sondagemGen= :nVsondagemGen, " +
		"p.grauMobilid= :nVgrauMobilid, " +
		"p.exposicaoCl= :nVexposicaoCl, " +
		"p.retracaoGen= :nVretracaoGen, " +
		"p.dorPerussao = :nVdorPerussaoV, " +
		"p.dorPercussa = :nVdorPercussaH, " +
		"p.dorPalpacao= :nVdorPalpacao, " +
		"p.testesSensi= :nVtestesSensi, " +
		"p.edemiaIntra= :nVedemiaIntra, " +
		"p.esemiaExtra= :nVesemiaExtra, " +
		"p.carie= :nVcarie, " +
		"p.corCoroaAlt= :nVcorCoroaAlt, " +
		"p.coroaProtet= :nVcoroaProtet, " +
		"p.exposicaoPu= :nVexposicaoPu, " +
		"p.fistula= :nVfistula, " +
		"p.fraturaCoro= :nVfraturaCoro, " +
		"p.luxacaoDent= :nVluxacaoDent, " +
		"p.restauracao= :nVrestauracao, " +
		"p.traumaOclusal= :nVtraumaOclusal, " +
		"p.outrosSinaiCli= :nVoutrosSinaiCli, " +
		"p.carieCoroa= :nVcarieCoroa, " +
		"p.carieRaiz= :nVcarieRaiz, " +
		"p.calcificaca= :nVcalcificaca, " +
		"p.noduloPulpa= :nVnoduloPulpa, " +
		"p.canaisObtur= :nVcanaisObtur, " +
		"p.sobreObtura= :nVsobreObtura, " +
		"p.instrumento= :nVinstrumento, " +
		"p.espessamenAPIC= :nVespessamenAPIC, " +
		"p.espessament= :nVespessament, " +
		"p.nucleoMetal= :nVnucleoMetal, " +
		"p.perficacaoR= :nVperficacaoR, " +
		"p.pulpotomia= :nVpulpotomia, " +
		"p.lesaoPeriod= :nVlesaoPeriod, " +
		"p.lesaoPeriaLATE= :nVlesaoPeriaLATE, " +
		"p.hipercremen= :nVhipercremen, " +
		"p.reabsorcaoE= :nVreabsorcaoE, " +
		"p.reabsorcaoI= :nVreabsorcaoI, " +
		"p.lesaoFurca= :nVlesaoFurca, " +
		"p.raizCurva= :nVraizCurva, " +
		"p.raizDelgada= :nVraizDelgada, " +
		"p.rizogeneseI= :nVrizogeneseI, " +
		"p.densidadeDe= :nVdensidadeDe, " +
		"p.fraturaRaiz= :nVfraturaRaiz, " +
		"p.outrosSinai= :nVoutrosSinai, " +
		"p.polpaNormal= :nVpolpaNormal, " +
		"p.pulpiteAguREVER= :nVpulpiteAguREVER, " +
		"p.pulpiteAgud= :nVpulpiteAgud, " +
		"p.pulpiteCron= :nVpulpiteCron, " +
		"p.necrosePulp= :nVnecrosePulp, " +
		"p.pericementi= :nVpericementi, " +
		"p.abcessoDINI= :nVabcessoDINI, " +
		"p.abcessoDenEVOt= :nVabcessoDenEVOt, " +
		"p.abcessoDent= :nVabcessoDent, " +
		"p.lesaoPeriapCIRCUN= :nVlesaoPeriapCIRCUN, " +
		"p.lesaoPeriap= :nVlesaoPeriap, " +
		"p.lesaoEndoPe= :nVlesaoEndoPe, " +
		"p.tratamentoI= :nVtratamentoI " +
		"where p.numeroDente = :oldNumeroDente and p.loginPacien =:nVloginPacien";
		
		
		System.out.println("----------------- QUEM EH NULO???? ------------------");
		System.out.println("loginPacien" + " > " +loginPacien);
		System.out.println("dataEndodon" + " > " +dataEndodon);
		System.out.println("presencaDor" + " > " +presencaDor);
		System.out.println("sondagemGen" + " > " +sondagemGen);
		System.out.println("grauMobilid" + " > " +grauMobilid);
		System.out.println("exposicaoCl" + " > " +exposicaoCl);
		System.out.println("retracaoGen" + " > " +retracaoGen);
		System.out.println("dorPerussaoV" + " > " +dorPerussaoV);
		System.out.println("dorPercussaH" + " > " +dorPercussaH);
		System.out.println("dorPalpacao" + " > " +dorPalpacao);
		System.out.println("testesSensi" + " > " +testesSensi);
		System.out.println("edemiaIntra" + " > " +edemiaIntra);
		System.out.println("esemiaExtra" + " > " +esemiaExtra);
		System.out.println("carie" + " > " +carie);
		System.out.println("corCoroaAlt" + " > " +corCoroaAlt);
		System.out.println("coroaProtet" + " > " +coroaProtet);
		System.out.println("exposicaoPu" + " > " +exposicaoPu);
		System.out.println("fistula" + " > " +fistula);
		System.out.println("fraturaCoro" + " > " +fraturaCoro);
		System.out.println("luxacaoDent" + " > " +luxacaoDent);
		System.out.println("restauracao" + " > " +restauracao);
		System.out.println("traumaOclusal" + " > " +traumaOclusal);
		System.out.println("outrosSinaiCli" + " > " +outrosSinaiCli);
		System.out.println("carieCoroa" + " > " +carieCoroa);
		System.out.println("carieRaiz" + " > " +carieRaiz);
		System.out.println("calcificaca" + " > " +calcificaca);
		System.out.println("noduloPulpa" + " > " +noduloPulpa);
		System.out.println("canaisObtur" + " > " +canaisObtur);
		System.out.println("sobreObtura" + " > " +sobreObtura);
		System.out.println("instrumento" + " > " +instrumento);
		System.out.println("espessamenAPIC" + " > " +espessamenAPIC);
		System.out.println("espessament" + " > " +espessament);
		System.out.println("nucleoMetal" + " > " +nucleoMetal);
		System.out.println("perficacaoR" + " > " +perficacaoR);
		System.out.println("pulpotomia" + " > " +pulpotomia);
		System.out.println("lesaoPeriod" + " > " +lesaoPeriod);
		System.out.println("lesaoPeriaLATE" + " > " +lesaoPeriaLATE);
		System.out.println("hipercremen" + " > " +hipercremen);
		System.out.println("reabsorcaoE" + " > " +reabsorcaoE);
		System.out.println("reabsorcaoI" + " > " +reabsorcaoI);
		System.out.println("lesaoFurca" + " > " +lesaoFurca);
		System.out.println("raizCurva" + " > " +raizCurva);
		System.out.println("raizDelgada" + " > " +raizDelgada);
		System.out.println("rizogeneseI" + " > " +rizogeneseI);
		System.out.println("densidadeDe" + " > " +densidadeDe);
		System.out.println("fraturaRaiz" + " > " +fraturaRaiz);
		System.out.println("outrosSinai" + " > " +outrosSinai);
		System.out.println("polpaNormal" + " > " +polpaNormal);
		System.out.println("pulpiteAguREVER" + " > " +pulpiteAguREVER);
		System.out.println("pulpiteAgud" + " > " +pulpiteAgud);
		System.out.println("pulpiteAgudaIrreversivel" + " > " +pulpiteAgudaIrreversivel);
		System.out.println("pulpiteCron" + " > " +pulpiteCron);
		System.out.println("necrosePulp" + " > " +necrosePulp);
		System.out.println("pericementi" + " > " +pericementi);
		System.out.println("abcessoDINI" + " > " +abcessoDINI);
		System.out.println("abcessoDenEVOt" + " > " +abcessoDenEVOt);
		System.out.println("abcessoDent" + " > " +abcessoDent);
		System.out.println("lesaoPeriapCIRCUN" + " > " +lesaoPeriapCIRCUN);
		System.out.println("lesaoPeriap" + " > " +lesaoPeriap);
		System.out.println("lesaoEndoPe" + " > " +lesaoEndoPe);
		System.out.println("tratamentoI" + " > " +tratamentoI);
		System.out.println("NUMERO DENTE > " + numeroDente);
		System.out.println("--------------------------------------------------------");

		int updatedEntities = em.createQuery(ejbqlUpdate).
		setParameter("nVloginPacien",loginPacien).
		setParameter("nVdataEndodon",dataEndodon).
		setParameter("nVpresencaDor",presencaDor).
		setParameter("nVsondagemGen",sondagemGen).
		setParameter("nVgrauMobilid",grauMobilid).
		setParameter("nVexposicaoCl",exposicaoCl).
		setParameter("nVretracaoGen",retracaoGen).
		setParameter("nVdorPerussaoV",dorPerussaoV).
		setParameter("nVdorPercussaH",dorPercussaH).
		setParameter("nVdorPalpacao",dorPalpacao).
		setParameter("nVtestesSensi",testesSensi).
		setParameter("nVedemiaIntra",edemiaIntra).
		setParameter("nVesemiaExtra",esemiaExtra).
		setParameter("nVcarie",carie).
		setParameter("nVcorCoroaAlt",corCoroaAlt).
		setParameter("nVcoroaProtet",coroaProtet).
		setParameter("nVexposicaoPu",exposicaoPu).
		setParameter("nVfistula",fistula).
		setParameter("nVfraturaCoro",fraturaCoro).
		setParameter("nVluxacaoDent",luxacaoDent).
		setParameter("nVrestauracao",restauracao).
		setParameter("nVtraumaOclusal",traumaOclusal).
		setParameter("nVoutrosSinaiCli",outrosSinaiCli).
		setParameter("nVcarieCoroa",carieCoroa).
		setParameter("nVcarieRaiz",carieRaiz).
		setParameter("nVcalcificaca",calcificaca).
		setParameter("nVnoduloPulpa",noduloPulpa).
		setParameter("nVcanaisObtur",canaisObtur).
		setParameter("nVsobreObtura",sobreObtura).
		setParameter("nVinstrumento",instrumento).
		setParameter("nVespessamenAPIC",espessamenAPIC).
		setParameter("nVespessament",espessament).
		setParameter("nVnucleoMetal",nucleoMetal).
		setParameter("nVperficacaoR",perficacaoR).
		setParameter("nVpulpotomia",pulpotomia).
		setParameter("nVlesaoPeriod",lesaoPeriod).
		setParameter("nVlesaoPeriaLATE",lesaoPeriaLATE).
		setParameter("nVhipercremen",hipercremen).
		setParameter("nVreabsorcaoE",reabsorcaoE).
		setParameter("nVreabsorcaoI",reabsorcaoI).
		setParameter("nVlesaoFurca",lesaoFurca).
		setParameter("nVraizCurva",raizCurva).
		setParameter("nVraizDelgada",raizDelgada).
		setParameter("nVrizogeneseI",rizogeneseI).
		setParameter("nVdensidadeDe",densidadeDe).
		setParameter("nVfraturaRaiz",fraturaRaiz).
		setParameter("nVoutrosSinai",outrosSinai).
		setParameter("nVpolpaNormal",polpaNormal).
		setParameter("nVpulpiteAguREVER",pulpiteAguREVER).
		setParameter("nVpulpiteAgud",pulpiteAgud).
		setParameter("nVpulpiteCron",pulpiteCron).
		setParameter("nVnecrosePulp",necrosePulp).
		setParameter("nVpericementi",pericementi).
		setParameter("nVabcessoDINI",abcessoDINI).
		setParameter("nVabcessoDenEVOt",abcessoDenEVOt).
		setParameter("nVabcessoDent",abcessoDent).
		setParameter("nVlesaoPeriapCIRCUN",lesaoPeriapCIRCUN).
		setParameter("nVlesaoPeriap",lesaoPeriap).
		setParameter("nVlesaoEndoPe",lesaoEndoPe).
		setParameter("nVtratamentoI",tratamentoI).
		setParameter("oldNumeroDente", numeroDente).executeUpdate();
		em.getTransaction().commit();
		
		if(updatedEntities > 0)
		{
			System.out.println(updatedEntities + "PROGNOSTICO ATUALIZADO");
	
			return true;
		}
		else
		{
			return false;
		}	
	}
//=======================================================================================
//	RECUPERAR ENDODONTIA
//=======================================================================================	
	public Endodontia recuperarEndodontia(String loginPaciente,
			String numeroDente) {
		// TODO Auto-generated method stub
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");

		Query s = em.createQuery("select p from Endodontia p where loginPacien =?1 and numeroDente =?2");

		s.setParameter(1, loginPaciente);
		s.setParameter(2, numeroDente);
		
		
		try {
			Endodontia e = new Endodontia();
			e= (Endodontia) s.getSingleResult();

			if(e != null)
			{
				em.refresh(e);
				return e;
			}
			return null;

		} catch (Exception e) {
			System.out.println("NAO EXISTE");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}	
	}
//=======================================================================================
//	Update Permissao
//=======================================================================================	
	public boolean updatePermissao(String paciente, String identificador,
			String duracaoTratamentoEstimada, String valorEstimadoTratamento,
			String numeroConsultasEstimadas, String numeroProntuario,
			String dataInicio) {
		// TODO Auto-generated method stub

		
		
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		em.getTransaction().begin();

		
		Query q = em.createQuery("from Pessoa p where login =?1");
		q.setParameter(1, paciente);
		
		Pessoa p = (Pessoa) q.getSingleResult();
		String cpf = p.getPaciente().getCpfPaciente();
		System.out.println("CPF: " + cpf);		
		
		String ejbqlUpdate = "update Permissao p set " +
		"p.duracaoTratamentoEstimada = :nDuracao,  " +
		"p.valorEstimadoTratamento = :nValor, " + 
		"p.numeroConsultasEstimadas = :nConsultas,  " +
		"p.numeroProntuario = :nProntuario, "+
		"p.dataInicio = :nData "+
		"where p.dentista.cro= :cro and p.paciente.cpfPaciente =:cpf";
		
		
		int updatedEntities = em.createQuery(ejbqlUpdate).
		setParameter("nDuracao",duracaoTratamentoEstimada).
		setParameter("nValor",valorEstimadoTratamento).
		setParameter("nConsultas",numeroConsultasEstimadas).
		setParameter("nProntuario",numeroProntuario).
		setParameter("nData",dataInicio).
		setParameter("cro",identificador).
		setParameter("cpf",cpf).executeUpdate();
		em.getTransaction().commit();

		
		if(updatedEntities > 0)
		{
			System.out.println(updatedEntities + "TRATAMENTO/PERMISSAO ATUALIZADO");
	
			return true;
		}
		else
		{
			return false;
		}
		
	}
//=======================================================================================
//	Excluir Permissao
//=======================================================================================	
	public boolean excluirPermissao(String identificador, String paciente) {
		// TODO Auto-generated method stub
	
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		em.getTransaction().begin();
		try
		{
			Query query = em.createQuery("delete from Permissao p where p.dentista.cro =?1 and p.paciente.cpfPaciente =?2");
			query.setParameter(1, paciente);
			query.setParameter(2, identificador);
			
			int updatedEntities = query.executeUpdate();
			em.getTransaction().commit();
			if(updatedEntities > 0)
			{
				System.out.println(updatedEntities + "TRATAMENTO/PERMISSAO EXCLUIDA");
	
				return true;
			}
			else
			{
				return false;
			}
			
		
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
//=======================================================================================
//	Verificar Existencia Permissao
//=======================================================================================	
	public boolean verificarExistenciaPermissao(String cro, String cpf) {
		System.out.println("ESTA VERIFICANDO SE A PERMISSAO EXISTE..... ");
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		Query q = em.createQuery("from Permissao p where p.dentista.cro =?1 and p.paciente.cpfPaciente=?2");

		q.setParameter(1, cro);
		q.setParameter(2, cpf);
		
		Permissao permissao = new Permissao();
		try{
			
			permissao = (Permissao) q.getSingleResult();
			//Verifica se Dente ja existe
			
		
			if(permissao == null)
				return false;
			else
				return true;
			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problemas ao verificar se Permissao Existe");
		
		}
			
		return false;
	}

	
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



}
