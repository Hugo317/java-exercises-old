public class Game {
Sakura[] arrSakuras;

public void start(int number){
    arrSakuras = new Sakura[number];
    createSakura(arrSakuras);
}
public void createSakura(Sakura[] array){
    for (int i = 0; i < array.length; i++) {
        array[i] = new Sakura();
    }
}



}
