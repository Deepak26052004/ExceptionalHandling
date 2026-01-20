package CustomException;

public class GlassBroken extends Throwable{// checked Exception
    public GlassBroken(String reason){
        super(reason);
    }
}
class HandleBroken extends RuntimeException{//Unchecked Exception
    public HandleBroken(String reason){
        super(reason);
    }
}