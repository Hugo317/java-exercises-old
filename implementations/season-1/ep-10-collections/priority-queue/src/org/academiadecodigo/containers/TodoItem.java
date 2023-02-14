package org.academiadecodigo.containers;

public class TodoItem implements Comparable<TodoItem> {

    private Importance importance;
    private int priority;
    private String item;

    public TodoItem(Importance importance, int priority, String item) {
        this.importance = importance;
        this.priority = priority;
        this.item = item;
    }

    @Override
    public int compareTo(TodoItem todoItem) {

        if (importance.compareTo(todoItem.importance) == 0) {
            return priority - todoItem.priority;
        }

        return importance.compareTo(todoItem.importance);

    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "importance=" + importance +
                ", priority=" + priority +
                ", item='" + item + '\'' +
                '}';
    }

}
