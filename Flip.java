import java.util.Scanner;
public class Flip{ 
 public static void main(String[] args){

  Scanner input = new Scanner(System.in);
 
 System.out.print("Enter a number");
int number= input.nextInt();

 if (number== 1)
   System.out.printf("0");

 if (number==0)
  System.out.print("1");
}
}




