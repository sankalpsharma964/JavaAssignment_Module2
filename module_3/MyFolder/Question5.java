class WorkerThread extends Thread {
    public WorkerThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + getName() + ", Priority: " + getPriority());
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        WorkerThread worker1 = new WorkerThread("Worker-1");
        WorkerThread worker2 = new WorkerThread("Worker-2");
        WorkerThread worker3 = new WorkerThread("Worker-3");

        worker1.setPriority(Thread.MIN_PRIORITY);
        worker2.setPriority(Thread.NORM_PRIORITY);
        worker3.setPriority(Thread.MAX_PRIORITY);

        worker1.start();
        worker2.start();
        worker3.start();
    }
}
