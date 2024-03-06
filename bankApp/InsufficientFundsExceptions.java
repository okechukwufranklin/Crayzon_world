package bankApp;

public class InsufficientFundsExceptions extends RuntimeException{
    public  InsufficientFundsExceptions(String Message){
        super(Message);
    }
}
