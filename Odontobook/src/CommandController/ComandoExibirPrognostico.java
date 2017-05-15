package CommandController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pessoa;
import facade.Facade;

public class ComandoExibirPrognostico implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		
		System.out.println("----------- COMANDO EXIBIR PROGNOSTICO ");
		
		HttpSession sessao = req.getSession();
		System.out.println("exibir PROGNOSTICO");
		String exibirPrognostico = (String) req.getParameter("exibirPrognostico");
		sessao.setAttribute("cpfDoCara", exibirPrognostico);
		System.out.println(exibirPrognostico);
		
		return "/jsp/Prognostico.jsp";
		
		


	}

}
