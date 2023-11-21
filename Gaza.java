import java.util.Scanner;
public class Gaza{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter estimaed number of stones used:");
int stonesUsed = input.nextInt();


System.out.print("Enter the avarage weight of stone used:");
int weightOfStone = input.nextInt();

System.out.print("Enter number of years used to build the Pyramid:");
int numberOfYears = input.nextInt();

double weightOfpyramid = weightOfStone * stonesUsed;

double weightOfPyramidEachYear =  weightOfpyramid / numberOfYears;

double wightOfPyramidEachHour = weightOfPyramidEachYear / 8760;

double wightOfPyramidEachMinute = wightOfPyramidEachHour / 60;

System.out.printf("The weight of pyramid built each year is %.3f tons\n",weightOfPyramidEachYear);
System.out.printf("The weight of pyramid built each Hour is %.3f tons\n",wightOfPyramidEachHour);
System.out.printf("The weight of pyramid built each Minute is %.3f tons\n",wightOfPyramidEachMinute);
 }
}