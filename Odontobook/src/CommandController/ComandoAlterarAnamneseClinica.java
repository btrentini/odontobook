package CommandController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ComandoAlterarAnamneseClinica implements Comando {

	@SuppressWarnings("unused")
	private String login;

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("----------- COMANDO ALTERAR ANAMNESE CLINICA! ");
		//=======================================================================================
		//							
		//											INICIO
		//
		//=======================================================================================

		
		HttpSession sessao = req.getSession();
		login = null;
		login = (String) sessao.getAttribute("login");
		
		System.out.println();
		
		
		
		
		return null;
	}

}
