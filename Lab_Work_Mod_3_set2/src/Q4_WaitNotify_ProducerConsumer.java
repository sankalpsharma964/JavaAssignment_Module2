import java.util.*;

public class Q4_WaitNotify_ProducerConsumer {
    static class BoundedBuffer<T> {
        private final Deque<T> q = new ArrayDeque<>();
        private final int cap;
        BoundedBuffer(int cap) { this.cap = cap; }
        public synchronized void put(T x) throws InterruptedException {
            while (q.size() == cap) wait();
            q.addLast(x);
            notifyAll();
        }
        public synchronized T take() throws InterruptedException {
            while (q.isEmpty()) wait();
            T v = q.removeFirst();
            notifyAll();
            return v;
        }
    }

    public static void main(String[] args) throws Exception {
        BoundedBuffer<Integer> buf = new BoundedBuffer<>(5);
        final int N = 20;

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= N; i++) {
                    buf.put(i);
                    System.out.println("Produced " + i);
                    Thread.sleep(10);
                }
            } catch (InterruptedException ignored) {}
        }, "producer");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= N; i++) {
                    int v = buf.take();
                    System.out.println("Consumed " + v);
                    Thread.sleep(15);
                }
            } catch (InterruptedException ignored) {}
        }, "consumer");

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("Done");
    }
}
