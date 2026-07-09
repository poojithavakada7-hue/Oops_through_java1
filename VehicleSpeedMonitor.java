import java.util.Scanner;

public class VehicleSpeedMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int speedLimit = 80; 
        System.out.println(" Vehicle Speed Monitor ");

        System.out.print("Enter Vehicle Speed (km/h): ");
        int speed = sc.nextInt();

        if (speed > speedLimit) {
            System.out.println("\n Over-Speed Warning!");
            System.out.println("Current Speed : " + speed + " km/h");
            System.out.println("Speed Limit   : " + speedLimit + " km/h");
            System.out.println("Please slow down and drive safely.");
        } else {
            System.out.println("\n Speed is within the limit.");
            System.out.println("Current Speed : " + speed + " km/h");
            System.out.println("Drive Safely!");
        }

        sc.close();
    }
}