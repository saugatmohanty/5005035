public class Logger {
    // Private static instance of the Logger class
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Private constructor to prevent instantiation
    }

    // Public static method to get the instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to demonstrate logging
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
