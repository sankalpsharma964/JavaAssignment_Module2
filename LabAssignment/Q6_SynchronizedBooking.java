public class Q6_SynchronizedBooking {
    public static void main(String[] args) throws InterruptedException {
        Seat seat = new Seat(1);

        Runnable task1 = () -> System.out.println("User A -> " + (seat.book("User A") ? "Booked" : "Failed"));
        Runnable task2 = () -> System.out.println("User B -> " + (seat.book("User B") ? "Booked" : "Failed"));

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final status: " + seat.status());
    }
}

class Seat {
    private int available;
    private String bookedBy;

    public Seat(int available) {
        this.available = available;
    }

    public synchronized boolean book(String user) {
        if (available > 0) {
            try { Thread.sleep(50); } catch (InterruptedException ignored) {}
            available--;
            bookedBy = user;
            return true;
        }
        return false;
    }

    public String status() {
        return available == 0 ? "Booked by " + bookedBy : "Available";
    }
}
