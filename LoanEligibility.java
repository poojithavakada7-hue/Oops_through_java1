import java.util.*;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        int salary = sc.nextInt();

        if (salary >= 25000)
            System.out.println("Eligible for Loan");
        else
            System.out.println("Not Eligible");

        sc.close();
    }
}