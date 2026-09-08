import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Queue, FIFO, can sort in a natural way
        // LinkedList, idk
        //TodoList todo = new TodoList ();
        //todo.add("ir as compras", priority);
        TodoList todo = new TodoList();
        todo.add("Eat breakfast |=| ",Priority.HIGH,Importance.LOW);
        todo.add("Wash the dishes |=|", Priority.LOW,Importance.MEDIUM);
        todo.add("VER O SPORTING |=|",Priority.HIGH,Importance.HIGH);
        todo.add("Dinner out |=|",Priority.MEDIUM,Importance.HIGH);
        todo.add("Walk the doggy |=|",Priority.MEDIUM,Importance.MEDIUM);
        todo.add("Go to code break |=|",Priority.LOW,Importance.HIGH);
        todo.add("Sleep (it is for weak people) |=|", Priority.LOW,Importance.LOW);
        todo.add("Go play some CSGO |=|", Priority.HIGH, Importance.MEDIUM);
        todo.add("Go ride in my SEAT |=|",Priority.MEDIUM,Importance.LOW);

        //for (Task task: todo.list) {
        //    System.out.println(task.toString());
        //}

        System.out.println("removed :" + todo.list.remove());
        System.out.println("************************************************");
        System.out.println("removed :" + todo.list.remove());
        System.out.println("************************************************");
        System.out.println("removed :" + todo.list.remove());
        System.out.println("************************************************");
        System.out.println("removed :" + todo.list.remove());
        System.out.println("************************************************");
        System.out.println("removed :" + todo.list.remove());
        System.out.println("************************************************");
        System.out.println("removed :" + todo.list.remove());
        System.out.println("************************************************");
        System.out.println("removed :" + todo.list.remove());
        System.out.println("************************************************");
        System.out.println("removed :" + todo.list.remove());
        System.out.println("************************************************");
        System.out.println("removed :" + todo.list.remove());
        System.out.println("************************************************");


    }



}
