package exceptions;

public class UsernameUnavailableException extends Exception{
    public UsernameUnavailableException (String message) {
        super(message);
    }

    public UsernameUnavailableException (String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameUnavailableException (Throwable cause) {
        super(cause);
    }

}
