package org.academiadecodigo.bootcamp;

public class Player {
String name;
static int counter;
int pNumber = 0;

Player (String name){
    this.name = name;
    ++counter;
    getpNumber();
}
    public void getpNumber(){
    pNumber = Random.rNumber();
}
    public int getFinalNumber(){
    return pNumber = Random.rNumber();
    }
    public int getCounter(){
    return counter;
    }



}
