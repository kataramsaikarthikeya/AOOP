package lab6d;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowsingHistory {
	private static Deque<String> backStack = new ArrayDeque<>();
    private static Deque<String> forwardStack = new ArrayDeque<>();
    private static String currentPage = "Home";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nBrowsing History");
            System.out.println("1. Add New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewPage();
                    break;
                case 2:
                    goBack();
                    break;
                case 3:
                    goForward();
                    break;
                case 4:
                    displayCurrentPage();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void addNewPage() {
        System.out.print("Enter the new page URL: ");
        String newPage = scanner.nextLine();
        if (!currentPage.equals("Home")) {
            backStack.push(currentPage);
        }
        currentPage = newPage;
        forwardStack.clear(); // Clear forward stack when a new page is visited
        System.out.println("Page added successfully.");
    }

    private static void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("No previous pages in history.");
        } else {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Moved back to: " + currentPage);
        }
    }

    private static void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward pages in history.");
        } else {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Moved forward to: " + currentPage);
        }
    }

    private static void displayCurrentPage() {
        System.out.println("Current Page: " + currentPage);
    }
	

}
