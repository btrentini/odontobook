package CommandController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Interface comando que � utilizado pela f�brica de
 * comandos. 
 */
public interface Comando {
	
	/**
	 * M�todo que deve executar uma opera��o
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
