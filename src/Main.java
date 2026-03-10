import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> taskList = new ArrayList<>();


        System.out.println("Добро пожаловать!");
        while(true) {
            System.out.println("""
                    Что бы вы хотели сделать?:
                    1. Добавить задачу
                    2. Показать задачи
                    3. Отметить задачу выполненной
                    4. Удалить задачу
                    """);

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Введите название задачи: ");
                    String addTask = scanner.next();
                    taskList.add(addTask);
                    System.out.println("Задача успешно добавлена!");
                    break;
                case 2:
                    System.out.println("Все задачи: \n");
                    System.out.println(taskList);
                case 3:

                case 4:
                    System.out.println("Все задачи: \n");
                    System.out.println(taskList);
                    System.out.println("Какую задачу вы бы хотели удалить?");
                    int removeTask = scanner.nextInt();
                    taskList.remove(removeTask);
                    break;
            }
        }
    }
}