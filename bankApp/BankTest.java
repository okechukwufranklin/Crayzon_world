package bankApp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank bank;
    @BeforeEach
    public void setUp() {
        bank = new Bank();
    }
@Test
 public void TestThatCostumerCanBeRegistered(){
      bank.generateAcountNumber();
      bank.RegisterCustomer("franklin", "okechkwu","1223");
      assertEquals(1,bank.checkNumberOfAccounts());
}
@Test
    public void TestThatCostumerCanDepositAndCheckBalance(){
    bank.generateAcountNumber();
    Account frankAccount = bank.RegisterCustomer("franklin","okechkwu","1223");
    assertEquals(1,bank.checkNumberOfAccounts());
    int accountNumber = frankAccount.getNumber();
    bank.deposit(1000,accountNumber);
    assertEquals(1000,bank.CheckBalance("1223",accountNumber));

}
@Test
    public void TestThatAccountCanBeFound(){
        bank.generateAcountNumber();
        bank.RegisterCustomer("franklin","okechukwu","1223");
        Account frankAccount = bank.RegisterCustomer("franklin","okechkwu","1223");
        int accountNumber = frankAccount.getNumber();
        assertEquals(frankAccount,bank.FindAccount(accountNumber));

}

@Test
    public void TestThatCustomerCanDeposit(){
    //bank.generateAcountNumber();
    Account frankAccount = bank.RegisterCustomer("franklin","okechkwu","1223");
    int accountNumber = frankAccount.getNumber();
    bank.deposit(1000,accountNumber);
    assertEquals(1000,bank.CheckBalance("1223",accountNumber));
}
@Test
    public void TestThatUserCanTransferFund(){
    Account frankAccount = bank.RegisterCustomer("franklin","okechkwu","1223");
    Account lazyAccount = bank.RegisterCustomer("lazy","okechkwu","1224");
    int accountNumber = frankAccount.getNumber();
    int SecondaccountNumber = lazyAccount.getNumber();
    bank.deposit(1000,accountNumber);
    assertEquals(1000,bank.CheckBalance("1223",accountNumber));
    bank.Transfer(accountNumber,"1223",SecondaccountNumber,500);
    assertEquals(500,bank.CheckBalance("1223",accountNumber));
    assertEquals(500,bank.CheckBalance("1224",SecondaccountNumber));

}

}
