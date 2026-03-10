public class Task {

    String nameTask;
    boolean isDone;

    public Task(String nameTask) {
        this.nameTask = nameTask;
        this.isDone = false;
    }
    public void complete() {
        isDone = true;
    }

    @Override
    public String toString() {
        return nameTask + " [" + (isDone ? "Выполнена" : "Не выполнена") + "]";
    }

}
