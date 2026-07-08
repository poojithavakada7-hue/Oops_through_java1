import java.util.Scanner;

public class EmergencySOSButton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Emergency SOS Button ");

        System.out.print("Press SOS Button? (Yes/No): ");
        String sos = sc.nextLine();

        if (sos.equalsIgnoreCase("Yes")) {
            System.out.println("\n Emergency Alert Sent!");
            System.out.println(" Your live location has been shared.");
            System.out.println(" Emergency contacts have been notified.");
            System.out.println(" Help is on the way.");
        } else {
            System.out.println("\n No Emergency Detected.");
            System.out.println("Stay Safe!");
        }

        sc.close();
    }
}