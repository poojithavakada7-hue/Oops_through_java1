import java.util.*;

public class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketPrice = 150;

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        int total = tickets * ticketPrice;

        if (tickets >= 5)
            total -= 100;

        System.out.println("Total Amount = " + total);

        sc.close();
    }
}