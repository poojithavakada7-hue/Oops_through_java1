import java.util.*;

public class DataUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data used (GB): ");
        double data = sc.nextDouble();

        if (data > 2)
            System.out.println("Daily limit exceeded");
        else
            System.out.println("Data available");

        sc.close();
    }
}