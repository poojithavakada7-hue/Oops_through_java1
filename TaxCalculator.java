import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();

        if(salary > 500000)
            System.out.println("Tax Applicable");
        else
            System.out.println("No Tax");

        sc.close();
    }
}