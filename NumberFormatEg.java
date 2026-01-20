public class NumberFormatEg {
    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt("Deepak"));
        } catch (NumberFormatException e) {
            System.out.println("Message: " + e);
        } finally {
            System.out.println("It is Number Format Exception Program");
        }
    }
}
