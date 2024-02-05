import java.util.Scanner;

public class Perimeter {
public static void main (String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter First perimeter :");
int a = input.nextInt();

System.out.print(("Enter Second Perimeter(Base) :"));
int b = input.nextInt();

System.out.print("Enter Third Perimeter :");
int c = input.nextInt();

int p = a + b + c;


if ( a + b < c){
System.out.print("Invalid input");
}

if (a + c < b)
System.out.print("Invalid input");


if (a + c >= b){
if (a + b >= c)
System.out.printf("Valid input \nanswer is %s",p);
}
 }
}

