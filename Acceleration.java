import java.util.Scanner;
public class Acceleration{
 public static void main(String[] args){
  Scanner rin = new Scanner(System.in);

System.out.print("Input finalvelocity");
double finalVelocity = rin.nextDouble();

System.out.print("Input initalvelocity");
double initalVelocity = rin.nextDouble();

System.out.print("Input time");
double time = rin.nextDouble();


double Acceleration = (finalvelocity - initalvelocity)/time;
System.out.printf("The average acceleration is %.3f acceleration");

 }
}


