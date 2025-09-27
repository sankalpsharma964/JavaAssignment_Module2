// 5.Stopping a Thread: Write a program that safely stops a thread using a flag. The thread should print numbers from 1 to 100, and the program should be able to stop the thread by setting the flag to false.

class StoppableThread extends Thread {
    private volatile boolean running = true;

    public void stopThread() {
        running = false;
    }

    public void run() {
        int count = 1;
        while (running && count <= 100) {
            System.out.println("Count: " + count);
            count++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped.");
    }
}

public class Q11_StopThread {
    public static void main(String[] args) throws InterruptedException {
        StoppableThread stoppableThread = new StoppableThread();
        stoppableThread.start();

        // Let the thread run for a while
        Thread.sleep(2000);

        // Stop the thread
        System.out.println("Stopping the thread...");
        stoppableThread.stopThread();
    }
}