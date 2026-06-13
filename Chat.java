import java.util.Scanner;

public class Chat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Say Hi: ");
        String msg = sc.nextLine();

        if(msg.equalsIgnoreCase("Hi"))
            System.out.println("Hello! How can I help you?");
        else
            System.out.println("I don't understand.");

        sc.close();
    }
}