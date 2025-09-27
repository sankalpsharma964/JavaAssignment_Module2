import java.util.LinkedList;

class SharedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 1;

    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                System.out.println("Buffer is full, producer is waiting...");
                wait();
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            notify(); // Notify the consumer
        }
    }

    public int consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                System.out.println("Buffer is empty, consumer is waiting...");
                wait();
            }
            int item = buffer.removeFirst();
            System.out.println("Consumed: " + item);
            notify(); // Notify the producer
            return item;
        }
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                buffer.consume();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question10_1 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
