import java.util.*;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int birth = sc.nextInt();

        int age = 2026 - birth;

        System.out.println("Your Age = " + age);

        sc.close();
    }
}