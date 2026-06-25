import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight: ");
        int weight = sc.nextInt();

        if(age >= 18 && weight >= 50)
            System.out.println("Eligible to Donate Blood");
        else
            System.out.println("Not Eligible");

        sc.close();
    }
}