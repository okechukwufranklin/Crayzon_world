import java.util.Scanner;
public class MultiplicationTimesTable{
	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter A number For Multiplication Times Table  ");
int TimesTable = input.nextInt();

int counter = +1;

if(TimesTable <= 0 || TimesTable > 20){
System.out.print("Please Kindly Input A number That is NOT! A Negative or ZERO... Number T for Thanks");

}else{
while(counter < 13){
int result = TimesTable * counter;
System.out.printf("%d x %d = %d\n",TimesTable,counter,result);
counter = counter + 1; 
}
}




	}
}
