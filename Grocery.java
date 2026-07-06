import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Grocery Expiry Alert");

        System.out.print("Enter Manufacturing Day (1-31): ");
        int mfgDay = sc.nextInt();

        System.out.print("Enter Expiry Day (1-31): ");
        int expiryDay = sc.nextInt();

        System.out.print("Enter Today's Day (1-31): ");
        int today = sc.nextInt();

        if (today > expiryDay) {
            System.out.println("\n Product Expired!");
            System.out.println("Do not consume this product.");
        } else {
            System.out.println("\n Product is Safe to Use.");
            System.out.println("Days Remaining: " + (expiryDay - today));
        }

        sc.close();
    }
}