import java.util.Scanner;

public class operators {
    public static void main(String [] args) {
        Scanner brian = new Scanner(System.in);
        int men, women, total;
        // int brings a whole number

        System.out.println("Enter number of men: ");
        men= brian.nextInt();
        System.out.println("Enter number of women: ");
        women= brian.nextInt();
        total=men/women;
        System.out.println(total);
    }
}
