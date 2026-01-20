import java.util.Scanner;

public class IllegalArgumentEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();

        try {
            if (age <= 18) {
                throw new IllegalArgumentException("Age must be greater than or equal to 18");
            }
            System.out.println("Success");
        } catch (IllegalArgumentException e) {
            System.out.println("Message: " + e.getMessage());
        } finally {
            System.out.println("Validation Completed");
        }
        sc.close();
    }
}
