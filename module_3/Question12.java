import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class LockedCounter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class LockedCounterThread extends Thread {
    private LockedCounter counter;

    public LockedCounterThread(LockedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Question12 {
    public static void main(String[] args) throws InterruptedException {
        // Without lock
        Counter counter = new Counter();
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count (without lock): " + counter.getCount());

        // With lock
        LockedCounter lockedCounter = new LockedCounter();
        LockedCounterThread lt1 = new LockedCounterThread(lockedCounter);
        LockedCounterThread lt2 = new LockedCounterThread(lockedCounter);
        lt1.start();
        lt2.start();
        lt1.join();
        lt2.join();
        System.out.println("Final count (with lock): " + lockedCounter.getCount());
    }
}
