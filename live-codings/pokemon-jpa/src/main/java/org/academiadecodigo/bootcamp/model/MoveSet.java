package org.academiadecodigo.bootcamp.model;


import javax.persistence.Embeddable;

@Embeddable
public class MoveSet {

    private String move1;
    private String move2;
    private String move3;
    private String move4;


    public MoveSet(String move1, String move2, String move3, String move4) {
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public MoveSet(){}

    public String getMove1() {
        return move1;
    }

    public void setMove1(String m1) {
        this.move1 = m1;
    }

    public String getMove2() {
        return move2;
    }

    public void setMove2(String m2) {
        this.move2 = m2;
    }

    public String getMove3() {
        return move3;
    }

    public void setMove3(String m3) {
        this.move3 = m3;
    }

    public String getMove4() {
        return move4;
    }

    public void setMove4(String m4) {
        this.move4 = m4;
    }

    @Override
    public String toString() {
        return "MoveSet{" +
                "move1='" + move1 + '\'' +
                ", move2='" + move2 + '\'' +
                ", move3='" + move3 + '\'' +
                ", move4='" + move4 + '\'' +
                '}';
    }
}
