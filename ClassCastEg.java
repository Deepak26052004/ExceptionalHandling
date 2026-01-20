class Parent {}
class Child extends Parent {}

public class ClassCastEg {
    public static void main(String[] args) {
        try {
            Parent p = new Parent();
            Child c = (Child) p;
        } catch (ClassCastException e) {
            System.out.println("Message: " + e.getMessage());
        } finally {
            System.out.println("It's ClassCast Exception");
        }
    }
}
