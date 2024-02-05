import java.util.Scanner;

 public class GasMilage{
  public  static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter miles:");
int milage = input.nextInt();

System.out.print("Enter amount of gallon used :");
int gallon = input.nextInt();

int milesPerGallon = milage / gallon;

System.out.printf("Avarage miles per gallon is ;%d%n",milesPerGallon);


int counter = 0;
int total = 0;

while ( milage != -1) {

System.out.print("Enter milage: ");
milage = input.nextInt();

System.out.print("Enter amount of gallon used :"); 
 gallon = input.nextInt();

  milesPerGallon = milage / gallon;

System.out.printf("Avarage miles per gallon is ;%d%n",milesPerGallon);

total+= counter;
counter++;

}
System.out.printf("Total amount of miles per gallon : %d%n",total);
}
}

