package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("==================================================================");
		
		Pessoa p1 = new Pessoa(null, "Watilla Junior", "Watilla@gmail.com");
		Pessoa p2 = new Pessoa(null, "Juliana rodriges", "Juliana@gmail.com");
		Pessoa p3 = new Pessoa(null, "jasmim silva", "jasmim@gmail.com");
		
		//Com essa linha de codigo aki agente stancia apropiadamente o 
		//EntityManagerFactory com as configuraçoes que estao no "Persistence.xml"
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		//Com essa estanciaçao automaticamente eu ja vou ter uma conecçao com o banco de dados 
		//e toda aquela historia de contexto de persistencia ja implementada
		EntityManager em = emf.createEntityManager();
		
		
		//Para enserir essas pessoas eu tenho que chamar (em.persist();) ele que pega o objeto e salva no banco de dados
		//aki da para perceber o tanto que e simples fazer um acesso a dados usando uma ferramenta de mapiamento a objeto relacional
		//com uma unica linha eu consigo persistir um objeto para uma linha na tabela do banco de dados 
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		
		System.out.println("Pronto! ");
		
		
		System.out.println("==================================================================");
	}

}
