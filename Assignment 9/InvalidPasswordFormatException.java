package RanasiaC;

public class InvalidPasswordFormatException extends Exception {
    public InvalidPasswordFormatException(){}
    public InvalidPasswordFormatException(String message){
        super(message);
    }
}
