import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Aim implements MouseHandler {
    private Player player;


    public void init() {
        player = new Player();
        Mouse mouse = new Mouse(this);

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        System.out.println("mouse clicked");
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

}
