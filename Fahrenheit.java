import java.util.Scanner;
public class Fahrenheit {
 public static void main(String [] args) {
 Scanner rin = new Scanner(System.in);
 
System.out.print("Enter degree");
double x = rin.nextDouble();

double result = (9.0/5) * x +32;


System.out.printf("fahrenheit is  %s%n", result);

}
}


 



