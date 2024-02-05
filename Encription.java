import java.util.Scanner;

public class Encription{

	public void EncriptionNumber(String Numbers){
	int firstNumber = Integer.parseInt(String.valueOf(Numbers.charAt(0)));
	int secondNumber = Integer.parseInt(String.valueOf(Numbers.charAt(1)));
	int thirdNumber = Integer.parseInt(String.valueOf(Numbers.charAt(2)));
	int fourthNumber = Integer.parseInt(String.valueOf(Numbers.charAt(3)));

	int firstDigit = (firstNumber +7)%10;
	int secondDigit = (secondNumber +7)%10;
	int thirdDigit = (thirdNumber +7)%10;
	int fourthDigit = (fourthNumber +7)%10;
	
	System.out.print("Your Encription Number Is:" + thirdDigit + fourthDigit + firstDigit + secondDigit);
}
public static void main(String... args){
	Scanner input = new Scanner(System.in);
	Encription encription = new Encription();

	System.out.print("Enter Four Numbers:");
	String Numbers = input.next();

	encription.EncriptionNumber(Numbers);
}	
}