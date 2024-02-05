import java.util.Scanner;
  public class Integer {
   public static void main(String[] args) {

   Scanner input = new Scanner(System.in); 

   System.out.print("Enter Number");
   int x = input.nextInt();

   System.out.print("Enter second Number");
   int y = input.nextInt();
   
   int result = x * x;
    int secondresult = y * y;
   

   System.out.printf("Square is %d%n", result);
   System.out.printf("Second Square is %d%n", secondresult);
   
  
 }

} 