class JoinMe {

    public static void main(String[] args) {
        Thread childThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("Hello from the child thread!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        childThread.start();

        try {
            childThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread has finished.");
    }
}
