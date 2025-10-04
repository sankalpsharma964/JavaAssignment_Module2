import java.lang.management.*;

public class Q3_ThreadDeadlockDemo {
    private static final Object L1 = new Object();
    private static final Object L2 = new Object();

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            synchronized (L1) {
                sleep(100);
                synchronized (L2) {}
            }
        }, "T1-L1-then-L2");

        Thread t2 = new Thread(() -> {
            synchronized (L2) {
                sleep(100);
                synchronized (L1) {}
            }
        }, "T2-L2-then-L1");

        t1.start();
        t2.start();

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        for (int i = 0; i < 50; i++) {
            long[] ids = bean.findDeadlockedThreads();
            if (ids != null) {
                System.out.println("Deadlock detected!");
                ThreadInfo[] infos = bean.getThreadInfo(ids, true, true);
                for (ThreadInfo info : infos) System.out.println(info);
                System.exit(0);
            }
            Thread.sleep(100);
        }
        System.out.println("No deadlock detected (try running again).");
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }
}
