package bankApp;
public class Account {
private String name;
private int balance;
private String  pin;
private int number;

public Account(String name,int balance,String pin,int number){
    this.name = name;
    this.balance = balance;
    this.pin = pin;
    this.number = number;
}

public int CheckBalance(String Userpin) {
    if (!this.pin.equals(Userpin))
     throw new InvalidPinException("invalid pin");
       return balance;
    }

    public  void Deposit(int amount) {
    if(amount < 0){
        throw new InvalidAmountException("Invalid Amount");
    } else
     balance+=amount;
    }

    public void Withdraw(int amount,String Userpin) {
        if (!this.pin.equals(Userpin)) {
            throw new InvalidPinException("invalid pin");
        }
        if(amount < 0){
            throw new InvalidAmountException("Invalid Amount");
        }
        if (amount > balance) {
            throw new InsufficientFundsExceptions("insufficient Fund");
        }else balance-=amount;

    }

    public int getNumber() {
        return number;
    }
    public boolean validatePin(String UserPin){
        return this.pin.equals(UserPin);
    }
}
