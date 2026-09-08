public class Task implements Comparable<Task>{
    String taskName;
    Importance importance;
    Priority priority;


    public Task(String str,Priority priority,Importance importance){
        taskName=str;
        this.importance=importance;
        this.priority=priority;
    }

    public String toString(){
        return taskName + " " +
        importance.toString() + " " +
        priority.toString();

    }
    public String getTaskName() {
        return taskName;
    }

    public Importance getImportance() {
        return importance;
    }

    public Priority getPriority() {
        return priority;
    }


        @Override
        public int compareTo(Task task) {
            if (this.getImportance().value > task.getImportance().value){
                return 1;
            }
            if (this.getImportance().value < task.getImportance().value){
                return -1;
            }
            if (this.getImportance().value == task.getImportance().value) {
                if (this.getPriority().value > task.getPriority().value) {
                    return 1;
                }
                if(this.getPriority().value == task.getPriority().value){
                    return 0;
                }
                if(this.getPriority().value < task.getPriority().value){
                    return -1;
                }
            }
            System.out.println("broken code forfeit the academy");
            return 0;
        }

}
