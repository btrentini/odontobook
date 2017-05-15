package CommandController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import facade.Facade;

import model.Permissao;

public class ComandoGravarTratamento implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println(" -------------------------------  COMANDO GRAVAR TRATAMENTO");
		HttpSession sessao = req.getSession();
		
		
		String contador = (String) req.getParameter("contador");
		String parm = "nomePaciente" + contador;
		
		System.out.println("PARM: " + parm);
		String paciente = (String) req.getParameter(parm);
		System.out.println("OOOOO: " + paciente);

		String identificador = (String) sessao.getAttribute("identificador");
		String perfil = (String) sessao.getAttribute("perfil");
		
		if(perfil.equals("paciente"))
			Facade.excluirPermissao(identificador, paciente);
		
		String duracaoTratamentoEstimada = (String) req.getParameter("duracaoTratamentoEstimada");
		String valorEstimadoTratamento= (String) req.getParameter("valorEstimadoTratamento");
		String numeroConsultasEstimadas= (String) req.getParameter("numeroConsultasEstimadas");
		String numeroProntuario= (String) req.getParameter("numeroProntuario");
		String dataInicio= (String) req.getParameter("dataInicio");	
		
		try
		{
			Facade.updatePermissao(paciente, 
					identificador, 
					duracaoTratamentoEstimada,
					valorEstimadoTratamento,
					numeroConsultasEstimadas,
					numeroProntuario,
					dataInicio);
		}catch(Exception e)
		{

			e.printStackTrace();
			req.setAttribute("resultado", "PROBLEMAO AO GRAVAR O PACIENTE:  " + paciente);
			return "/jsp/solicitacoesPendentes.jsp";
		}

		sessao.removeAttribute("permissoes");
		 sessao.setAttribute("permissoes", Facade.recuperarPermissoesDentista(identificador));
		 
		 
		 
		
		req.setAttribute("resultado", "Gravou tratamento para o paciente: " + paciente);
		return "/jsp/solicitacoesPendentes.jsp";
	}

}
