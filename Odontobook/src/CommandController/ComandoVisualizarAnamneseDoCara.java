package CommandController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AnamneseGeral;
import facade.Facade;

public class ComandoVisualizarAnamneseDoCara implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("----------- COMANDO VISUALIZAR ANAMNESE DO CARA ");
		
		HttpSession sessao = req.getSession();
		System.out.println("exibir ANAMNESE");
		String exibirAnamnese = (String) req.getParameter("exibirAnamnese");
		System.out.println(exibirAnamnese);
	
		sessao.setAttribute("cpfDoCara", exibirAnamnese);
		
		try
		{
			AnamneseGeral an =  Facade.recuperarAnamneseGeralPaciente(exibirAnamnese);
			if(an == null)
			{
				req.setAttribute("resultado",  "<b><font color='red'> Paciente não editou Anamnese Ainda! </font></b>");
				return "/jsp/visualizarPacientes.jsp";
			}
			sessao.setAttribute("anamnese", an);
		}catch(Exception e)
		{
			req.setAttribute("resultado",  "<b><font color='red'> Paciente não editou Anamnese Ainda! </font></b>");
			return "/jsp/visualizarPacientes.jsp";
		}


		
		return "/jsp/editarAnamneseGeral.jsp";
	}

}
