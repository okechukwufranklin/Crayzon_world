import java.util.Scanner;

public class Month{
 public static void main(String[] args){

Scanner rin = new Scanner(System.in);

System.out.print("Enter Month :");
int number = rin.nextInt();

System.out.print(" Enter Year :");
int year = rin.nextInt();

if (number== 1)
System.out.printf("January Has 31 Days in %s%n", year);

if (number== 2)
System.out.print("Febuary Has 30 Days or 28,29 Days on leap year");

if (number== 3)
System.out.printf("March Has 31 Days in %s%n", year);

if (number== 4)
System.out.printf("April Has 30 Days in %s%n", year);

if (number== 5)
System.out.printf("May Has 31 Days in %s%n", year);

if (number== 6)
System.out.printf("June Has 30 Days in %s%n", year);

if (number== 7)
System.out.printf("July 31 Days in %s%n", year);

if (number== 8)
System.out.printf("August Has 31 Days in %s%n", year);

if (number== 9)
System.out.printf("September Has 30 days in %s%n", year);

if (number== 10)
System.out.printf("October Has 31 Days in %s%n", year);

if (number== 11)
System.out.printf("November Has 30 Days in %s%n", year);

if (number== 12)
System.out.printf("December Has 31 Days in %s%n", year);

 }
}