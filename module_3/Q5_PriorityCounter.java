class PriorityCounter {

    private static int counter = 0;

    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(new CounterIncrement(), "HighPriorityThread");
        Thread lowPriorityThread = new Thread(new CounterIncrement(), "LowPriorityThread");

        highPriorityThread.setPriority(8);
        lowPriorityThread.setPriority(2);

        highPriorityThread.start();
        lowPriorityThread.start();

        try {
            highPriorityThread.join();
            lowPriorityThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter);
    }

    static class CounterIncrement implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                counter++;
            }
        }
    }
}
