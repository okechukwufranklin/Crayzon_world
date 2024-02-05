import java.util.Arrays;
public class palindromeArray{

 public static String palindromeWords(String wordArray){

char[] forwardArray = wordArray.toCharArray();
char[] backWordArray = new char[wordArray.length()];
int forwardIndex = 0;
int backWordIndex = wordArray.length() -1 ;

for(int count = 0 ; count < wordArray.length() ; count++ ){
backWordArray[backWordIndex] = forwardArray[forwardIndex];

forwardIndex ++; 
backWordIndex --;
}



String palindrome = String.valueOf(backWordArray);

String same = "Not A palindrome";
if(wordArray.equalsIgnoreCase(palindrome)){
 same ="It IS A palindrome";
}

return same;
}

public static void main(String...args){

String word = "franklin";
String result = palindromeArray.palindromeWords(word);
System.out.print(result);
}
}

