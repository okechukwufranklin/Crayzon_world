import java.security.SecureRandom;
import java.util.Scanner;

public class NumberGuess{
 public static void main(String[] args){

SecureRandom random = new SecureRandom();
Scanner input = new Scanner(System.in);

int numb = 0;
int number = 1;

System.out.print("Guess The Number:");
 number = random.nextInt(1,11);
numb = input.nextInt();


while(numb != 00){
System.out.print("Guess The Number:");
 number = random.nextInt(1,11);
numb = input.nextInt();

if (numb == number){
System.out.print("Correct Guess");
}

if (numb > number){
System.out.printf(" incorrect Guess...Guess was too high Number was:%d%s%d",number,",and your Guess was:",numb);
}

if (numb < number){
System.out.printf("incorrect Guess...Guess was too low,Number was:%d%s%d",number,",and your Guess was:",numb);
  }
}
}
}