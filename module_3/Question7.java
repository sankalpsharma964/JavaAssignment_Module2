class TicketBookingSystem {
    private int availableTickets = 10;

    public synchronized void bookTicket(String userName, int numberOfTickets) {
        System.out.println(userName + " is trying to book " + numberOfTickets + " tickets.");
        if (availableTickets >= numberOfTickets) {
            System.out.println(userName + " booked " + numberOfTickets + " tickets.");
            availableTickets -= numberOfTickets;
            System.out.println("Available tickets: " + availableTickets);
        } else {
            System.out.println(userName + ": Sorry, not enough tickets available.");
        }
    }
}

class UserThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private String userName;
    private int numberOfTickets;

    public UserThread(TicketBookingSystem bookingSystem, String userName, int numberOfTickets) {
        this.bookingSystem = bookingSystem;
        this.userName = userName;
        this.numberOfTickets = numberOfTickets;
    }

    public void run() {
        bookingSystem.bookTicket(userName, numberOfTickets);
    }
}

public class Question7 {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();

        UserThread user1 = new UserThread(bookingSystem, "User 1", 5);
        UserThread user2 = new UserThread(bookingSystem, "User 2", 4);
        UserThread user3 = new UserThread(bookingSystem, "User 3", 3);

        user1.start();
        user2.start();
        user3.start();
    }
}
