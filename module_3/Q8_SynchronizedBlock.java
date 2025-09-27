// 2.Synchronized Block: Modify the above program (bank account example) to use a synchronized block instead of a synchronized method.

class BankAccountWithBlock {
    private double balance;
    private final Object lock = new Object();

    public BankAccountWithBlock(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " depositing " + amount);
            balance += amount;
            System.out.println("New balance after deposit: " + balance);
        }
    }

    public void withdraw(double amount) {
        synchronized (lock) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
                balance -= amount;
                System.out.println("New balance after withdrawal: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + ", insufficient balance.");
            }
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Q8_SynchronizedBlock {
    public static void main(String[] args) {
        BankAccountWithBlock account = new BankAccountWithBlock(1000);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(200);
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}