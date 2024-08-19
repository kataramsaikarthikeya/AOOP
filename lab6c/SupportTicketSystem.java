package lab6c;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SupportTicketSystem {
	private static Queue<String> ticketQueue = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display All Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTicket();
                    break;
                case 2:
                    processNextTicket();
                    break;
                case 3:
                    displayPendingTickets();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void addTicket() {
        System.out.print("Enter the ticket description: ");
        String ticket = scanner.nextLine();
        ticketQueue.add(ticket);
        System.out.println("Ticket added successfully.");
    }

    private static void processNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
        } else {
            String nextTicket = ticketQueue.poll();
            System.out.println("Processing ticket: " + nextTicket);
        }
    }

    private static void displayPendingTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending Tickets:");
            int i = 1;
            for (String ticket : ticketQueue) {
                System.out.println(i + ". " + ticket);
                i++;
            }
        }
    }

}
