import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter litres consumed: ");
        double litres = sc.nextDouble();

        double cost = litres * 108;

        System.out.println("Fuel Cost = Rs." + cost);

        sc.close();
    }
}