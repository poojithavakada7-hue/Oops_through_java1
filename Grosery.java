import java.util.*;

public class Grosery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rice quantity (kg): ");
        int rice = sc.nextInt();

        System.out.print("Oil quantity (liters): ");
        int oil = sc.nextInt();

        int total = (rice * 60) + (oil * 150);

        System.out.println("Total Grocery Bill = " + total);

        sc.close();
    }
}