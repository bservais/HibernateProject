package messages;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetBeers {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernate-course");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Bieren beer = em.find(Bieren.class,2000);
//        beer = em.
        System.out.println(beer.toString());
        tx.commit();
        em.close();
        emf.close();
    }
}
