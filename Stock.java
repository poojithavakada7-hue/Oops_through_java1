import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stock = 15;

        System.out.print("Enter quantity required: ");
        int qty = sc.nextInt();

        if(qty <= stock)
            System.out.println("Product Available");
        else
            System.out.println("Out of Stock");

        sc.close();
    }
}