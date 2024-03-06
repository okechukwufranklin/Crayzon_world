package BackToSenderTask;

public class BackToSender {
    public  int CalculatePay(int UserInput) {
        if(UserInput > 100){
            throw new InvalidNumberException("Invalid Number");
        }if (UserInput < 1){
         throw  new InvalidNumberException("invalid Number");
        }else if(UserInput < 50){
            return UserInput * 160 + 5000;
        } else if (UserInput <= 59) {
            return UserInput * 200 + 5000;
        }else if (UserInput <= 69) {
            return UserInput * 250 + 5000;
        }else {
            return UserInput * 500 + 5000;
        }
    }
}

