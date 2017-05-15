package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public  class Valida extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7652909288743357756L;

	public static boolean validaUser(HttpServletRequest req, HttpServletResponse res,String usuario, String senha, String senha2, String identificador)
	{
		
	
		if(identificador == null || identificador == "")
		{
			if(identificador.contains("CRO"))
				req.setAttribute("resultado", "<b><font color='red'>CRO vazio!</font></b>");
			else
				req.setAttribute("resultado", "<b><font color='red'>CPF vazio!</font></b>");
			
			return false;
		}
		return true;
		
	}


}
