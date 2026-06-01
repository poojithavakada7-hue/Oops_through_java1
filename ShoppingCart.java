import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item price: ");
        int price = sc.nextInt();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        int total = price * qty;

        System.out.println("Total Amount = " + total);

        sc.close();
    }
}