import java.util.*;

public class EmployeeAttendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter login hour (24-hour format): ");
        int hour = sc.nextInt();

        if (hour <= 9)
            System.out.println("On Time");
        else
            System.out.println("Late Login");

        sc.close();
    }
}