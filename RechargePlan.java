import java.util.*;

public class RechargePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter budget: ");
        int budget = sc.nextInt();

        if (budget >= 500)
            System.out.println("Unlimited calls + 2GB/day");
        else if (budget >= 300)
            System.out.println("Unlimited calls + 1GB/day");
        else
            System.out.println("Basic plan");
    }
}