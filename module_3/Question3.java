class PrintThread extends Thread {
    private String message;
    private int delay;

    public PrintThread(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        PrintThread thread1 = new PrintThread("Thread 1", 1000);
        PrintThread thread2 = new PrintThread("Thread 2", 2000);
        thread1.start();
        thread2.start();
    }
}
