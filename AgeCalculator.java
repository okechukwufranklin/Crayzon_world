import java.util.Scanner;
public class AgeCalculator{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.print("Enter Date Of Birth:");
int DateOfBirth = input.nextInt();


int result = 2024 - DateOfBirth;

System.out.printf("Your Age is :%d%s",result," years Old");
}
}