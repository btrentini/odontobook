package CommandController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Interface comando que é utilizado pela fábrica de
 * comandos. 
 */
public interface Comando {
	
	/**
	 * Método que deve executar uma operação
	 * @param req request
	 * @param res response
	 * 
	 * @throws ServletException
	 * @throws IOException
	 */
	String executar(HttpServletRequest req,
			  HttpServletResponse res)
			  throws ServletException, IOException;

}
