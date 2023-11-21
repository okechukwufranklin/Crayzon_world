import java.util.Scanner;
public class Circle{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter Radius Of A Circle:");
int radius = input.nextInt();

double π = 3.14159;

int diameter = 2 * radius;

double circumference = 2 * π * radius;

double area = π * radius * radius ;

System.out.printf(" Diameter is:%s%n",diameter);
System.out.printf(" Circumference is;%s%n",circumference);
System.out.printf(" Area is:%s%n",area);
 }
}


