public class Q2_SynchronizedBlockBankDemo {
    static class UnsafeBankAccount {
        private long balance;
        public UnsafeBankAccount(long opening) { this.balance = opening; }
        public void deposit(long amount) { balance += amount; }
        public long getBalance() { return balance; }
    }

    static class BlockSyncedBankAccount {
        private long balance;
        private final Object lock = new Object();
        public BlockSyncedBankAccount(long opening) { this.balance = opening; }
        public void deposit(long amount) { synchronized (lock) { balance += amount; } }
        public long getBalance() { synchronized (lock) { return balance; } }
    }

    public static void main(String[] args) throws InterruptedException {
        final int DEPOSITS_PER_THREAD = 100_000;
        final long AMOUNT = 1;

        UnsafeBankAccount unsafe = new UnsafeBankAccount(0);
        Thread t1 = new Thread(() -> { for (int i = 0; i < DEPOSITS_PER_THREAD; i++) unsafe.deposit(AMOUNT); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < DEPOSITS_PER_THREAD; i++) unsafe.deposit(AMOUNT); });
        t1.start(); t2.start(); t1.join(); t2.join();
        long expected = DEPOSITS_PER_THREAD * 2L * AMOUNT;
        System.out.println("UNSAFE expected=" + expected + ", actual=" + unsafe.getBalance());

        BlockSyncedBankAccount safe = new BlockSyncedBankAccount(0);
        Thread s1 = new Thread(() -> { for (int i = 0; i < DEPOSITS_PER_THREAD; i++) safe.deposit(AMOUNT); });
        Thread s2 = new Thread(() -> { for (int i = 0; i < DEPOSITS_PER_THREAD; i++) safe.deposit(AMOUNT); });
        s1.start(); s2.start(); s1.join(); s2.join();
        System.out.println("BLOCK  expected=" + expected + ", actual=" + safe.getBalance());
    }
}


