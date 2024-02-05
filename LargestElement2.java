import java.util.Arrays;
public class LargestElement2{

	public int[] largestList(int[] number){
	
	int[] newArray = new int[number.length];
	int count = 0;

	for(int value = 0; value < number.length; value ++){
	newArray[count] = number[value];
count += 1;
}
return newArray;
}
public static void main(String...args){

	LargestElement2 largestElement = new LargestElement2();

	int[] numb = {1,2,3,4,5};
	int[] result = largestElement.largestList(numb);
	System.out.print(Arrays.toString(result));
}
} 