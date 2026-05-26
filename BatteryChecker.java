import java.util.*;

public class BatteryChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        if (battery < 20)
            System.out.println("Low Battery");
        else
            System.out.println("Battery OK");

        sc.close();
    }
}