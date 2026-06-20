import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableSlots = 12;

        System.out.print("Enter Number of Vehicles: ");
        int vehicles = sc.nextInt();

        if (vehicles <= availableSlots) {
            System.out.println("Parking Available");
            System.out.println("Remaining Slots: " + (availableSlots - vehicles));
        } else {
            System.out.println("Parking Full");
            System.out.println("Extra Vehicles: " + (vehicles - availableSlots));
        }

        sc.close();
    }
}