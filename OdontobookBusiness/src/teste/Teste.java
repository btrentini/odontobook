package teste;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Dente;
import model.Pessoa;
import util.EntityManagerHelper;
import facade.Facade;

public class Teste {
    
    public static void main(String[] args) {

    	EntityManager em = EntityManagerHelper.getEntityManager("BRUNO");
		em.getTransaction().begin();
		
    	String paciente = "BRUNO";
    	String dentista = "DENTISTA";
    	
    	try{
    
    
            Query query = em.createQuery("delete from Permissao p where p.paciente.pessoa.login =?1 and p.dentista.pessoa.login =?2");
            query.setParameter(1, paciente);
            query.setParameter(2, dentista);
            
            int rowCount = query.executeUpdate();
            System.out.println("Rows affected: " + rowCount);
			
            em.getTransaction().commit();
            em.close();
            
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("EXCECAO");
		}
		
		
    }
    
}
