import java.util.Scanner;
public class TrueFalse {
 public static void main(String[] args) {

Scanner rin = new Scanner(System.in);

System.out.println("Enter 1 or 0:");
boolean input = rin.nextBoolean();

if (input == 1)
System.out.print("True");

if (input == 0)
System.out.print("False");


 }
}