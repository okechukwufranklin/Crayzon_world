import java.util.Scanner; 
public class Comparing {
  public static void main(String[] args) {
 
Scanner rin = new Scanner(System.in);

System.out.print("Enter Integer");
int x = rin.nextInt();

int result = x * x;

if ( x == 100) {
System.out.printf("%d==%d%n","is equal to 100");
}

if ( x != 100) {
System.out.printf("%d != %d%n","is not equal to 100");
}

if ( x < 100) {
System.out.printf("%d < %d%n","is less than 100");
}

if ( x > 100) {
System.out.printf("%d > %d%n","is greater than 100");
}
 }
}


 
