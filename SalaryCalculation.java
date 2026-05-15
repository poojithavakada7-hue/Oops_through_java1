import java.util.*;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.2;
        double da = basic * 0.1;

        double total = basic + hra + da;

        System.out.println("Net Salary = " + total);

        sc.close();
    }
}