public class Task {
    String title;
    String deadline;
    String priority;

    public Task(String title, String deadline, String priority) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String toFileString() {
        return title + "," + deadline + "," + priority;
    }

    public static Task fromFileString(String line) {
        String[] parts = line.split(",");
        return new Task(parts[0], parts[1], parts[2]);
    }
}