import java.util.Scanner;

public class ArithmeticEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1:");
        int n1 = sc.nextInt();
        System.out.println("Enter Number2:");
        int n2 = sc.nextInt();

        try {
            int res = n1 / n2;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.err.println("Message: " + e);
            System.err.println("You entered zero as divisor!");
        } finally {
            System.out.println("It's Finally Block");
            System.out.println("Thank You!!!");
        }
        sc.close();
    }
}
