package bankApp;

public class InvalidAmountException extends RuntimeException{
    public  InvalidAmountException(String Message){
        super(Message);
    }
}
