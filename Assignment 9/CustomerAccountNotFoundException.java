package RanasiaC;

public class CustomerAccountNotFoundException extends Exception{
    public CustomerAccountNotFoundException(){}
    public CustomerAccountNotFoundException(String message){
        super(message);
    }
}
