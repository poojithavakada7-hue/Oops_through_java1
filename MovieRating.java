import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rating (1-5): ");
        int rating = sc.nextInt();

        if(rating >= 4)
            System.out.println("Excellent Movie");
        else if(rating >= 3)
            System.out.println("Good Movie");
        else
            System.out.println("Average Movie");

        sc.close();
    }
}