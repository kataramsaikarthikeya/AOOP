package lab6b;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ToDoListApp {
	private static List<String> toDoList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    updateTask();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter the task description: ");
        String task = scanner.nextLine();
        toDoList.add(task);
        System.out.println("Task added successfully.");
    }

    private static void updateTask() {
        displayTasks();
        System.out.print("Enter the task index to update (1-based index): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 1 && index <= toDoList.size()) {
            System.out.print("Enter the new description: ");
            String newDescription = scanner.nextLine();
            toDoList.set(index - 1, newDescription);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    private static void removeTask() {
        displayTasks();
        System.out.print("Enter the task index to remove (1-based index): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 1 && index <= toDoList.size()) {
            toDoList.remove(index - 1);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    private static void displayTasks() {
        if (toDoList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
	

}
