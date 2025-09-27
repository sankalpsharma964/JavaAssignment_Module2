import java.util.Random;

class GreetingThreads {

    public static void main(String[] args) {
        Thread threadA = new Thread(new Greeter("Hello from Thread A!"), "Thread A");
        Thread threadB = new Thread(new Greeter("Greetings from Thread B!"), "Thread B");
        Thread threadC = new Thread(new Greeter("Hi from Thread C!"), "Thread C");

        threadA.start();
        threadB.start();
        threadC.start();
    }

    static class Greeter implements Runnable {
        private final String message;
        private final Random random = new Random();

        public Greeter(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(message);
                try {
                    Thread.sleep(random.nextInt(401) + 100); // Sleep for 100-500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
