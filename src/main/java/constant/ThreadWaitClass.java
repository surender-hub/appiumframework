package constant;

public class ThreadWaitClass {

    /**
     * Custom sleep method to avoid repetitive try-catch blocks.
     * @param milliseconds Time to wait in milliseconds.
     */
    public static void customSleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.out.println("Sleep interrupted: " + e.getMessage());
        }
    }
}