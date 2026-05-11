import java.util.*;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pizza = 200;
        int burger = 120;

        System.out.print("Enter number of pizzas: ");
        int p = sc.nextInt();

        System.out.print("Enter number of burgers: ");
        int b = sc.nextInt();

        int total = (p * pizza) + (b * burger);

        System.out.println("Total Bill = " + total);

        sc.close();
    }
}