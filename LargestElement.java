import java.util.Arrays;
public class LargestElement{

public static int largestElement(int[] numberArray) {

	int largestElement = numberArray[0];

	for(int count = 0; count < numberArray.length; count++) {
		if(numberArray[count] > largestElement) {
			largestElement = numberArray[count];
	
	}
}
return largestElement;
}


public static void main(String...args){

	LargestElement largestelement = new LargestElement();

	int[] numb = {1,2,3,4,5};
	int result = LargestElement.largestElement(numb);
	System.out.print(result);





	}
}