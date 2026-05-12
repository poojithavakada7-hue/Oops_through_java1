import java.util.*;

public class Attendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total classes: ");
 	int total = sc.nextInt();

        System.out.print("Classes attended: ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / total;

        System.out.println("Attendance Percentage = " + percentage);

        if (percentage >= 75)
            System.out.println("Eligible for Exams");
        else
            System.out.println("Not Eligible");

        sc.close();
    }
}