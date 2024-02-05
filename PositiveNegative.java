import java.util.Scanner;
public class PositiveNegative{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter First Number");
int numb1 = input.nextInt();

System.out.print("Enter second Number");
int numb2 = input.nextInt();

System.out.print("Enter third Number");
int numb3 = input.nextInt();

System.out.print("Enter Forth Number");
int numb4 = input.nextInt();

System.out.print("Enter Fiisth Number");
int numb5 = input.nextInt();

int postive = 0;
int negative = 0;
int zero = 0;

if (numb1 > 0)
postive = postive + 1;

if (numb1 < 0)
negative = negative +1;

if (numb1 == 0)
zero = zero+1;

if (numb2 > 0)
postive = postive + 1;

if (numb2 < 0)
negative = negative +1;

if (numb2 == 0)
zero = zero+1;


if (numb3 > 0)
postive = postive + 1;

if (numb3 < 0)
negative = negative +1;

if (numb3 == 0)
zero = zero+1;


if (numb4 > 0)
postive = postive + 1;

if (numb4 < 0)
negative = negative +1;

if (numb4 == 0)
zero = zero+1;


if (numb5 > 0)
postive = postive + 1;

if (numb5 < 0)
negative = negative +1;

if (numb5 == 0)
zero = zero+1;

System.out.printf("the total number of postive number is %d%n",postive);
System.out.printf("the total number of negative number is %d%n",negative);
System.out.printf("the total number of zero number is %d%n",zero);
 }
}






