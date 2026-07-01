import java.util.Scanner;

public class QuizTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTime = 30;
        System.out.println("Online Quiz Timer");
        System.out.println("Quiz Duration: " + totalTime + " minutes");

        System.out.print("Enter time taken by student (minutes): ");
        int timeTaken = sc.nextInt();

        if (timeTaken <= totalTime) {
            System.out.println("\n Quiz Submitted Successfully!");
            System.out.println("You completed the quiz within the time limit.");
        } else {
            System.out.println("\n Time is Over!");
            System.out.println("Quiz Auto-Submitted.");
        }

        sc.close();
    }
}