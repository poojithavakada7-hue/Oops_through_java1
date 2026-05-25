import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        double usd = inr / 83;

        System.out.println("Amount in USD = " + usd);

        sc.close();
    }
}