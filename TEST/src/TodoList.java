import java.util.*;

public class TodoList implements Iterable{
    PriorityQueue<Task> list;
    Iterator iter;
    public TodoList (){
        list = new PriorityQueue<>();
        iter = iterator();
    }

    public void add(String str, Priority priority,Importance importance ){
        list.add(new Task(str,priority,importance));
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }
}
