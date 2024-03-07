package bankApp;

import Diary.Entry;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    public Account RegisterCustomer(String firstName,String lastName, String pin) {
        String name = firstName + lastName;
        int accountNumber = generateAcountNumber();
        Account myaccount = new Account(name,0,pin,accountNumber);
        accounts.add(myaccount);
        return myaccount;
    }

    public int generateAcountNumber() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(10000000,100000000);
    }
    public int checkNumberOfAccounts(){
        return accounts.size();
    }

    public void deposit(int amount,int accountNumber) {
        if(FindAccount(accountNumber) == null){
            throw new AccountNotFoundException("Account Not Found");
        }
        Account myAccount = FindAccount(accountNumber);
        myAccount.Deposit(amount);
        
    }

    public Account FindAccount(int accountNumber){
        for(Account account : accounts){
            if(accountNumber == account.getNumber()) {
                return account;
            }
        }

     return null;
    }
    public int CheckBalance(String pin,int accountNumber){
        if(FindAccount(accountNumber)== null){
            throw new AccountNotFoundException("Account Not Found");
        }
        Account account = FindAccount(accountNumber);
        return account.CheckBalance(pin);
    }

    public  void withdraw(int amount, int accountNumber,String Userpin){
        if(FindAccount(accountNumber)== null){
            throw new AccountNotFoundException("Account Not Found");
        }
        Account myAccount = FindAccount(accountNumber);
        myAccount.Withdraw(amount,Userpin);
    }

    public void Transfer(int senderAccountNumber,String senderPin,int  reciverAccountNumber, int amount){
        if (FindAccount(senderAccountNumber) == null){
            throw new AccountNotFoundException("Account Not Found");
        }
        Account senderAccount = FindAccount(senderAccountNumber);
        senderAccount.Withdraw(amount,senderPin);
        if(FindAccount(reciverAccountNumber )== null){
            throw new AccountNotFoundException("Account Not Found");
        }
        Account reciverAccount = FindAccount(reciverAccountNumber);
        reciverAccount.Deposit(amount);
    }
    public void removeAccount(int accountNumber,String UserPin){
        Account DeleteAccount = FindAccount(accountNumber);
        DeleteAccount.validatePin(UserPin);
        if(!DeleteAccount.validatePin(UserPin)){
            throw new InvalidPinException("Invalid Pin");
        }
        accounts.remove(DeleteAccount);
    }

}
