import java.util.Scanner;
public class Factorial{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.print("enter Number");
int number = input.nextInt();

int factorial = 1;
for(int count = 1; count < number+1; count++){
 factorial = factorial * count;

}
System.out.print(factorial);
}
}