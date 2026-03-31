import java.util.*;
import java.io.*;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();
    final String FILE_NAME = "data/tasks.txt";

    // Load tasks from file
    public void loadTasks() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) return;

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                tasks.add(Task.fromFileString(sc.nextLine()));
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error loading tasks.");
        }
    }

    // Save tasks to file
    public void saveTasks() {
        try {
            PrintWriter pw = new PrintWriter(FILE_NAME);
            for (Task t : tasks) {
                pw.println(t.toFileString());
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error saving tasks.");
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
        saveTasks();
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        int i = 1;
        for (Task t : tasks) {
            System.out.println(i++ + ". " + t.title + " | " + t.deadline + " | " + t.priority);
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            saveTasks();
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}