package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.pokemon.Pokemon;

import javax.persistence.*;
import java.util.List;

public class PokemonService {

    private EntityManagerFactory emf;


    public Pokemon get(Integer id){

        EntityManager em = emf.createEntityManager();

        Pokemon pokemon = em.find(Pokemon.class, id);
        em.close();

        return pokemon;
    }

    public List<Pokemon> findByType(String type){

        EntityManager em = emf.createEntityManager();

        TypedQuery<Pokemon> query = em.createQuery("SELECT poke FROM Pokemon poke WHERE poke.type= :batata", Pokemon.class);
        query.setParameter("batata", type);

        List<Pokemon> list = query.getResultList();
        em.close();

        return list;
    }

    public void add(Pokemon pokemon){

        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin();
            em.persist(pokemon);
            em.getTransaction().commit();

        } catch (RollbackException exception){
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }
}
