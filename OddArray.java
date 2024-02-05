import java.util.Arrays;
public class OddArray{

	public static int[] oddNumber(int[] numberArray){
	int oddArray[] = new int[(numberArray.length) / 2];
	int index = 0;
for(int count = 0 ; count < numberArray.length ; count++){
	 if(count % 2 !=  0){
		 oddArray[index] = numberArray[count];
index ++;
}
}
return oddArray;
}

public static void main(String... args){

int[] numb ={0,1,2,3,4,5,6,7,8,9};
int[] result = OddArray.oddNumber(numb);
System.out.print(Arrays.toString(result));
}
}