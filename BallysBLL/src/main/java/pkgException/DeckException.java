package pkgException;

public class DeckException extends RuntimeException {

    public DeckException(){
        super();
    }

    public DeckException(String message){
        super(message);
    }
}
