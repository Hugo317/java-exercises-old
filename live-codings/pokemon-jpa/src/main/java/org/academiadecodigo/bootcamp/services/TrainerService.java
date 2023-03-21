package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.Trainer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

public class TrainerService {
    private EntityManagerFactory emf;


    public Trainer get(Integer id){
        EntityManager em = emf.createEntityManager();

        Trainer trainer = em.find(Trainer.class, id);
        em.close();

        return trainer;
    }


    public void add(Trainer trainer){

        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin();
            em.persist(trainer);
            em.getTransaction().commit();

        } catch (RollbackException exception){
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }





    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }
}
