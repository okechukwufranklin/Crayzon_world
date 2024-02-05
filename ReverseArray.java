import java.util.Arrays;
public class ReverseArray{

	public int[] reverseList(int[] numbers){

	int[] newArray = new int[numbers.length];
	int count = 0;
	
	for(int value = numbers.length- 1; value >=  0; value -= 1){
		newArray[count] = numbers[value];
	count += 1;
}
return newArray;
}

public static void main(String... args){
		ReverseArray reverseArray = new ReverseArray();

	int[] numb = {1,2,3,4,5,6,7};
	int[] result = reverseArray.reverseList(numb);
	System.out.print(Arrays.toString(result));
}
}