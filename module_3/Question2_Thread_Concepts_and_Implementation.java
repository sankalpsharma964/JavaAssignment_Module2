class ReverseStringRunnable implements Runnable {
    private String str;

    public ReverseStringRunnable(String str) {
        this.str = str;
    }

    public void run() {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}

public class Question2_Thread_Concepts_and_Implementation {
    public static void main(String[] args) {
        ReverseStringRunnable reverseStringRunnable = new ReverseStringRunnable("MULTITHREADING");
        Thread thread = new Thread(reverseStringRunnable);
        thread.start();
    }
}
