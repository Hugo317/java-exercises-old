import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Sakura {
    Picture pic;
    double startingX;
    double imageWidth = 80;
    double imageHeigth = 200;
    double startingY;
    double[] hitBox = new double[4];
    Sakura(){
        pic = new Picture(getRandomX(),getRandomX(),"resources/sakura.jpg");
       // pic = new Picture(1600,600,"resources/sakura.jpg");
        pic.draw();
    }

private double getRandomX(){
        double tempX;
        tempX = Math.random()*1600;
        startingX = tempX;
    return tempX;
    }

    private double getRandomY(){
        double tempY;
        tempY = Math.random()*650;
        startingY = tempY;
        return tempY;
    }
// array 0 - startingX
// array 1 - startingY
// array 0 - endingX
// array 1 - endingY
public double[] getHitbox(double[] array){
        array[0] = startingX;
        array[1] = startingY;
        array[2] = startingX + imageWidth;
        array[4] = startingY + imageHeigth;
    return array;
    }

}
