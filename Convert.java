import java.util.Scanner;

public class Convert {
public static void main(String[] args) {

Scanner Scanner = new Scanner(System.in);

System.out.print("Enter 0 or 1 To Convert To Dollar To RMB Or Vice Versa:");
double input = Scanner.nextDouble();

System.out.print("Enter Exchange rate :");
double secondInput = Scanner.nextDouble();

System.out.print("Enter Amount :");
double thirdInput = Scanner.nextInt();

double result = secondInput * thirdInput;

if (input == 0)
 System.out.printf("thirdamount in yen is %s", result);
 
double secondResult = thirdInput / secondInput;

if (input == 1)
System.out.printf("third amount in dollar is %.2f", secondResult);

 }
}