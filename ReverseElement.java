import java.util.Arrays;

public class ReverseElement{

	public static int[] ReverseElementInArrays(int[] digitsarray) {

int[] reverse = new int[digitsarray.length];
int digitsPostion  = digitsarray.length -1;
int reversePosition = 0;
for(int count = 0; count < digitsarray.length -1;count++){
reverse[reversePosition] = digitsarray[digitsPostion];
reversePosition ++;
digitsPostion ++;
}
return reverse; 
}
}