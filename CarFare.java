import java.util.*;

public class CarFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        int km = sc.nextInt();

        int fare = 50 + (km * 12);

        System.out.println("Total Fare = " + fare);

        sc.close();
    }
}