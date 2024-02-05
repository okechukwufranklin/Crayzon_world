import java.util.Arrays;
public class RunningTotalArray{

	public static int[] runningNumber(int[] numberArray){
int runningArray[] = new int[numberArray.length];

 int total = 0;

for(int count = 0 ; count < numberArray.length ; count++){
 total += numberArray[count];
runningArray[count] = total;
}
return runningArray;
}

public static void main(String... args){

int[] numb = {1,2,3,4,5,6};
int[] result= RunningTotalArray.runningNumber(numb);
System.out.print(Arrays.toString(result));
}
}
