package CommandController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import facade.Facade;

public class ComandoSolicitarPermissao implements Comando {
//=====================================================================================================
//     O REAL OBJETIVO DESTA CLASSE EH FAZER O PACIENTE CONCEDER UMA PERMISSAO AO DENTISTA
//     O dentista entao escolhe se quer ou nao. Por Default, ele quer.
//====================================================================================================
	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		System.out.println("----------- COMANDO SOLICITAR/CONCEDER PERMISSAO! ");
		HttpSession sessao = req.getSession();

		try
		{
			String cro = req.getParameter("dentistaCompartilhar");
			String cpf = (String) sessao.getAttribute("identificador");

			//Verifica se ja tem permissao
			if(!Facade.verificarExistenciaPermissao(cro, cpf)){
				if(Facade.concederPermissao(cro, cpf))
				{
					req.setAttribute("resultado",  "<b><font color='red'> Solicitação enviada com sucesso! </font></b>");
					
					return "/jsp/userOk.jsp";
					
				}else
				{
					req.setAttribute("resultado",  "<b><font color='red'> Erro ao solicitar Permissao. Quer um manual? </font></b>");
					return "/jsp/visualizarDentistas.jsp";
				}
				
			}else{
				req.setAttribute("resultado",  "<b><font color='red'> Voce ja tem este dentista na sua lista de permissoes! </font></b>");
				return "/jsp/visualizarDentistas.jsp";
			}

			

			
		}catch (Exception e) {
			
			req.setAttribute("resultado",  "<b><font color='red'> Erro ao solicitar Permissao. Você não sabe usar o sistema? </font></b>");
			e.printStackTrace();
			return "/jsp/visualizarDentistas.jsp";
		}
		
		
		
		
		
	}

}
