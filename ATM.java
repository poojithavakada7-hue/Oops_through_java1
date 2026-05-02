import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000,
	choice;

        do {
            System.out.println("\n1.Deposit 2.Withdraw 3.Check Balance 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    balance += sc.nextInt();
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    int amt = sc.nextInt();
                    if (amt <= balance)
                        balance -= amt;
                    else
                        System.out.println("Insufficient balance");
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    break;
            }
        } while (choice != 4);
    }
}