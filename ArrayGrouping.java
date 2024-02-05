import java.util.Scanner;
import java.util.Arrays;

public class  ArrayGrouping{
		public static void main(String[] args){
Scanner input = new Scanner(System.in);
int[] num = new int[5];

	for(int index = 0; index < num.length; index++){

	System.out.print("Enter number:");
	int number = input.nextInt();
	num[index] = number;
}
System.out.print(Arrays.toString(num));
	}
}