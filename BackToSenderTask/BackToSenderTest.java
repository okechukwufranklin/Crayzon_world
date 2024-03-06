package BackToSenderTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BackToSenderTest {
    private BackToSender backToSender;
    @BeforeEach
    public void setUp() {
        backToSender = new BackToSender();
    }
    @Test
    public void TestThatRiderCanCalculatePay(){
        assertEquals(45000,backToSender.CalculatePay(80));
    }
    @Test
    public void TestThatRiderCanCalculatePaySecondTest(){
        assertEquals(9000, backToSender.CalculatePay(25));
    }

    @Test
    public void TestThatRiderCanCalculatePayThirdTest(){
        assertEquals(12200, backToSender.CalculatePay(45));
    }
    @Test
    public void TestThatRiderCanCalculatePayFourthTest(){
        assertEquals(16000, backToSender.CalculatePay(55));
    }

    @Test
    public void TestThatRiderCanCalculatePayFIfthTest(){
        assertEquals(21250, backToSender.CalculatePay(65));
    }
    @Test
    public void TestThatRiderCanCalculatePaySixthTest(){
        assertEquals(42500, backToSender.CalculatePay(75));
    }
    @Test
    public void TestInputOver100(){
        assertThrows(InvalidNumberException.class,()->backToSender.CalculatePay(101));
    }

    @Test
    public void TestInputBellow1(){
        assertThrows(InvalidNumberException.class,()->backToSender.CalculatePay(-10));
    }
}
