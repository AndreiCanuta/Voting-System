package exceptions;

public class PasswordNotMatchingException extends Exception{
    public PasswordNotMatchingException(String message) {
        super(message);
    }

    public PasswordNotMatchingException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotMatchingException(Throwable cause) {
        super(cause);
    }

}
