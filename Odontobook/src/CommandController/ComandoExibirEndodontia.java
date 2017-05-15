package CommandController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pessoa;
import facade.Facade;

public class ComandoExibirEndodontia implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		System.out.println("----------- COMANDO EXIBIR ENDODONTIA! ");
		
		try
		{
			
		HttpSession sessao = req.getSession();
		
		String dente = (String) req.getParameter("selecionarDenteEndodontia").trim();
		
		
		sessao.setAttribute("numeroDente", dente);
		System.out.println(dente);
	
		return "/jsp/Endodontia.jsp";
		
	}catch (Exception e) {
		
		req.setAttribute("resultado", "<b><font color='red'>Erro ao exibir Dentistas! Você foi desconctado porque te odiamos! Não volte mais aqui! Ok? </font></b>");
		return "/jsp/erroGerat.jsp";
	}
	}

}
