import java.util.Arrays;
public class EvenArray{

	public static int[] evenNumber(int[] numberArray){
	int evenArray[] = new int[(numberArray.length + 1) / 2];
	int index = 0;
for(int count = 0 ; count < numberArray.length ; count++){
	 if(count % 2 ==  0){
		 evenArray[index] = numberArray[count];
index ++;
}
}
return evenArray;
}

public static void main(String... args){

int[] numb ={0,1,2,3,4,5,6,7,8,9};
int[] result = EvenArray.evenNumber(numb);
System.out.print(Arrays.toString(result));
}
}