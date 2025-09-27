public class Question9 {

    public static void main(String[] args) {
        final Object chopstick1 = new Object();
        final Object chopstick2 = new Object();

        Thread philosopher1 = new Thread(() -> {
            synchronized (chopstick1) {
                System.out.println("Philosopher 1 picked up chopstick 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (chopstick2) {
                    System.out.println("Philosopher 1 picked up chopstick 2");
                }
            }
        });

        Thread philosopher2 = new Thread(() -> {
            synchronized (chopstick2) {
                System.out.println("Philosopher 2 picked up chopstick 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (chopstick1) {
                    System.out.println("Philosopher 2 picked up chopstick 1");
                }
            }
        });

        philosopher1.start();
        philosopher2.start();
    }
}
