import java.util.Scanner;
public class Age {
public static void main(String[] args){

Scanner rin = new Scanner(System.in);

System.out.print("Enter Age");
int age = rin.nextInt();

 int result = age * 365;

System.out.printf("Age in days is %s%n", result);

}
}
