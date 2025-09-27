class CountdownThread extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TickThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Tick...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        CountdownThread countdownThread = new CountdownThread();
        TickThread tickThread = new TickThread();
        tickThread.setDaemon(true);
        countdownThread.start();
        tickThread.start();
    }
}
