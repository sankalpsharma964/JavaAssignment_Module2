class NumberPrinter {
    private int number = 1;
    private int max = 20;
    private boolean isOdd = true;

    public void printOdd() {
        synchronized (this) {
            while (number <= max) {
                while (!isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                isOdd = false;
                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (number <= max) {
                while (isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                isOdd = true;
                notify();
            }
        }
    }
}

public class Question10_2 {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();

        Thread oddThread = new Thread(numberPrinter::printOdd, "OddThread");
        Thread evenThread = new Thread(numberPrinter::printEven, "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}
