public class Propagation_UnChecked_Exception {
    public static void main(String[] args) {
        System.out.println("Start");
        m1();
        System.out.println("End");
    }
    public static void m1(){
        System.out.println("M1 Starts");
        try{
            m2();
        }
        catch(Exception e){
            System.out.println("Exception Handled in M1 method");
        }
        System.out.println("M1 Ends");
    }
    public static void m2(){
        System.out.println("M2 Starts");
        m3();
        System.out.println("M2 Ends");
    }
    public static void m3(){
        System.out.println("M3 Starts");
        throw new ArithmeticException();
    }
}
