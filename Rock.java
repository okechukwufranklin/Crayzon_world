import java.util.Scanner;

 public class Rock{
  public static void main(String[] args){

 Scanner rin = new Scanner(System.in);

 System.out.print("Player One Name");
 String name = rin.nextLine();

System.out.print("Player Two Name");
String nametwo = rin.nextLine();

System.out.print("Player One Enter Number");
int x = rin.nextInt();

System.out.print("Player Two Enter Number");
int y = rin.nextInt();

if (x== 1)
if (y==0)
System.out.printf("Winner %s",name);

if (x== 0)
if (y== 1)
System.out.printf("Winner %s",nametwo);

if (x== 0)
if (y== 2)
System.out.printf("Winner %s",name);

if (x== 2)
if(y== 0)
System.out.printf("Winner %s",nametwo);

if (x== 2)
if (y== 1)
System.out.printf("Winner %s",name);

if (x== 1)
if (y==2)
System.out.printf("Winner %s",nametwo);

if (x== 1)
if (y== 1)
System.out.print("Draw");

if (x== 2)
if (y== 2)
System.out.print("Draw");

if (x== 0)
if (y== 0)
System.out.print("Draw");
// 0 = scissor 
//1=rock
//2=paper
 }
}
 