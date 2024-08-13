package singleton;

public class Logger {
	 private static Logger instance = new Logger();

	    // Step 2: Make the constructor private so that this class cannot be instantiated from outside
	    private Logger() {
	        // private constructor
	    }

	    // Step 3: Provide a public static method to get the single instance of the Logger class
	    public static Logger getInstance() {
	        return instance;
	    }

	    // Step 4: Define a method to log messages
	    public void log(String message) {
	        System.out.println("Log: " + message);
	    }

}
