package teste;

import java.util.List;

import javax.persistence.EntityManager;

import model.Permissao;
import util.EntityManagerHelper;

public class TesteQuery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		

		javax.persistence.Query query = em.createQuery("from Permissao p where paciente_permissao =?1");
		query.setParameter(1, "000.000.000-00");
		
		List permissoes = query.getResultList();
		
		for(int i =0; i<permissoes.size();i++)
		{
			Permissao p = new Permissao();
			p = (Permissao) permissoes.get(i);
			
			System.out.println("ID: " + p.getCodigoPermissao());
			System.out.println("DENTISTA: " + p.getDentista().getPessoa().getLogin() + " | " + p.getDentista().getCro());
			System.out.println("PACIENTE: " + p.getPaciente().getPessoa().getLogin() + " | " + p.getPaciente().getCpfPaciente());
			System.out.println("--------------------------------------------------------------------------------------------");
		}

	}

}
