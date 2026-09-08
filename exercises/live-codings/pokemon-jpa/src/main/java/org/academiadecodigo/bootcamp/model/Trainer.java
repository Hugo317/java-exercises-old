package org.academiadecodigo.bootcamp.model;


import org.academiadecodigo.bootcamp.model.pokemon.Pokemon;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "trainers")
public class Trainer extends AbstractModel {


    private Integer age;
    private String name;
    private String favPokemon;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pokemon> pokemons;


    public Trainer(Integer age, String name, String favPokemon) {
        this.age = age;
        this.name = name;
        this.favPokemon = favPokemon;
    }

    public Trainer(){

    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavPokemon() {
        return favPokemon;
    }

    public void setFavPokemon(String favPokemon) {
        this.favPokemon = favPokemon;
    }





    @Override
    public String toString() {
        return "Trainer{" +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", favPokemon='" + favPokemon + '\'' +
                '}';
    }
}
