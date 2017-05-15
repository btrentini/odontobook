package CommandController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.exception.GenericJDBCException;

import util.Seguranca;

import model.Pessoa;
import facade.Facade;

public class ComandoLogar implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		System.out.println("----------- COMANDO LOGAR! ");
		
		req.setAttribute("resultado", "");
		HttpSession sessao = req.getSession();
		Pessoa temp = (Pessoa) sessao.getAttribute("sessao");
		
		if(temp != null){
			sessao.removeAttribute("login");
			return  "/default.jsp";
		}else
		{
		
				
				String usuario = req.getParameter("login").trim();
				String senha = req.getParameter("senha").trim();
				
				String pwdCript = Seguranca.criptografar(senha);
				usuario = usuario.toUpperCase();
				usuario = usuario.trim();
				
				try
				{
					temp = Facade.autenticar(usuario, pwdCript);	
				}catch (NoResultException e) {
					e.printStackTrace();
					req.setAttribute("resultado", "<b><font color='red'>Usuário ou senha inválida, tente novamente!</font></b>");
					return "/default.jsp";
				}
				catch (GenericJDBCException e) {
					e.printStackTrace();
					req.setAttribute("resultado", "Erro ao Obter Conexão com o Banco de Dados.  <br>" + e.getMessage());
					return "/jsp/erroGeral.jsp";
				}catch (PersistenceException e) {
					e.printStackTrace();
					req.setAttribute("resultado", "Erro ao Obter Conexão com o Banco de Dados.  <br>" + e.getMessage());
					return "/jsp/erroGeral.jsp";
				}catch (SQLException e) {
					e.printStackTrace();
					req.setAttribute("resultado", "Erro ao Obter Conexão com o Banco de Dados. <br>" + e.getMessage());
					return "/jsp/erroGeral.jsp";
				}
					
				
				if(temp != null)
				{
					
					sessao.setAttribute("login", temp.getLogin());
					sessao.setAttribute("perfil", temp.getPerfil());
					if(temp.getPerfil().equals("dentista"))
						sessao.setAttribute("identificador", temp.getDentista().getCro() );
					else
						sessao.setAttribute("identificador", temp.getPaciente().getCpfPaciente());
					
					sessao.setAttribute("usuario", temp);
					return "/jsp/userOk.jsp";
				}
		
		}
		
		req.setAttribute("resultado", "<b><font color='red'>Usuário ou senha inválida, tente novamente!</font></b>");
		return "/default.jsp";
	

	}

}
