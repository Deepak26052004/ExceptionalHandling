class Parent { }
class Child extends Parent { }

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();

        if (p instanceof Child) {
            Child c = (Child) p;
            System.out.println("Cast successful!");
        } else {
            System.out.println("Cannot cast Parent object to Child");
        }
    }
}
