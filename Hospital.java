import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Hospital Token Generator =====");

        System.out.print("Enter number of patients: ");
        int patients = sc.nextInt();

        System.out.println("\nGenerating Tokens...\n");

        for (int i = 1; i <= patients; i++) {
            System.out.println("Patient " + i + " --> Token No: H" + (100 + i));
        }

        System.out.println("\nAll tokens generated successfully.");

        sc.close();
    }
}