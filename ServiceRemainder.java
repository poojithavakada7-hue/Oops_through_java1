import java.util.Scanner;

public class ServiceRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kilometers travelled: ");
        int km = sc.nextInt();

        if(km >= 5000)
            System.out.println("Vehicle Service Due");
        else
            System.out.println("No Service Required");

        sc.close();
    }
}