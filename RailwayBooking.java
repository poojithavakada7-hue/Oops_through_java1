import java.util.*;

public class RailwayBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableSeats = 5;

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= availableSeats) {
            availableSeats -= tickets;
            System.out.println("Booking Successful");
            System.out.println("Remaining Seats: " + availableSeats);
        } else {
            System.out.println("Tickets not available");
        }

        sc.close();
    }
}