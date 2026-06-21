import java.util.Scanner;

public class ScreenTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hours spent on phone: ");
        int hours = sc.nextInt();

        if(hours > 5)
            System.out.println("Reduce Screen Time");
        else
            System.out.println("Healthy Usage");

        sc.close();
    }
}