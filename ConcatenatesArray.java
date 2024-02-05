import java.util.Arrays;
public class ConcatenatesArray{

	public static String[]  ConcatenatesTwo(int[] ArrayOfIntegers, String[] ArrayOfstrings){
	String ConcatenatesArray[] = new String[(ArrayOfIntegers.length + ArrayOfstring.length)];
	
	for(int count = 0 ; count < ArrayOfIntegers.length; count ++){ 
	ConcatenatesArray[count] = ArrayOfIntegers[count];
	} return ConcatenatesArray;

int index = ArrayOfIntegers.length;
	for(int count = 0; count < ArrayOfstrings.length;count++){
	ConcatenatesArray[index] =  ArrayOfstrings[count];
index++;
}
}
return ConcatenatesArray[];

}
public static void main(String... args){

int[] numb = {1,2,3,4};
String[] word = {"word"};
result =ConcatenatesArray.ConcatenatesTwo(numb,word);
System.out.print(Arrays.toString(result));
}
}

