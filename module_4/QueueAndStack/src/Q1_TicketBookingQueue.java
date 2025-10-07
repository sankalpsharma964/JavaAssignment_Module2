import java.util.*;

public class Q1_TicketBookingQueue {
    static class BookingSystem {
        private final Queue<String> queue = new LinkedList<>();

        void arrive(String customer) {
            queue.offer(customer);
            System.out.println(customer + " joined. Queue: " + queue);
        }

        void nextBooking() {
            String served = queue.poll();
            if (served == null) System.out.println("No customers waiting.");
            else System.out.println("Booked ticket for: " + served + ". Queue: " + queue);
        }

        void peekNext() {
            String next = queue.peek();
            System.out.println("Next to be served: " + (next == null ? "none" : next));
        }

        void cancel(String customer) {
            boolean removed = queue.remove(customer);
            System.out.println((removed ? "Canceled " + customer : customer + " not in queue") + ". Queue: " + queue);
        }
    }

    public static void main(String[] args) {
        BookingSystem sys = new BookingSystem();
        sys.arrive("Alice");
        sys.arrive("Bob");
        sys.arrive("Charlie");
        sys.peekNext();
        sys.nextBooking();
        sys.arrive("Diana");
        sys.cancel("Bob");
        sys.peekNext();
        sys.nextBooking();
        sys.nextBooking();
        sys.nextBooking();
    }
}
