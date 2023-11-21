import java.util.Scanner;
public class LargeSmall {
 public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first Integer:");
int FirstNumber = input.nextInt();

System.out.print("Enter second Integer:");
int SecondNumber = input.nextInt();

System.out.print("Enter Third Integer:");
int ThirdNumber = input.nextInt();

System.out.print("Enter Fourth Number:");
int FourthNumber = input.nextInt();

System.out.print("Enter fifth Number:");
int FifthNumber = input.nextInt();



if (FirstNumber > SecondNumber && FirstNumber > ThirdNumber) {
if (FirstNumber > FourthNumber && FirstNumber > FifthNumber)
System.out.printf("The Largest Number Is: %s%n",FirstNumber);
}

if (SecondNumber > FirstNumber && SecondNumber > ThirdNumber){
if (SecondNumber > FourthNumber && SecondNumber > FifthNumber)
System.out.printf("The Largest Number Is : %s%n",SecondNumber);
}
if (ThirdNumber > FirstNumber && ThirdNumber> SecondNumber){
if (ThirdNumber > FourthNumber && FifthNumber > FifthNumber)
System.out.printf("The Largest Number Is : %s%n",ThirdNumber);
}
if (FourthNumber > FirstNumber && FourthNumber > SecondNumber){
if (FourthNumber > ThirdNumber && FourthNumber > FifthNumber)
System.out.printf("The Largest Number if : %s%n",FourthNumber);
}
if (FifthNumber > FirstNumber && FifthNumber > SecondNumber){
if (FifthNumber > ThirdNumber && FifthNumber > FourthNumber)
System.out.printf("The Largest Number IS : %s%n",FifthNumber);
}



if (FirstNumber < SecondNumber && FirstNumber < ThirdNumber){
if (FirstNumber < FourthNumber &&  FirstNumber < FifthNumber)
System.out.printf("The Smallest Number Is : %s%n",FirstNumber);
}

if (SecondNumber < FirstNumber && SecondNumber < ThirdNumber){
if (SecondNumber < FourthNumber && SecondNumber < FifthNumber)
System.out.printf("The Smallest Number Is : %s%n",SecondNumber);
} 

if (ThirdNumber < FirstNumber && ThirdNumber < SecondNumber){
if (ThirdNumber < FourthNumber && ThirdNumber < FifthNumber)
System.out.printf("The Smallest Number Is : %s%n",ThirdNumber);
}
if (FourthNumber < FirstNumber && FourthNumber < SecondNumber){
if (FourthNumber < ThirdNumber && FourthNumber < FifthNumber)
System.out.printf("The Smallest Number is %s%n", FourthNumber);
}
if (FifthNumber < FirstNumber && FifthNumber < SecondNumber){
if (FifthNumber < ThirdNumber && FifthNumber < FourthNumber)
System.out.printf("The Smallest Number Is %s%n",FifthNumber);
  }  
 }
}