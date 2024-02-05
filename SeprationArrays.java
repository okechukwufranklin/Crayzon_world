import java.util.Arrays;
//mport java.lang.Integer;

public class SeprationArrays{

	public static int[] seprationNumber(String number){
	int[] seprationArray= new int[number.length()];
	int numberInteger = Integer.parseInt(number);
	int index	= (number.length() -1);
for(int count = 0 ; count < number.length(); count++){
 seprationArray[index] = numberInteger / 10;
index --;
}

return seprationArray;
}


public static void main(String... args){

String numb = "23456789";
int[] result =  SeprationArrays.seprationNumber(numb);
System.out.print(Arrays.toString(result));
}
}
