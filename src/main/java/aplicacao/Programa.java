package aplicacao;

import dominio.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

  public static void main(String[] args) {
    System.out.println("================================================");

    //Com essa linha de codigo aki agente stancia apropiadamente o
    //EntityManagerFactory com as configuraçoes que estao no "Persistence.xml"
    EntityManagerFactory emf = Persistence.createEntityManagerFactory(
      "exemplo-jpa"
    );

    //Com essa estanciaçao automaticamente eu ja vou ter uma conecçao com o banco de dados
    //e toda aquela historia de contexto de persistencia ja implementada
    EntityManager em = emf.createEntityManager();

    //aki agora eu vou buscar uma pessoa no banco de dados
    //perceba que para buscar basta uma unica linha agente consegue fazer a pesquisa no banco de dados
    //converter esse dado para um objeto e instancia o objeto... o jpa facilita muito o asseso a dados para a gente
    Pessoa p = em.find(Pessoa.class, 5);

    //Vamos supor que eu queira apagar uma pessoa no banco de dados
    //Para apagar uma pessoa no banco de dados eu tenho que chamar "em.remove();"
    em.getTransaction().begin();
    //Sempre que e uma opreçao que nao seja uma simples consulta tem que colocar a trasaçao
    em.remove(p);
    em.getTransaction().commit();

    System.out.println("Pronto! ");

    System.out.println("===================================================");
    em.close();
    emf.close();
  }
}
