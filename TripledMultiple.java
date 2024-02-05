import java.util.Scanner;
public class TripledMultiple{
 public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter First Number:");
int numb1 = input.nextInt();

System.out.print("Enter Second Number:");
int numb2 = input.nextInt();

int result = numb1 * numb1  * numb1;

int result2 = numb2 * numb2;

if (result % result2 == 0)
System.out.print("First Number Trippled is A Multiple Of Second Number Doubled");

if (result % result2 != 0)
System.out.print("First Number Trippled NOT A Multiple Of Second Number Doubled");
 }
}