import java.util.Scanner;

public class OTP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int otp = 1234;

        System.out.print("Enter OTP: ");
        int userOtp = sc.nextInt();

        if(userOtp == otp)
            System.out.println("Verification Successful");
        else
            System.out.println("Invalid OTP");

        sc.close();
    }
}