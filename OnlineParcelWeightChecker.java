import java.util.Scanner;

public class OnlineParcelWeightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight, charge;

        System.out.println("Online Parcel Weight Checker");
        System.out.print("Enter Parcel Weight (kg): ");
        weight = sc.nextDouble();

        if (weight <= 1) {
            charge = 50;
        } else if (weight <= 5) {
            charge = 100;
        } else if (weight <= 10) {
            charge = 200;
        } else {
            charge = 350;
        }

        System.out.println("\n Shipping Details ");
        System.out.println("Parcel Weight : " + weight + " kg");
        System.out.println("Shipping Charge : ₹" + charge);
        System.out.println("Status : Ready for Dispatch");

        sc.close();
    }
}