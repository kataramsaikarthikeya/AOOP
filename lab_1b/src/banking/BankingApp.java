package banking;
import java.util.Scanner;

public class BankingApp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserSession userSession = UserSession.getInstance();

        while (true) {
            if (!userSession.isLoggedIn()) {
                System.out.println("1. Login");
                System.out.println("2. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (option == 1) {
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    userSession.login(username);
                    System.out.println("Logged in as " + username);
                } else if (option == 2) {
                    System.out.println("Exiting...");
                    break;
                }
            } else {
                System.out.println("1. View Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Logout");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                        System.out.println("Viewing balance for " + userSession.getUsername());
                        // Simulate balance viewing
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        System.out.println("Deposited " + depositAmount + " for " + userSession.getUsername());
                        // Simulate deposit operation
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        System.out.println("Withdrew " + withdrawAmount + " for " + userSession.getUsername());
                        // Simulate withdrawal operation
                        break;
                    case 4:
                        userSession.logout();
                        System.out.println("Logged out.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }

        scanner.close();
    }

}
