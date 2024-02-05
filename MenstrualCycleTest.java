import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MenstrualCycleTest {


    @org.junit.jupiter.api.Test
    void addDaysToDateEntered() {
        MenstrualCycle menstrualCycle = new MenstrualCycle();
        String actualOuput= MenstrualCycle.addDaysToDateEntered("01-23-2024",28);
        assertEquals("02-20-2024",actualOuput);
    }

}