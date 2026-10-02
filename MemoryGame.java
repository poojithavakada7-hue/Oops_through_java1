import java.util.*;

public class MemoryGame {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("MEMORY CHALLENGE");
        System.out.print("Enter sequence length: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("\nMemorize these numbers!");

        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(90) + 10;
            System.out.print(numbers[i] + " ");
        }

        Thread.sleep(3000);

        for (int i = 0; i < 30; i++)
            System.out.println();

        System.out.println("Now enter the numbers in the same order:");

        int score = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Number " + (i + 1) + ": ");
            int answer = sc.nextInt();

            if (answer == numbers[i]) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong! Correct number: " + numbers[i]);
            }
        }

        System.out.println(" RESULT");


        System.out.println("Score: " + score + "/" + n);

        if (score == n)
            System.out.println("Perfect Memory!");
        else if (score >= n / 2)
            System.out.println(" Good Memory!");
        else
            System.out.println(" Try Again!");

        sc.close();
    }
}