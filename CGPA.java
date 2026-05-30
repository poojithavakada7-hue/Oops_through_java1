import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double total = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter GPA of Subject " + i + ": ");
            total += sc.nextDouble();
        }

        double cgpa = total / n;

        System.out.println("CGPA = " + cgpa);

        sc.close();
    }
}