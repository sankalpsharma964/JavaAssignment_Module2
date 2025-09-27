// 3.Thread Deadlock: Write a program that simulates a deadlock condition. Create two threads that attempt to lock two different resources and cause a deadlock.

public class Q9_ThreadDeadlock {
    public static void main(String[] args) {
        final Object resource1 = "resource1";
        final Object resource2 = "resource2";

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: waiting for resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 1 and 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: waiting for resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1 and 2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}