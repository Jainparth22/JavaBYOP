import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        manager.loadTasks();

        while (true) {
            System.out.println("\n===== TASK MANAGER =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter title: ");
                String title = sc.nextLine();

                System.out.print("Enter deadline: ");
                String deadline = sc.nextLine();

                System.out.print("Enter priority (High/Medium/Low): ");
                String priority = sc.nextLine();

                manager.addTask(new Task(title, deadline, priority));
                System.out.println("Task added!");

            } else if (choice == 2) {
                manager.viewTasks();

            } else if (choice == 3) {
                manager.viewTasks();
                System.out.print("Enter task number to delete: ");
                int index = sc.nextInt();
                manager.deleteTask(index - 1);

            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}