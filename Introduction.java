import java.util.Scanner;
 public class Introduction {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
 
   System.out.println("Hello");
   System.out.println("My Name Is Rin Tohsaka");
   System.out.print("What Is Your Name?");
   
   String name = input.nextLine();

   System.out.print("How Old Are You?");
   int age = input.nextInt();

  

  System.out.printf("so your name is %s,and your age is %d%n",name, age);
  System.out.print("Nice To Meet You");
 }

}

	