import  java.util.Scanner;
public class ReverseNumber{
public static void main(String...args){
	Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int number = input.nextInt();


int firstnumber = number % 10;
int numb = number / 10;

int secondNumber = numb % 10;
int numb2 = numb /10;

int ThirdNumber = numb2 % 10;
int numb3 = numb2 / 10;

int FourthNumber = numb3 % 10;
int numb4 = numb3 / 10;

int FifthNumber = numb4 % 10;

System.out.printf("%d%d%d%d%d",firstnumber,secondNumber,ThirdNumber,FourthNumber,FifthNumber);
}
}