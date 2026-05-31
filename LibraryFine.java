import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter delayed days: ");
        int days = sc.nextInt();

        int fine = days * 5;

        System.out.println("Library Fine = Rs." + fine);

        sc.close();
    }
}