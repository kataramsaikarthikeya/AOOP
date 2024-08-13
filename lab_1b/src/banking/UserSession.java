package banking;

public class UserSession {
	private static UserSession instance = new UserSession();

    // Step 2: Make the constructor private so that this class cannot be instantiated from outside
    private UserSession() {
        // private constructor
    }

    // Step 3: Provide a public static method to get the single instance of the UserSession class
    public static UserSession getInstance() {
        return instance;
    }

    // Instance variables to hold user login state
    private boolean loggedIn = false;
    private String username;

    // Method to log in a user
    public void login(String username) {
        this.loggedIn = true;
        this.username = username;
    }

    // Method to log out the user
    public void logout() {
        this.loggedIn = false;
        this.username = null;
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Method to get the logged-in username
    public String getUsername() {
        return username;
    }

}
