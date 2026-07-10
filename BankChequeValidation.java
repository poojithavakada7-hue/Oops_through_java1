import java.util.Scanner;

public class BankChequeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double accountBalance, chequeAmount;

        System.out.println("Bank Cheque Validation");

        System.out.print("Enter Available Account Balance (₹): ");
        accountBalance = sc.nextDouble();

        System.out.print("Enter Cheque Amount (₹): ");
        chequeAmount = sc.nextDouble();

        if (chequeAmount <= accountBalance) {
            System.out.println("\n Cheque Approved");
            System.out.println("Cheque Amount : ₹" + chequeAmount);
            System.out.println("Remaining Balance : ₹" + (accountBalance - chequeAmount));
        } else {
            System.out.println("\n Cheque Rejected");
            System.out.println("Reason: Insufficient Account Balance.");
            System.out.println("Available Balance : ₹" + accountBalance);
        }

        sc.close();
    }
}