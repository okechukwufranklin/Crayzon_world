import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberArray{
public static void main(String...args){

ReverseElement reveres = new ReverseElement();
int[] arrayOfIntegers ={1,2,3,4,5,6};
int[] newArrayOfInteger = reverseIntegerArray(arrayOfIntegers);

double[] arrayOfDoubles= {0.1 , 0.2 , 0.3 , 0.4 , 0.5 , 0.6};
double[] newArrayOfDouble = reverseDoubleArray(arrayOfDoubles);

String[] arrayOfStrings = {"milk","bread","tea","cupcake","bacon","chicken"};
String[] newArrayOfString = reverseStringArray(arrayOfStrings);

char[] arrayOfChars ={'a' , 'b' , 'B', 'c', 'd'};
char[] newArrayOfChar = reverseCharArray(arrayOfChars);

System.out.printf("Integer Reverse Order Is:%s%n",Arrays.toString(newArrayOfInteger));
System.out.printf("Double Reverse Order Is:%s%n",Arrays.toString(newArrayOfDouble));
System.out.printf("String Reverse Char)Order Is:%s%n",Arrays.toString(newArrayOfString));
System.out.printf("Char Reverse Order Is:%s%n",Arrays.toString(newArrayOfChar));
}
}



