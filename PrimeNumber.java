import java.util.Scanner;

public class PrimeNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter A Number");
int numb = input.nextInt();
int counter = 0;

for(int count = 2; count < numb; count++){
if (numb % count == 0 )
  counter++;
}
if(counter >  0){
System.out.print("Not A Prime Number");
}
else {
System.out.print("Prime Number");
 	}



	 }
}
