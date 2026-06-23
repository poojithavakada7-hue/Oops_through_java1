import java.util.Scanner;

public class DeliveryStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter status code (1-4): ");
        int code = sc.nextInt();

        switch(code) {
            case 1: System.out.println("Order Placed"); break;
            case 2: System.out.println("Packed"); break;
            case 3: System.out.println("Out for Delivery"); break;
            case 4: System.out.println("Delivered"); break;
            default: System.out.println("Invalid Status");
        }

        sc.close();
    }
}