class AutoSaveThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Auto-Save in progress...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        System.out.println("Main thread: Starting file processing...");
        try {
            // Simulate file processing
            for (int i = 0; i < 10; i++) {
                System.out.println("Main thread: Processing file chunk " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread: File processing complete.");
    }
}
