// 4.Using wait(), notify(), and notifyAll(): Implement a producer-consumer scenario where one thread (producer) produces data and another thread (consumer) consumes it. Use the wait() and notify() methods for synchronization.

import java.util.LinkedList;

class ProducerConsumer {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity)
                    wait();

                System.out.println("Producer produced-" + value);
                list.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.size() == 0)
                    wait();

                int val = list.removeFirst();
                System.out.println("Consumer consumed-" + val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

public class Q10_ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        final ProducerConsumer pc = new ProducerConsumer();

        Thread t1 = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}