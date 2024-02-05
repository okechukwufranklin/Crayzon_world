import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Asserrtion.*;
public class ReverseArraysTest{

@Test
public void testReverseArray(){
	reverseArray reverseArray = new reverseArray();
	int[] numb = {1,2,3,4,5};
	int[] reversednumber = reverseArray.reverseList(array);
	int[] expected = {5,4,3,2,1};

	assertArratEquals(expected, reversedNumbers);
	}
}