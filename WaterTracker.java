import java.util.Scanner;

public class WaterTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Glasses of water consumed: ");
        int glasses = sc.nextInt();

        if(glasses >= 8)
            System.out.println("Daily goal achieved!");
        else
            System.out.println("Drink more water.");

        sc.close();
    }
}