import java.util.Scanner;

public class MedicineReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current hour (0-23): ");
        int hour = sc.nextInt();

        if(hour == 8 || hour == 14 || hour == 20)
            System.out.println("Time to take medicine!");
        else
            System.out.println("No medicine scheduled now.");

        sc.close();
    }
}