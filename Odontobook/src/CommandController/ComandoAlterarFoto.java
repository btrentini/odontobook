package CommandController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import facade.Facade;

import model.Pessoa;

public class ComandoAlterarFoto implements Comando {

	@SuppressWarnings("unused")
	private Pessoa usuario;

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("----------- COMANDO ALTERAR FOTO! ");
		
		
		
		return null;
	}

}
