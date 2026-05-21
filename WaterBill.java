import java.util.*;

public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water units used: ");
        int units = sc.nextInt();

        double bill = units * 5;

        System.out.println("Water Bill = " + bill);

        sc.close();
    }
}