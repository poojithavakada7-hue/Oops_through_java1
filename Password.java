import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if(password.length() >= 8)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");

        sc.close();
    }
}