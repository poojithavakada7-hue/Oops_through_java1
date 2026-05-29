import java.util.*;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passengers: ");
        int passengers = sc.nextInt();

        int total = passengers * 250;

        System.out.println("Ticket Price = " + total);

        sc.close();
    }
}