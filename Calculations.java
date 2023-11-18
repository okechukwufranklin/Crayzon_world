import java.util.Scanner;

public class Calculations {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter First Number:");
int FirstNumber = scanner.nextInt();

System.out.print("Enter Second Number:");
int SecondNumber = scanner.nextInt();

System.out.print("Enter Third Number:");
int ThirdNumber = scanner.nextInt();

int result = FirstNumber + SecondNumber + ThirdNumber;
System.out.printf("Sum of All Number Is : %s%n",result);

int result2 = FirstNumber / SecondNumber / ThirdNumber;
System.out.printf("Average Of All Number Is : %s%n",result2);

int result3 = FirstNumber * SecondNumber * ThirdNumber;
System.out.printf("Product Of All Numbers is : %s%n",result3);

if (FirstNumber > SecondNumber && FirstNumber > ThirdNumber)
System.out.printf("The Largest Number Is: %s%n",FirstNumber);


if (SecondNumber > FirstNumber && SecondNumber > ThirdNumber)
System.out.printf("The Largest Number Is : %s%n",SecondNumber);


if (ThirdNumber > FirstNumber && ThirdNumber> SecondNumber)
System.out.printf("The Largest Number Is : %s%n",ThirdNumber);


if (FirstNumber < SecondNumber && FirstNumber < ThirdNumber)
System.out.printf("The Smallest Number Is : %s%n",FirstNumber);


if (SecondNumber < FirstNumber && SecondNumber < ThirdNumber)
System.out.printf("The Smallest Number Is : %s%n",SecondNumber); 


if (ThirdNumber < FirstNumber && ThirdNumber < SecondNumber)
System.out.printf("The Smallest Number Is : %s%n",ThirdNumber);
  
 }
}

