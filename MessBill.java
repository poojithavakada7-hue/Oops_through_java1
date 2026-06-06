import java.util.Scanner;

public class MessBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter meals taken: ");
        int meals = sc.nextInt();

        int bill = meals * 60;

        System.out.println("Mess Bill = Rs." + bill);

        sc.close();
    }
}