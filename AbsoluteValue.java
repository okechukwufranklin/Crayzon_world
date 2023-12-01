import java.util.Scanner;

  public class AbsoluteValue{
  public static void main(String[] args){

 Scanner input = new Scanner(System.in);

System.out.print("Enter A number :");
int numb = input.nextInt();



if(numb > 0){
System.out.printf("Absolute value is %d",numb);
}

if(numb == 0){
System.out.printf("Absolute value is:%d",0);
}

if(numb < 0){
System.out.printf("Absolute value is:%d",numb*-1);
}

}
}