import java.util.Scanner;

public class SmartWaterTankMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int waterLevel;

        System.out.println("===== Smart Water Tank Monitor =====");

        System.out.print("Enter Water Level (0 - 100%): ");
        waterLevel = sc.nextInt();

        if (waterLevel < 0 || waterLevel > 100) {
            System.out.println("\n Invalid Water Level!");
            System.out.println("Please enter a value between 0 and 100.");
        }
        else if (waterLevel <= 20) {
            System.out.println("\n Water Level: " + waterLevel + "%");
            System.out.println(" Alert: Water level is very low.");
            System.out.println(" Please start the water pump.");
        }
        else if (waterLevel <= 70) {
            System.out.println("\n Water Level: " + waterLevel + "%");
            System.out.println(" Water level is normal.");
        }
        else {
            System.out.println("\n Water Level: " + waterLevel + "%");
            System.out.println(" Tank is almost full.");
            System.out.println(" Please turn OFF the water pump.");
        }

        sc.close();
    }
}