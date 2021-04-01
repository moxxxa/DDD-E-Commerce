package model.Exception;

public class PrixNonValideException extends Exception{
    public PrixNonValideException() {
        super();
    }

    public PrixNonValideException(String message) {
        super(message);
    }
}
