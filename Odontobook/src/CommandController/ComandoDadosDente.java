package CommandController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Dente;
import facade.Facade;

public class ComandoDadosDente implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("----------- COMANDO DADOS DENTE! ");
		
			HttpSession sessao = req.getSession();
			
			String numeroDente = (String) req.getParameter("selecionarDenteDados");
		
			sessao.setAttribute("numDente", numeroDente);
			
			String perfil = (String) sessao.getAttribute("perfil");
			String paciente =null;
			
			if(perfil.equals("dentista"))
				paciente = (String)sessao.getAttribute("cpfDoCara");
			else
				paciente = (String)sessao.getAttribute("login");
			
			sessao.removeAttribute("dadosDente");
	
		
			Dente d = Facade.recuperarDadosDente(paciente, numeroDente);
			if(d == null)
			{
				System.out.println("DENTE NULO");

			}
			else
			{
				sessao.setAttribute("dadosDente", d);
				System.out.println();
				System.out.println("------------------------------------");
				System.out.println("DADOS DO DENTE PARA SEÇÃO");
				System.out.println();
				System.out.println("DENTE: " + d.getNumeroDente());
				System.out.println("LOGIN: " + d.getPaciente().getPessoa().getLogin());
				System.out.println("------------------------------------");
			}

			
			return "/jsp/dadosDente.jsp";
	}

}
