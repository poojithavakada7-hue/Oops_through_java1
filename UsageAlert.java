import java.util.Scanner;

public class UsageAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if(units > 300)
            System.out.println("High Electricity Usage");
        else
            System.out.println("Normal Usage");

        sc.close();
    }
}