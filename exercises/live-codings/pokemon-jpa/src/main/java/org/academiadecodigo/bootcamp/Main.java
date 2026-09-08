package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.model.MoveSet;
import org.academiadecodigo.bootcamp.model.Trainer;
import org.academiadecodigo.bootcamp.model.pokemon.BabyPokemon;
import org.academiadecodigo.bootcamp.model.pokemon.NormalPokemon;
import org.academiadecodigo.bootcamp.model.pokemon.Pokemon;
import org.academiadecodigo.bootcamp.services.PokemonService;
import org.academiadecodigo.bootcamp.services.TrainerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* creating necessary objects */
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
       /* PokemonService pokemonService = new PokemonService();
        TrainerService trainerService = new TrainerService();

        /* creating data */
        /*
        Pokemon p1 = new BabyPokemon();
        p1.setNickname("Tiny Egg");
        p1.setType("Fairy");
        p1.setOfficial_name("Togepi");
        p1.setMoveSet(new MoveSet("Metronome", "Wish", "Charm", "Yawn"));

        Pokemon p2 = new NormalPokemon();
        p2.setNickname("Electric Rat");
        p2.setType("Electric");
        p2.setOfficial_name("Pikachu");
        p2.setMoveSet(new MoveSet("ThunderBolt", "Thunderwave", "Iron Tail", "Tackle"));

        Pokemon p3 = new NormalPokemon();
        p3.setOfficial_name("Bulbasaur");
        p3.setType("Grass");
        p3.setNickname("Turnip");
        p3.setMoveSet(new MoveSet("Vine Whip", "Leech Seed", "Poison Powder", "Solar Beam"));

        Pokemon p4 = new BabyPokemon();
        p4.setType("Grass");
        p4.setNickname("Little Sprout");
        p4.setOfficial_name("Budew");
        p4.setMoveSet(new MoveSet("Vine Whip", "Leech Seed", "Poison Powder", "Solar Beam"));

        Trainer ash = new Trainer(10, "Ash", "Pikachu");

        List<Pokemon> list = new LinkedList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        ash.setPokemons(list);

        /* wiring */
        /*
        pokemonService.setEmf(emf);
        trainerService.setEmf(emf);*/

        /* only needed to add Trainer object, thanks to cascade */
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring/spring-config.xml");

        trainerService.add(ash);


        //emf.close();

    }
}
