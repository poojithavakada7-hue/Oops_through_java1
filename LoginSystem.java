import java.util.*;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "Pooji";
        String password = "100107";

        System.out.print("Enter username: ");
        String u = sc.next();

        System.out.print("Enter password: ");
        String p = sc.next();

        if (u.equals(username) && p.equals(password))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Credentials");
    }
}