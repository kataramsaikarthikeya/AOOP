package lab6b;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp {
	// Define a Task class to represent each task
    static class Task {
        String description;

        Task(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    // List to store tasks
    private List<Task> tasks = new ArrayList<>();

    // Method to add a task
    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    // Method to update a task's description
    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).description = newDescription;
            System.out.println("Task updated at position " + index + " to: " + newDescription);
        } else {
            System.out.println("Invalid task position.");
        }
    }

    // Method to remove a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task position.");
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ToDoListApp toDoList = new ToDoListApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    toDoList.displayTasks();
                    System.out.print("Enter task position to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    toDoList.updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    toDoList.displayTasks();
                    System.out.print("Enter task position to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    toDoList.removeTask(removeIndex);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

}
