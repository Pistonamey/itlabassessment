import java.util.ArrayList;

public class TaskManager {
    private ArrayList<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<String>();
    }

    public void addTask(String task) {
        if (task != null || !task.isEmpty())
            tasks.add(task);
    }

    public boolean removeTask(String task) {
        if (task == null || task.isEmpty())
            return false;
        return tasks.remove(task);
    }

    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size())
            tasks.set(index, newTask);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            for (String task : tasks) {
                System.out.println(task);
            }
        }
    }
}
