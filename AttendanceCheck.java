import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int validId = 101;

        System.out.print("Scan Student ID: ");
        int id = sc.nextInt();

        if(id == validId)
            System.out.println("Attendance Marked");
        else
            System.out.println("Invalid ID");

        sc.close();
    }
}