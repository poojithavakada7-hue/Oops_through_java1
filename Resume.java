import java.util.Scanner;

public class Resume{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        if(cgpa >= 7.5)
            System.out.println("Eligible for Interview");
        else
            System.out.println("Not Eligible");

        sc.close();
    }
}