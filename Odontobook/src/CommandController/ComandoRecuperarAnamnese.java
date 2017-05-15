package CommandController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AnamneseGeral;
import model.Pessoa;
import facade.Facade;

public class ComandoRecuperarAnamnese implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("----------- COMANDO RECUPERAR ANAMNESE! ");
		
		HttpSession sessao = req.getSession();
		Pessoa temp = (Pessoa) sessao.getAttribute("usuario");
		
		try
		{
			AnamneseGeral anamneseGeral = Facade.recuperarAnamneseGeralPaciente(temp.getLogin());
			sessao.setAttribute("anamnese", anamneseGeral);
		}catch(Exception e)
		{
			e.printStackTrace();
			
			req.setAttribute("resultado", "<b><font color='red'> ERRO AO EXIBIR ANAMNESE!</font></b>" );
			return "/jsp/erroGeral.jsp";
		}
		
		
		
		
		req.setAttribute("resultado", "<b><font color='red'> </font></b>" );
		return "/jsp/editarAnamneseGeral.jsp";
	}

}
