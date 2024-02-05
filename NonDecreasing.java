import java.util.Scanner;

public class NonDecreasing {
 public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter First Number :");
int firstNumber = input.nextInt();

System.out.print("Enter Second Number :");
int secNumber = input.nextInt();

System.out.print("Enter Third Number :");
int thirdNumber = input.nextInt();

if ((thirdNumber < secNumber) && (thirdNumber < firstNumber)) {
if (secNumber < firstNumber)
System.out.printf("Order In Non Decreasing Is %d,%d,%d", thirdNumber, secNumber, firstNumber);
   }

if ((secNumber < firstNumber) && (secNumber < thirdNumber)) {
if (firstNumber < thirdNumber)
System.out.printf("Order In Non Decreasing Is %d,%d,%d", secNumber, firstNumber, thirdNumber);
   }

if ((firstNumber < secNumber) && ( firstNumber < thirdNumber)) {
if (thirdNumber < secNumber)
System.out.printf("Order In Non Decreasing Is %d,%d,%d", firstNumber, thirdNumber, secNumber);
   }  

if ((firstNumber <secNumber) && ( firstNumber < thirdNumber)) {
if (secNumber < thirdNumber)
System.out.printf("Order In Non Decreasing Is %d,%d,%d", firstNumber, secNumber, thirdNumber);
}

if ((secNumber < firstNumber) && (secNumber < thirdNumber)) {
if (thirdNumber < firstNumber)
System.out.printf("Order In Non Decreasing Is %d,%d,%d", secNumber, thirdNumber, firstNumber);
}

if ((thirdNumber < firstNumber) && (thirdNumber < secNumber)) {
if (firstNumber < secNumber)
System.out.printf("Order In Non Decreasing Is %d,%d,%d", thirdNumber, firstNumber, secNumber); 
}

 }
}
