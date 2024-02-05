import java.util.Scanner;

	public class Milage{
			public static void main(String... args){
Scanner input = new Scanner(System.in);

double miles = 0;
double gallon =  0;
double result = 0;
double counter = 0;

System.out.print("Enter cntl z then enter to end");



while( input.hasNext()){

System.out.print("Enter the amount of miles or -1 to end;");
 miles = input.nextDouble();

System.out.print("Enter the amount of gallons used:");
 gallon = input.nextDouble();

 result = miles / gallon;
System.out.printf("miles per gallon is%.2f%n",result);

counter = counter + 1;

}
 counter += result;
counter = counter/result;
System.out.printf("total amount of miles per gallon is:%.2f",counter);


	}
} 

