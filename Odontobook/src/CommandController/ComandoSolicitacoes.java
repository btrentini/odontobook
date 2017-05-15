package CommandController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pessoa;

import facade.Facade;

public class ComandoSolicitacoes implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("----------- COMANDO SOLICITACOES PACIENTES! ");
		
		
		HttpSession sessao = req.getSession();
		String perfil = (String) sessao.getAttribute("perfil");
		
		
		String identificador = null;
		if(perfil.equals("dentista"))
			identificador = (String) sessao.getAttribute("identificador");
		else
			identificador = (String) sessao.getAttribute("identificador");
		
		try
		{
			
			if(perfil.equals("dentista"))
				sessao.setAttribute("permissoes", Facade.recuperarPermissoesDentista(identificador));
			else
				sessao.setAttribute("permissoes", Facade.recuperarPermissoesPaciente(identificador));

			return "/jsp/solicitacoesPendentes.jsp";
			
		}catch (Exception e) {
			
			req.setAttribute("resultado",  "<b><font color='red'> Erro ao tentar exibir dados. Você não sabe usar o sistema? </font></b>");
			e.printStackTrace();
			return "/jsp/solicitacoesPendentes.jsp";
		}
		
	}

}
