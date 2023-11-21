import java.util.Scanner;
public class Split{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("enter five digit number");
int number = input.nextInt();

int firstDigit = number / 10000;
int secondDigit =(number % 10000)/1000;
int thirdDigit = (number % 1000)/100;
int fourthDigit = (number %100)/10;
int fifthDigit = (number %10);

System.out.printf("%d,   %d,   %d,   %d,   %d",firstDigit,secondDigit,thirdDigit,fourthDigit,fifthDigit);
 }
}