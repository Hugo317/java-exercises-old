package org.academiadecodigo.containers;

import java.util.PriorityQueue;

public class TodoList {

    private PriorityQueue<TodoItem> queue = new PriorityQueue<>();

    public void add(Importance importance, int priority, String item) {
        queue.add(new TodoItem(importance, priority, item));
    }

    public TodoItem remove() {
        return queue.remove();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
