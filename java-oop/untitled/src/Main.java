import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Main main = new Main();
        Machine<Integer> numberMachine = new Machine<>();
        Machine<String> stringMachine = new Machine<>();


        numberMachine.performOperation(10, (operand) -> operand++);

        numberMachine.performOperation(10, 5, ((operand1, operand2) -> operand1 - operand2));

        Player hugo = new Player(1000);
        Player antonio = new Player(200);



        String holder = stringMachine.performOperation("Hugo", " é o pai", ((operand1, operand2) -> operand1 + operand2));
        System.out.println(holder);

        String atoa = stringMachine.performOperation("Hugo123", (operand) -> operand.substring(0, operand.indexOf("1")));
        System.out.println(atoa);

        int diff = numberMachine.performOperation(hugo.getScore(), antonio.getScore(), (operand1, operand2) -> operand1 - operand2);

        if (diff > 0) System.out.println("Hugo wins");
        if (diff == 0) System.out.println("it's a tie");
        if (diff < 0) System.out.println("Antonio wins");

        Thread thread = new Thread(()->main.add());



    }
    private void add(){
        int atoa = 5 + 6;
    }
}
