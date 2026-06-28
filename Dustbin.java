import java.util.Scanner;

public class Dustbin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Smart Dustbin Monitoring System =====");

        System.out.print("Enter dustbin fill level (0-100%): ");
        int fillLevel = sc.nextInt();

        if (fillLevel < 0 || fillLevel > 100) {
            System.out.println("Invalid input! Please enter a value between 0 and 100.");
        } else if (fillLevel >= 80) {
            System.out.println("Dustbin is " + fillLevel + "% full.");
            System.out.println("Cleaning Alert! Dustbin needs to be emptied.");
        } else if (fillLevel >= 50) {
            System.out.println("Dustbin is " + fillLevel + "% full.");
            System.out.println("Dustbin is filling up. Monitor regularly.");
        } else {
            System.out.println("Dustbin is " + fillLevel + "% full.");
            System.out.println("Dustbin status is normal.");
        }

        sc.close();
    }
}