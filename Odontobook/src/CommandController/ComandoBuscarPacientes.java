package CommandController;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import facade.Facade;

import model.Pessoa;

public class ComandoBuscarPacientes implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("----------- COMANDO BUSCAR PACIENTES! ");
		try
		{
		HttpSession sessao = req.getSession();
		String perfil = (String) sessao.getAttribute("perfil");
		Pessoa temp = (Pessoa) sessao.getAttribute("usuario");
		
		String cro = null;
		if(perfil.equals("dentista"))
			cro = (String) sessao.getAttribute("identificador");
		
		sessao.setAttribute("permissoesDentistas", Facade.recuperarPermissoesDentista(cro));
		
		req.setAttribute("resultado", "<b> Listando pacientes </b>");
		return "/jsp/visualizarPacientes.jsp";
		
	}catch (Exception e) {
		
		req.setAttribute("resultado", "<b><font color='red'>Erro ao exibir Dentistas! Você foi desconctado porque te odiamos! Não volte mais aqui! Ok? </font></b>");
		return "/default.jsp";
	}
		
	}

}
