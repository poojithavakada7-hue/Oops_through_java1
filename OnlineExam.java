import java.util.Scanner;

public class OnlineExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = sc.nextInt();

        if(score >= 40)
            System.out.println("Passed");
        else
            System.out.println("Failed");

        sc.close();
    }
}