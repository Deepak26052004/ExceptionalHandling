public class NullPointerEg {
    public static void main(String[] args) {
        String s = null;

        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.err.println("Message: " + e);
            System.out.println("Nothing is present, so you can't call methods on null");  
        } finally {
            System.out.println("It's Finally Block");
            System.out.println("Thank You!!!");
        }
    }
}
