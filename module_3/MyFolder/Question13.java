import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class Question13 {

    public static void main(String[] args) {
        final ReentrantLock lock1 = new ReentrantLock();
        final ReentrantLock lock2 = new ReentrantLock();

        // Deadlock scenario
        Thread thread1 = new Thread(() -> {
            lock1.lock();
            System.out.println("Thread 1: Acquired lock 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock2.lock();
            System.out.println("Thread 1: Acquired lock 2");
            lock2.unlock();
            lock1.unlock();
        });

        Thread thread2 = new Thread(() -> {
            lock2.lock();
            System.out.println("Thread 2: Acquired lock 2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock1.lock();
            System.out.println("Thread 2: Acquired lock 1");
            lock1.unlock();
            lock2.unlock();
        });

        System.out.println("--- Deadlock Scenario ---");
        thread1.start();
        thread2.start();

        try {
            thread1.join(2000);
            thread2.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- Deadlock Fixed with tryLock() ---");

        // Deadlock fixed with tryLock()
        Thread thread3 = new Thread(() -> {
            while (true) {
                try {
                    if (lock1.tryLock(100, TimeUnit.MILLISECONDS)) {
                        System.out.println("Thread 3: Acquired lock 1");
                        if (lock2.tryLock(100, TimeUnit.MILLISECONDS)) {
                            System.out.println("Thread 3: Acquired lock 2");
                            lock2.unlock();
                            lock1.unlock();
                            break;
                        } else {
                            System.out.println("Thread 3: Could not acquire lock 2, releasing lock 1");
                            lock1.unlock();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread4 = new Thread(() -> {
            while (true) {
                try {
                    if (lock2.tryLock(100, TimeUnit.MILLISECONDS)) {
                        System.out.println("Thread 4: Acquired lock 2");
                        if (lock1.tryLock(100, TimeUnit.MILLISECONDS)) {
                            System.out.println("Thread 4: Acquired lock 1");
                            lock1.unlock();
                            lock2.unlock();
                            break;
                        } else {
                            System.out.println("Thread 4: Could not acquire lock 1, releasing lock 2");
                            lock2.unlock();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread3.start();
        thread4.start();
    }
}
