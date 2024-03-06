package bankApp;

public class AccountNotFoundException extends RuntimeException{
    public  AccountNotFoundException(String Message){
        super(Message);
    }

}
