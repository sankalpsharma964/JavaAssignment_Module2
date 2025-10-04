import java.util.concurrent.atomic.AtomicBoolean;

public class Q5_StopThreadFlag {
    static class NumberPrinter implements Runnable {
        private final AtomicBoolean running;
        private final Object lock = new Object();
        NumberPrinter(AtomicBoolean running) { this.running = running; }
        public void run() {
            for (int i = 1; i <= 100 && running.get(); i++) {
                System.out.println(i);
                synchronized (lock) {
                    try { lock.wait(50); } catch (InterruptedException e) { break; }
                }
            }
        }
        void wake() { synchronized (lock) { lock.notifyAll(); } }
    }

    public static void main(String[] args) throws Exception {
        AtomicBoolean running = new AtomicBoolean(true);
        NumberPrinter task = new NumberPrinter(running);
        Thread t = new Thread(task, "printer");
        t.start();
        Thread.sleep(300);
        running.set(false);
        task.wake();
        t.join();
        System.out.println("Stopped");
    }
}


