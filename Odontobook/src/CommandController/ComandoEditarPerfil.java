package CommandController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.ErrorMessage;

import facade.Facade;

import model.Paciente;
import model.Pessoa;

public class ComandoEditarPerfil implements Comando {

	@SuppressWarnings("unused")
	private Pessoa usuario;

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("----------- COMANDO EDITAR PERFIL! ");
	
		 
		try
		{
			
			HttpSession sessao = req.getSession();
			String login = (String) sessao.getAttribute("login");
			String perfil = (String) sessao.getAttribute("perfil");
			String identificador = (String) sessao.getAttribute("identificador");
			
			
			 String dataNascimentoPessoa = null;
			
			 dataNascimentoPessoa = (String) req.getParameter("dataNascimento");
			
			 String estadoCivilPessoa =  "NAOINFORMADO";
			 
				 //(String) req.getParameter("estadoCivilPessoa"); 
			 String rgPessoa = (String) req.getParameter("rgPessoa");
			 String nacionalidadePessoa = (String) req.getParameter("nacionalidadePessoa");
			 String naturalidadePessoa = (String) req.getParameter("naturalidadePessoa");
			 String emailPessoa= (String) req.getParameter("email");
			 String enderecoResidencialPessoa= (String) req.getParameter("enderecoResidencial");
			
			 String cidadePessoa= (String) req.getParameter("cidadePessoa");
			 String bairroPessoa= (String) req.getParameter("bairroPessoa");
			 String ufPessoa= (String) req.getParameter("estadoPessoa");
			 String cepPessoa= (String) req.getParameter("cepPessoa");
			 String fone1Pessoa= (String) req.getParameter("fone1Pessoa");
			 String fone2Pessoa= (String) req.getParameter("fone2Pessoa");
			 String fone3Pessoa= (String) req.getParameter("fone3Pessoa");
			 String foneRecadoPessoa= (String) req.getParameter("foneRecadoPessoa");
			 String nomeRecadoPessoa= (String) req.getParameter("nomeRecadoPessoa");
			 String nomePaiPessoa= (String) req.getParameter("nomePaiPessoa");
			 String nomeMaePessoa= (String) req.getParameter("nomeMaePessoa");
	
			 String senha= (String) req.getParameter("perfil");
			 String nome= (String) req.getParameter("nomePessoa");
			 String sobrenome= (String) req.getParameter("sobrenomePessoa");
			
			//DENTISTA
			 if(perfil.equals("dentista"))
			 {
				 String consultorioDentista= (String) req.getParameter("consultorio");
				 String enderecoConsultorio= (String) req.getParameter("enderecoConsultorio");
				 String telefone1Consultorio= (String) req.getParameter("telefone1Consultorio");
				 String telefone2Consultorio= (String) req.getParameter("telefone2Consultorio");
				 String cidadeConsultorio= (String) req.getParameter("cidadeConsultorio");
				 String bairroConsultorio= (String) req.getParameter("bairroConsultorio");
				 String ufConsultorio= (String) req.getParameter("ufConsultorio");
				 String faxConsultorio= (String) req.getParameter("faxConsultorio");
				 String websiteConsultorio= (String) req.getParameter("websiteConsultorio");
				 String graduacaoCurriculo= (String) req.getParameter("graduacaoCurriculo");
				 String especializacaoCurriculo= (String) req.getParameter("especializacaoCurriculo");
				 String anoFormacaoCurriculo= (String) req.getParameter("anoFormacaoCurriculo");
				 
				boolean dentistaAlterado =  Facade.editarPerfilDentista(
						 login , 
						 perfil ,  
						 dataNascimentoPessoa , 
						 estadoCivilPessoa , 
						 rgPessoa , 
						 nacionalidadePessoa , 
						 naturalidadePessoa ,
						 emailPessoa,					
						 enderecoResidencialPessoa ,
						 cidadePessoa, 
						 bairroPessoa,
						 ufPessoa, 
						 cepPessoa, 
						 fone1Pessoa, 
						 fone2Pessoa, 
						 fone3Pessoa, 
						 foneRecadoPessoa, 
						 nomeRecadoPessoa, 
						 nomePaiPessoa, 
						 nomeMaePessoa, 
						 nome, 
						 sobrenome,
						 consultorioDentista, 
						 enderecoConsultorio,  
						 telefone1Consultorio, 
						 telefone2Consultorio,
						 cidadeConsultorio, 
						 bairroConsultorio,
						 ufConsultorio,
						 faxConsultorio, 
						 websiteConsultorio, 
						 graduacaoCurriculo,
						 especializacaoCurriculo, 
						 anoFormacaoCurriculo);
				
					if(dentistaAlterado)
					{	
						Facade.refresh(login);
						req.setAttribute("resultado", "<b><font color='red'> Dados do DENTISTA foram alterados com Sucesso!!</font></b>" );
						return "/jsp/userOk.jsp";
					}else
					{
						req.setAttribute("resultado", ErrorMessage.editarUsuario());
						return "/jsp/erroGeral.jsp";
					}
						
				 
			 }else
			 {
				 //PACIENTE
				 String nomeResponsavelPaciente= (String) req.getParameter("nomeResponsavelPaciente");
				 String ocupacaoPaciente= (String) req.getParameter("profissaoPaciente");
				 String profissaoPaciente= (String) req.getParameter("ocupacaoPaciente");
				 String indicacaoPaciente= (String) req.getParameter("indicacaoPaciente");
				 
				boolean pacienteAlterado = Facade.editarPerfilPaciente( 
						 login , 
						 perfil , 
						 dataNascimentoPessoa , 
						 estadoCivilPessoa , 
						 rgPessoa , 
						 nacionalidadePessoa , 
						 naturalidadePessoa ,
						 emailPessoa,					
						 enderecoResidencialPessoa ,
						 cidadePessoa, 
						 bairroPessoa,
						 ufPessoa, 
						 cepPessoa, 
						 fone1Pessoa, 
						 fone2Pessoa, 
						 fone3Pessoa, 
						 foneRecadoPessoa, 
						 nomeRecadoPessoa, 
						 nomePaiPessoa, 
						 nomeMaePessoa, 
						 nome, 
						 sobrenome,
						 nomeResponsavelPaciente,
						 ocupacaoPaciente,
						 profissaoPaciente,
						 indicacaoPaciente);
				
				if(pacienteAlterado)
				{	
					Facade.refresh(login);		
					req.setAttribute("resultado", "<b><font color='red'> Dados do Paciente foram alterados com Sucesso!!</font></b>" );
					return "/jsp/userOk.jsp";
				}else
				{
					req.setAttribute("resultado", ErrorMessage.editarUsuario());
					return "/jsp/erroGeral.jsp";
				}
					
				
				
			 }
		}
		 catch(Exception e)
			{
				//=======================================================================================
				//						ALGUMA COISA DEU ERRADO!
				//=======================================================================================
				req.setAttribute("resultado", ErrorMessage.editarUsuario());
				e.printStackTrace();
				return "/jsp/erroGeral.jsp";
			}
		

	}


}
