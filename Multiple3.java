import java.util.Scanner;
 public class Multiple3 {
 public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter Number:");
int numb = input.nextInt();

if (numb % 3 == 0)
System.out.print("is a multiple of 3");

if (numb % 3 != 0)
System.out.print("is not a multiple of 3");
 }
}
