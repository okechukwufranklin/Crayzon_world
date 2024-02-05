package Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositNegativeBalance_balanceRemainsUnchangedTest(){
        Account franklinAccount = new Account();
        assertEquals(0,franklinAccount.getBalance());

        franklinAccount.deposit(-50_000);
        assertEquals(0,franklinAccount.getBalance());


    }

    @Test
    public void depositPositiveAmount_balanceIncreaseTest(){
        Account franklinAccount = new Account();
        assertEquals(0,franklinAccount.getBalance());

        franklinAccount.deposit(2_000);
        assertEquals(2_000,franklinAccount.getBalance());

    }
    @Test
    public void depositPositiveAmountTwice_balanceIncreaseTest(){
        Account franklinAccount = new Account();
        assertEquals(0,franklinAccount.getBalance());

        franklinAccount.deposit(2_000);
        franklinAccount.deposit(4_000);
        assertEquals(6_000,franklinAccount.getBalance());


    }
}
