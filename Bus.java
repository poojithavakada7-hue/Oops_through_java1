import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bus distance from college (km): ");
        int distance = sc.nextInt();

        if(distance <= 2)
            System.out.println("Bus Arriving Soon");
        else
            System.out.println("Bus is On Route");

        sc.close();
    }
}