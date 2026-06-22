import java.util.Scanner;

public class ExpiryChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Days left before expiry: ");
        int days = sc.nextInt();

        if(days <= 3)
            System.out.println("Consume Soon");
        else
            System.out.println("Safe to Use");

        sc.close();
    }
}