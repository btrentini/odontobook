package CommandController;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ComandoLogoff implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		

			HttpSession sessao = req.getSession();
					
			 for(@SuppressWarnings("rawtypes")
			Enumeration e = sessao.getAttributeNames(); e.hasMoreElements(); ){
	              
				 sessao.setAttribute(e.nextElement().toString(), null);
			
	        }
			sessao.invalidate();
			
			
		return  "/default.jsp";
	}

}
