import java.util.*;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        int fee = hours * 20;

        System.out.println("Parking Fee = " + fee);

        sc.close();
    }
}