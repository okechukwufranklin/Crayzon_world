import java.util.Arrays;
public class CheckElements{
public static String checkElement(double[] numberArray, double Element){

//double checkElement = numberArray[0];
 String exsist ="Doesnt exsist";
for(int count = 0; count < numberArray.length;count++){
	if(numberArray[count] == Element) {
			exsist = "Does exsist"; 
}
}
return exsist; 
}


public static void main(String...args){

double[] numberArray = {1,2,3,4,5,6,7,8,9};
double Element = 20;

//CheckElements checkelement = new CheckElement(numberArray,Element);

String result = CheckElements.checkElement(numberArray,Element);
System.out.print(result); 
}
}
