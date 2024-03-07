package bankApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class AccountTest {
    private Account account;
@BeforeEach
public void setUp() {
     account = new Account("franklin",0,"1234",1234567);
    }
@Test
public void TestThatBalanceCanBeChecked(){
        assertEquals(0,account.CheckBalance("1234"));
}
@Test
public void TestThatDepositWorks(){
    assertEquals(0,account.CheckBalance("1234"));
    account.Deposit(1500);
    assertEquals(1500,account.CheckBalance("1234"));
}
@Test
public void TestDepositTwice(){
    assertEquals(0,account.CheckBalance("1234"));
    account.Deposit(1500);
    account.Deposit(1000);
    assertEquals(2500,account.CheckBalance("1234"));
}
@Test
public void TestDepositNegativeNumber(){
    assertEquals(0,account.CheckBalance("1234"));
    assertThrows(InvalidAmountException.class,()->account.Deposit(-1500));
}
@Test
 public void TestCheckBalanceWithIncorrectPin(){
   String pin ="1234";
   assertThrows(InvalidPinException.class,()->account.CheckBalance("2343"));
}
@Test
public void TestWithdrawWorks(){
    assertEquals(0,account.CheckBalance("1234"));
    account.Deposit(1500);
    account.Withdraw(1000,"1234");
    assertEquals(500,account.CheckBalance("1234"));
}

@Test
    public void TestDepositTwiceWithdrawOncesWorks(){
        assertEquals(0,account.CheckBalance("1234"));
        account.Deposit(1500);
        account.Deposit(1000);
        account.Withdraw(1000,"1234");
        assertEquals(1500,account.CheckBalance("1234"));
    }
@Test
    public void TestDepositTwiceWithdrawTwiceWorks(){
        assertEquals(0,account.CheckBalance("1234"));
        account.Deposit(1500);
        account.Deposit(1000);
        account.Withdraw(1000,"1234");
        account.Withdraw(1000,"1234");
        assertEquals(500,account.CheckBalance("1234"));
    }
@Test
public void TestWithdrawNegativeNumber(){
        assertEquals(0,account.CheckBalance("1234"));
        assertThrows(InvalidAmountException.class,()->account.Withdraw(-1500,"1234"));
    }

@Test
public void TestWithdrawMoreThanBalance(){
    assertEquals(0,account.CheckBalance("1234"));
    account.Deposit(5000);
    assertThrows(InsufficientFundsExceptions.class,()->account.Withdraw(20000,"1234"));
}

}
