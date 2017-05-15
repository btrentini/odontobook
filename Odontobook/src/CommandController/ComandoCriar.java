package CommandController;

import java.io.IOException;
import java.sql.SQLException;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.derby.client.am.SqlException;
import org.hibernate.exception.GenericJDBCException;

import model.Pessoa;

import dao.impl.SQLUsuarios;
import facade.Facade;

import util.ErrorMessage;
import util.Seguranca;
import util.Valida;

public class ComandoCriar implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("----------- COMANDO CRIAR! ");
		
	String perfil = null;
		@SuppressWarnings("unused")
		String cro = null;
		@SuppressWarnings("unused")
		String cpf = null;
		String login = null;
		String senha = null;
		String senha2 = null;
	
		
		try
		{
			//==============================================================================================================
			//			Receber Atriburos da página "newUser.jsp"
			//==============================================================================================================
			login = (String) req.getParameter("login");
				login = login.trim();
				login = login.toUpperCase();

			
			senha = (String) Seguranca.criptografar(req.getParameter("senha"));
			senha2 = (String) Seguranca.criptografar(req.getParameter("senha2"));
			perfil = (String) req.getParameter("perfil");
			cro = (String) req.getParameter("cro");
			cpf = (String) req.getParameter("cpf");			
			String acao = req.getServletPath();
			@SuppressWarnings("unused")
			String acao2 = null;
			//==============================================================================================================
			//						Coxambre para determinar a acao. Se contem JSP vem das paginas de interecao (/jsp/xxxxx)
			//						Senao, vem da pagina Default.jsp
			//==============================================================================================================
			if(!acao.contains("/jsp/"))
				acao2  = acao.substring(1, acao.length()-5);
			else
				acao2 = acao.substring(5, acao.length()-5);
			
			String identificador;
			//==============================================================================================================
			//						Verifica Perfil com base no campo value="x" do checkbox "PERFIL" da pagina newUser.jsp
			//==============================================================================================================
			if(perfil.equals("1"))
			{
				perfil = "paciente";
				identificador = cpf;
			}
			else
			{
				perfil = "dentista";
				identificador = cro;
			
			}
			
			identificador = identificador.toUpperCase();
			identificador = identificador.trim();
			
			//=======================================================================================
			//						Valida campos e existencia de login
			//=======================================================================================
			@SuppressWarnings("unused")
			boolean validado = Valida.validaUser(req, res, login, senha, senha2, identificador);
			
			//=======================================================================================
			//						SALVA NA BASE CONFORME O PERFIL
			//=======================================================================================
			
			try {
				if(validado && Facade.validaJaExiste(login, identificador, perfil))
				{
					if(perfil.equals("dentista"))
					{
						System.out.println("Criou um dentista");
						Facade.inserirUsuario(login, senha2, perfil, identificador);	
					}else
					{
						System.out.println("Criou um paciente");
						Facade.inserirUsuario(login, senha2, perfil, identificador);
					}
					
				}
				else
				{
					req.setAttribute("resultado",
							"<font color='red'> Erro ao criar o usuário: usuáio <font color='black'>  " +  login + "<font color='red'>  ou Identificador <font color='black'> " + identificador + " <font color='red'>  já existe!</font></b>");
					 return "/jsp/newUser.jsp";
				}
			} catch (GenericJDBCException e) {
				e.printStackTrace();
				req.setAttribute("resultado", "Erro ao Obter Conexão com o Banco de Dados. <br>" + e.getMessage());
				return "/jsp/newUser.jsp";
			} catch (SqlException e) {
				e.printStackTrace();
				req.setAttribute("resultado",
						"<font color='red'> Erro ao criar o usuário: usuáio <font color='black'>  " +  login + "<font color='red'>  ou Identificador <font color='black'> " + identificador + " <font color='red'>  já existe!</font></b>");
				return "/jsp/newUser.jsp";
			}
			//=======================================================================================
			//						SE CRIOU, Loga.
			//======================================================================================
			
			HttpSession sessao = req.getSession();
			sessao.setAttribute("login", login);
			sessao.setAttribute("perfil", perfil);
			sessao.setAttribute("identificador", identificador);
			sessao.setAttribute("usuario", Facade.recuperarPessoa(login));
			Facade.refresh(login);

		}catch(PersistenceException e)
		{
			//=======================================================================================
			//						ALGUMA COISA DEU ERRADO!
			//=======================================================================================
			req.setAttribute("resultado", ErrorMessage.autenticarUsuario(e));
			e.printStackTrace();
			return "/jsp/newUser.jsp";
		}
		req.setAttribute("resultado", "<b><font color='red'> Usuário Criado com Sucesso!!</font></b>" );
		return "/jsp/userOk.jsp";
	}

}
