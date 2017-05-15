package CommandController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.Seguranca;
import facade.Facade;

import model.Pessoa;

public class ComandoPaginaEditarPerfil implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("----------- COMANDO PAGINA EDITAR PERFIL! ");
		
		HttpSession sessao = req.getSession();	
		
				
		Pessoa pessoa  = (Pessoa) sessao.getAttribute("usuario");	
	
		System.out.println("Ele ate entendeu o que estava acontecendo...");

		System.out.println(pessoa.toString());
		
		try{

			
			System.out.println("TRY");
				sessao.setAttribute("login", pessoa.getLogin());
				sessao.setAttribute("perfil", pessoa.getPerfil());
				sessao.setAttribute("identificador", pessoa.getIdentificador() );
				//sessao.setAttribute("usuario", Facade.recuperarPessoa(pessoa.getLogin()));
			System.out.println("ENDTRY");
		}catch (Exception e) {
			req.setAttribute("resultado", "Erro ao Editar perfil.");
			return "/jsp/erroGeral.jsp";
		}

		return "/jsp/userOk.jsp";
		
	}

}
