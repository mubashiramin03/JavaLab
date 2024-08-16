import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. List tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter a task: ");
                    String task = scanner.next();
                    tasks.add(task);
                    break;
                case 2:
                    System.out.print("Enter the task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    tasks.remove(taskNumber - 1);
                    break;
                case 3:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
