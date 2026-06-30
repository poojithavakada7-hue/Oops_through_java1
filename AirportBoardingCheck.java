import java.util.Scanner;

public class AirportBoardingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Airport Boarding Check =====");

        System.out.print("Do you have a valid ticket? (Yes/No): ");
        String ticket = sc.nextLine();

        System.out.print("Do you have a valid ID proof? (Yes/No): ");
        String id = sc.nextLine();

        if (ticket.equalsIgnoreCase("Yes") && id.equalsIgnoreCase("Yes")) {
            System.out.println("\nBoarding Approved!");
            System.out.println("Have a safe journey.");
        } else {
            System.out.println("\nBoarding Denied!");
            System.out.println("Please ensure you have both a valid ticket and ID proof.");
        }

        sc.close();
    }
}