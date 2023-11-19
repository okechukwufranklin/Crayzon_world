import java.util.Random;
import java.util.Scanner;
public class RandomNumber{
 public static void main(String[] args){

Random input = new Random();
Scanner scanner = new Scanner(System.in);

System.out.print("Enter Ether 0 OR 1 :");
int random = input.nextInt(2);
int numb = scanner.nextInt();

if ((numb == 0) && (random == 1))
System.out.print("Incorrect");

if (numb == random) 
System.out.print("Correct");

if ((numb == 1) && (random == 0))
System.out.print("incorrect");
 }
}
