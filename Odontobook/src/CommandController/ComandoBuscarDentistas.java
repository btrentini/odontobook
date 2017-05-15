package CommandController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Dentista;
import model.Pessoa;

import facade.Facade;

public class ComandoBuscarDentistas implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("----------- COMANDO BUSCAR DENTISTAS! ");
		try
		{
			List dentistas = null;
			dentistas = Facade.buscarDentistas();
						
			HttpSession sessao = req.getSession();
			sessao.setAttribute("dentistas", dentistas);
			
			req.setAttribute("resultado", "<b><font color='red'> Listando dentistas... </font></b>");
			return "/jsp/visualizarDentistas.jsp";
			
		}catch (Exception e) {
			
			req.setAttribute("resultado", "<b><font color='red'>Erro ao exibir Dentistas! Você foi desconctado porque te odiamos! Não volte mais aqui! Ok? </font></b>");
			return "/default.jsp";
		}

	}

}
