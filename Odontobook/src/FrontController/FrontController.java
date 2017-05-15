package FrontController;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CommandController.Comando;
import CommandController.FabricaComandos;

/**
 * Exemplo de utilização do padrão de projeto Command and Controller.
 * 
 */
public class FrontController extends HttpServlet {

	private static final long serialVersionUID = -1771530302246912114L;
	
	private static final String PAGINA_ERRO = "/jsp/erroGeral.jsp";
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String pagina = null;
		String acao2 = null;
		
		try {
		
			String acao = req.getServletPath();
			if(!acao.contains("/jsp/"))
				acao2 = acao.substring(1, acao.length()-5);
			else
				acao2 = acao.substring(5, acao.length()-5);
			
			Comando cmd = FabricaComandos.obterComando(acao2);
				
			pagina = cmd.executar(req, resp);

		} catch (Throwable e) {

			String msg = "Exceção: " + e.getClass().getName() + " mensagem: " + e.getMessage();
			req.setAttribute("mensagemErro",msg);
			pagina = PAGINA_ERRO;
		}


		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(req,resp);
		
		
		
	}

}