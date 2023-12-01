import java.util.Scanner;

 public class Multiplication{
 public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number 1 to 10:");
 int numb = input.nextInt();

int count = +1;

if(numb <= 0 || numb > 10){
 System.out.print("Please Kindly Input A number That is NOT! A Negative or ZERO... Number T for Thanks");

}else{
while(count < 13){
 
 int result = numb * count;
 
System.out.printf("%d x %d = %d\n",numb,count,result);
count = count + 1;

 }
 }
 }
}