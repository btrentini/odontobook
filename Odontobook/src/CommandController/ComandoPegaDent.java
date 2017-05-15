package CommandController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Dente;
import model.Endodontia;
import facade.Facade;

public class ComandoPegaDent implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("--------------------------------  COMANDO PEGA DENTE");

		HttpSession sessao = req.getSession();
		
		String numeroDente = (String) req.getParameter("selecionarDenteDados3");
		String perfil = (String) sessao.getAttribute("perfil");
		
		String loginPaciente = null;
		
		if(perfil.equals("dentista"))
			loginPaciente = (String) sessao.getAttribute("cpfDoCara");
		else
			loginPaciente = (String) sessao.getAttribute("login");
		
		System.out.println(loginPaciente);
		System.out.println(numeroDente);
		System.out.println("-------------------------------------------------------");
		try
		{
			Endodontia e = Facade.recuperarEndodontia(loginPaciente, numeroDente);
			System.out.println();
			System.out.println("------------------------------------");
			System.out.println("DADOS DA ENDODONTIA PARA SEÇÃO");
			System.out.println();
			System.out.println("DENTE: " + e.getNumeroDente());
			System.out.println("LOGIN: " + e.getLoginPacien());
			System.out.println("CARIE? " + e.getCarie());
			System.out.println("------------------------------------");
			
			sessao.removeAttribute("dadosEndodontia");
			
			if(e != null)
			{
				sessao.removeAttribute("numDente");
				sessao.setAttribute("numDente", numeroDente);
				sessao.setAttribute("dadosEndodontia", e);
			}
			
	
			
		}catch (Exception e) {
			sessao.removeAttribute("dadosEndodontia");
			sessao.removeAttribute("numDente");
			sessao.setAttribute("numDente", numeroDente);
			req.setAttribute("resultado",  "<b><font color='red'> Este Dente Não possui dados....</font> </b>");
			return "/jsp/Endodontia.jsp";
		}

		sessao.removeAttribute("numDente");
		sessao.setAttribute("numDente", numeroDente);
		req.setAttribute("resultado",  "<b> Exibindo dados do dente... </b>");
		return "/jsp/Endodontia.jsp";
	}

}
