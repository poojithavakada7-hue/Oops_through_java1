import java.util.Scanner;

public class PasswordAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PASSWORD ANALYZER");

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        // Analyze password
        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch))
                upper = true;

            else if (Character.isLowerCase(ch))
                lower = true;

            else if (Character.isDigit(ch))
                digit = true;

            else
                special = true;
        }

        // Calculate score
        if (password.length() >= 8)
            score += 2;

        if (password.length() >= 12)
            score += 2;

        if (upper)
            score += 1;

        if (lower)
            score += 1;

        if (digit)
            score += 1;

        if (special)
            score += 2;

        System.out.println("\nAnalyzing password...");

        try {
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(700);
            System.out.println(".");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n RESULT ");

        System.out.println("Length       : " + password.length());
        System.out.println("Uppercase    : " + check(upper));
        System.out.println("Lowercase    : " + check(lower));
        System.out.println("Number       : " + check(digit));
        System.out.println("Special Char : " + check(special));

        System.out.println("\nStrength Score: " + score + "/9");

        if (score <= 3) {

            System.out.println("Strength:  WEAK");

        } else if (score <= 6) {

            System.out.println("Strength:  MEDIUM");

        } else {

            System.out.println("Strength:  STRONG");
        }

        
        sc.close();
    }

    static String check(boolean value) {

        return value ? " Yes" : " No";
    }
}