public class SIOBsEg {
    public static void main(String[] args) {
        String s = "Deepak";

        try {
            System.out.println(s.charAt(8));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Message: " + e);
        } finally {
            System.out.println("Thank You");
        }
    }
}
