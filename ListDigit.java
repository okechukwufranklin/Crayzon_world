import java.util.Arrays;
public class ListDigit{
		public static void main(String[] args){
	int num = 12345;
	int[] newArray = getDigitList(num);

	System.out.println(Arrays.toString(newArray));
}

public static int[]  getDigitList(int number){
String numstr = number + "";
int length = numstr.length();

int[] array = new int[length];

for(int index = array.length - 1; index >= 0;index --){
	array[index] = number % 10;
	number = number / 10;
}
return array;
}
}	