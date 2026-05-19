import java.util.*;

public class ExamResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter mark " + i + ": ");
            total += sc.nextInt();
        }

        double average = total / 5.0;

        System.out.println("Average = " + average);

        if (average >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        sc.close();
    }
}