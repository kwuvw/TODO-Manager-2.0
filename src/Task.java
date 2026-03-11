import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

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

    public static void saveTaskInFile(ArrayList<Task> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tasks.txt"))) {
            for (Task task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<Task> loadTasksFromFile() {
        ArrayList<Task> tasks = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                boolean done = line.endsWith("[Выполнена]");
                String name = line.substring(0, line.lastIndexOf(" ["));

                Task task = new Task(name);
                task.isDone = done;

                tasks.add(task);
            }

        } catch (FileNotFoundException e) {
            return tasks;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tasks;
    }

    public static void printTasksFromFile(ArrayList<Task> taskList) throws IOException {
        Files.lines(Path.of("tasks.txt"))
                .forEach(System.out::println);
    }
    }

