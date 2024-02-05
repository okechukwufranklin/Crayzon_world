import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListDigtArrayTest{

	@Test
	public void testgetDigitList(){
		ListDigtArray ListDigtArray = new ListDigtArray();

		int numb = 541;
		int[] returnArray ListDigtArray = ListDigtArray.getDigitList(numb);
		int[] expexted = {5,4,1};
		
		assertArrayEquals(expected, returnedArray);
}

}