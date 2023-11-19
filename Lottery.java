import java.util.Scanner;
 public class Lottery{
  public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter 3 Digit Number:");
int numb = input.nextInt();
int f = 4;
int s = 9;
int t = 6;
int w = 469;
int n = 649;
int r = 946;
int d = 694;
int y = 964;

if (numb == w){ 
System.out.print(" You Win $10,000");
}

if (numb == n){ 
System.out.print(" You win $3,000");
}
if (numb == r){
System.out.print(" You win $3,000");
}
if (numb == d){
System.out.print(" You win $3,000");
}
if (numb == y){
System.out.print(" You win $3,000");
}
if ((numb == f) || (numb == s) || (numb == t)){  
if ((numb == s) || (numb == f) || (numb == t))  
if ((numb == t) || (numb != f) || (numb ==s))
System.out.print("You win $1,000");
}

if (numb != w){ 
System.out.print("Try Again");
  }
 }
}

