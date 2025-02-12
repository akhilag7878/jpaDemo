package com.akhil;

import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceUnit;
import org.hibernate.sql.ast.tree.expression.AliasedExpression;

/**
 * Hello world!
 */
public class App {
    @PersistenceUnit(name = "pu")
   // static EntityManagerFactory emf;
    public static void main(String[] args) {
        Alien akhil=new Alien();
        akhil.setAid(7);
        akhil.setTech("Hardware");
        akhil.setAname("akhil");
      //emf =
        EntityManager em=Persistence.createEntityManagerFactory("pu")
                .createEntityManager();
       // = emf.createEntityManager();
        em.getTransaction().begin();
        //akhil.setAid(12);
        //em.persist(akhil);
        //akhil.setAname("chitranshu");
        akhil=em.find(Alien.class,8);
       // em.createQuery("").getSingleResult();
        em.getTransaction().commit();
        System.out.println(akhil);
    }
}
