public class AIOBsEg {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 6};

        try {
            System.out.println(a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Message: " + e);
            System.out.println("You are trying to access index out of range");
        } finally {
            System.out.println("It's Finally Block");
            System.out.println("Thank You!!!");
        }
    }
}
