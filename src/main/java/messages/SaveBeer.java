package messages;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBeer {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-course");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Bieren beer = new Bieren(2001, "My Own beer",10,1,50);
        em.persist(beer );
        tx.commit();
        em.close();
        emf.close();
        System.out.println("Beer saved");
    }
}
