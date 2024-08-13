package singleton;

public class Main {
	 public static void main(String[] args) {
	        // Get the single instance of the Logger
	        Logger logger = Logger.getInstance();

	        // Log some messages
	        logger.log("This is the first log message.");
	        logger.log("This is the second log message.");

	        // To demonstrate that the Singleton pattern is working, we'll try to get another instance
	        Logger anotherLogger = Logger.getInstance();
	        
	        // Check if both instances are the same
	        if (logger == anotherLogger) {
	            System.out.println("Both logger instances are the same.");
	        } else {
	            System.out.println("Different logger instances.");
	        }
	    }

}
