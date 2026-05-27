import java.util.*;

public class TableBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tables = 10;

        System.out.print("Enter required tables: ");
        int req = sc.nextInt();

        if (req <= tables)
            System.out.println("Booking Confirmed");
        else
            System.out.println("Tables Not Available");

        sc.close();
    }
}