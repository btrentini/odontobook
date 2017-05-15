package CommandController;

import java.io.IOException;
import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Dente;
import facade.Facade;

public class ComandoGravarDadosDente implements Comando {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {

		
		System.out.println("------------------ COMANDO GRAVAR DADOS DENTE!!");

		HttpSession sessao = req.getSession();
		String login = (String) sessao.getAttribute("login");
		String perfil = (String) sessao.getAttribute("perfil");
		String identificador = (String) sessao.getAttribute("identificador");
		String paciente = (String) sessao.getAttribute("cpfDoCara");
		String numDente = (String) sessao.getAttribute("numDente");


		System.out.println(paciente);
		System.out.println(numDente);


		String loginPaciente = paciente;
		String numeroDente=numDente; 
		String situacaoPresente=(String)req.getParameter("situacaoPresente");
		String canal=(String)req.getParameter("canal");
		String CAD=(String)req.getParameter("CAD");
		String CTEX=(String)req.getParameter("CTEX");
		String CTG=(String)req.getParameter("CTG");
		String CTES=(String)req.getParameter("CTES");
		String CRD=(String)req.getParameter("CRD");
		String CT=(String)req.getParameter("CT");
		String referencia=(String)req.getParameter("referencia");
		String instrumento=(String)req.getParameter("instrumento");
		String instrumentoPatencia=(String)req.getParameter("instrumentoPatencia");
		String numDA=(String)req.getParameter("numDA");
		String numDC=(String)req.getParameter("numDC");
		String X=(String) req.getParameter("X");
		String incidenciaDoRX=(String)req.getParameter("incidenciaDoRX");
		String conePrincipal=(String)req.getParameter("conePrincipal");
		String cimentoObturador=(String)req.getParameter("cimentoObturador");
		String tecnicaObturacao=(String)req.getParameter("tecnicaObturacao");
	
	
		
		try{
			
			//VERIFICA SE JA EXISTE
			if(Facade.denteExiste(numeroDente, paciente))
			{	
			
				System.out.println("UPDATE DENTE");
				//se Sim, updata
				Facade.updateDente(loginPaciente,
						numeroDente,
						situacaoPresente,
						canal,
						CAD,
						CTEX,
						CTG,
						CTES,
						CRD,
						CT,
						referencia,
						instrumento,
						instrumentoPatencia,
						numDA,
						numDC,
						X,
						incidenciaDoRX,
						conePrincipal,
						cimentoObturador,
						tecnicaObturacao);
			}else
			{//se nao, crie
				System.out.println("CRIA DENTE");
				Facade.gravarDadosDente(loginPaciente,
						numeroDente,
						situacaoPresente,
						canal,
						CAD,
						CTEX,
						CTG,
						CTES,
						CRD,
						CT,
						referencia,
						instrumento,
						instrumentoPatencia,
						numDA,
						numDC,
						X,
						incidenciaDoRX,
						conePrincipal,
						cimentoObturador,
						tecnicaObturacao);				
			}

			Dente d = Facade.recuperarDadosDente(loginPaciente, numeroDente);
			System.out.println();
			System.out.println("------------------------------------");
			System.out.println("DADOS DO DENTE PARA SEÇÃO");
			System.out.println();
			System.out.println("DENTE: " + d.getNumeroDente());
			System.out.println("LOGIN: " + d.getPaciente().getPessoa().getLogin());
			System.out.println("------------------------------------");
			
			sessao.setAttribute("dadosDente", d);
			
		
			
			req.setAttribute("resultado",  "<b><font color='red'> Dados do Dente #" + numeroDente +" Alterados com Sucesso </font></b>");
			return "/jsp/Prognostico.jsp";
			
		}catch(Exception e)
		{
			e.printStackTrace();
			req.setAttribute("resultado",  "<b><font color='red'> Deu m... </font></b>");
			return "/jsp/Prognostico.jsp";
		}


	}
	

}
