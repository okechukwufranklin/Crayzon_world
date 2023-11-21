import java.util.Scanner;
public class Weight{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in Kilograms:");
int kilogram = input.nextInt();

System.out.print("Enter hight in Meter:");
int meter = input.nextInt();

int bmi = kilogram /( meter * meter);

System.out.printf("Body Mass is: %s%n",bmi);
 }
}



