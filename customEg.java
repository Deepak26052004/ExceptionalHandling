package CustomException;

public class customEg {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            dothis();
            
        } catch (GlassBroken e) {
            e.printStackTrace();
            System.out.println("****************************************************");
        }
        try {
            dothis1();
        } catch (HandleBroken e) {
            e.printStackTrace();
        }
    }
    public static void dothis() throws GlassBroken{
        throw new GlassBroken("It was Slipped in the Hand unexpectedly");
    }
    public static void dothis1(){
        throw new HandleBroken("Bike Handle Bar Broken unexpectedly");
    }
}
