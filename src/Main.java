import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Task> taskList = new ArrayList<>();


        System.out.println("Добро пожаловать!");
        while (true) {
            System.out.println("""
                    Что бы вы хотели сделать?:
                    1. Добавить задачу
                    2. Показать задачи
                    3. Отметить задачу выполненной
                    4. Удалить задачу
                    5. Выход
                    """);

            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Введите название задачи: ");
                    String addTask = scanner.nextLine();
                    taskList.add(new Task(addTask));
                    System.out.println("Задача успешно добавлена!");
                    break;
                case 2:
                    System.out.println("Все задачи: \n");
                    for (int i = 0; i < taskList.size(); i++) {
                        System.out.println(i + ": " + taskList.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Все задачи: \n");
                    for (int i = 0; i < taskList.size(); i++) {
                        System.out.println(i + ": " + taskList.get(i));
                    }

                    System.out.println("Какую задачу вы выполнили?:\n");
                    int completed = scanner.nextInt();
                    taskList.get(completed).complete();
                    System.out.println("Задача выполнена!");
                    break;
                case 4:
                    System.out.println("Все задачи: \n");
                    for (int i = 0; i < taskList.size(); i++) {
                        System.out.println(i + ": " + taskList.get(i));
                    }

                    System.out.println("Какую задачу вы бы хотели удалить?");
                    int removeTask = scanner.nextInt();
                    taskList.remove(removeTask);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз!");
                    break;
            }
        }
    }
}