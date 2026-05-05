import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total amount: ");
        double amount = sc.nextDouble();

        double discount = 0;

        if (amount > 5000)
            discount = amount * 0.2;
        else if (amount > 2000)
            discount = amount * 0.1;

        double finalAmount = amount - discount;

        System.out.println("Final Amount = " + finalAmount);
    }
}