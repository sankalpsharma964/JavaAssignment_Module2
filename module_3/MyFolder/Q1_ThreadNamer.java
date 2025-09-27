class ThreadNamer {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "FirstThread");
        Thread thread2 = new Thread(new MyRunnable());
        thread2.setName("SecondThread");

        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("This message is from " + Thread.currentThread().getName());
        }
    }
}
