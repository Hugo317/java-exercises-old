package org.academiadecodigo.bootcamp.model.pokemon;


import org.academiadecodigo.bootcamp.model.AbstractModel;
import org.academiadecodigo.bootcamp.model.MoveSet;

import javax.persistence.*;

@Entity
@Table(name = "pokémon")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "pokemon_type"
)
public class Pokemon extends AbstractModel {


    private String type;
    private String official_name;
    private String nickname;


    @Embedded
    private MoveSet moveSet;

    public Pokemon(String type, String official_name, String nickname) {
        this.type = type;
        this.official_name = official_name;
        this.nickname = nickname;
    }


    public Pokemon(){}



    public MoveSet getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(MoveSet moveSet) {
        this.moveSet = moveSet;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOfficial_name() {
        return official_name;
    }

    public void setOfficial_name(String official_name) {
        this.official_name = official_name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                ", type='" + type + '\'' +
                ", official_name='" + official_name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", moveSet=" + moveSet +
                '}';
    }
}
