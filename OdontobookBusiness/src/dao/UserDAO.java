package dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.hibernate.exception.GenericJDBCException;

import model.Pessoa;

public interface UserDAO {

	Pessoa validaLogin(String usuario, String senha) throws GenericJDBCException, PersistenceException, SQLException, NoResultException;

	boolean criarDentista(String login, String senha, String perfil, String cro);
	
	boolean criarPaciente(String login, String senha, String perfil, String cpf) throws GenericJDBCException, PersistenceException, SQLException, NoResultException;

	List buscarDentistas();
	
	boolean concederPermissao(String cro, String cpf) throws Exception;
	
	boolean editarPerfilDentista(String login, String perfil,
			String dataNascimentoPessoa,
			String estadoCivilPessoa, String rgPessoa,
			String nacionalidadePessoa, String naturalidadePessoa,
			String emailPessoa, String enderecoResidencialPessoa,
			String cidadePessoa, String bairroPessoa, String ufPessoa,
			String cepPessoa, String fone1Pessoa, String fone2Pessoa,
			String fone3Pessoa, String foneRecadoPessoa,
			String nomeRecadoPessoa, String nomePaiPessoa,
			String nomeMaePessoa, String nome, String sobrenome,
			String consultorioDentista, String enderecoConsultorio,
			String telefone1Consultorio, String telefone2Consultorio,
			String cidadeConsultorio, String bairroConsultorio,
			String ufConsultorio, String faxConsultorio,
			String websiteConsultorio, String graduacaoCurriculo,
			String especializacaoCurriculo, String anoFormacaoCurriculo);
			
	boolean editarPerfilPaciente(String login, String perfil, 
			String dataNascimentoPessoa, 
			String estadoCivilPessoa, String rgPessoa, String nacionalidadePessoa, 
			String naturalidadePessoa, String emailPessoa, String enderecoResidencialPessoa,
			String cidadePessoa, String bairroPessoa, String ufPessoa, String cepPessoa, 
			String fone1Pessoa, String fone2Pessoa, String fone3Pessoa, String foneRecadoPessoa, 
			String nomeRecadoPessoa, String nomePaiPessoa, String nomeMaePessoa,
			String nome, String sobrenome, String nomeResponsavelPaciente, String ocupacaoPaciente,
			String profissaoPaciente, String indicacaoPaciente);

	List recuperarPacientes();
	
	List recuperarPermissoesPaciente(String cpf);
	
	List recuperarPermissoesDentista(String cro);

	Pessoa recuperarPessoa(String login);
	
}
