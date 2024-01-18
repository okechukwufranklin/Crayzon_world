import java.util.Scanner;
public class Products{
public static void productNumber(int FirstNumber, int SecondNumber){

int product = 0;
for(int count = 1; count <= SecondNumber;count++){
product  += FirstNumber;
}
	System.out.print(product);
}
public static void main(String... args){
Scanner input = new Scanner(System.in);	

System.out.print("Enter First Number:");
int FirstNumber = input.nextInt();

System.out.print("Enter Second Number:");
int SecondNumber =input.nextInt();

productNumber(FirstNumber, SecondNumber);
}
}