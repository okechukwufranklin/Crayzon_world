import java.util.Arrays;
public class LoopSum{

public static int loopSum(int [] SumArray){

int total = 0;
for(int count = 0; count < SumArray.length; count ++){
total += SumArray[count];
}
return total;
}
public static int loopSum2(int[] SumArray){

int total = 0; 
int count = 0;
while(count < SumArray.length){
total += SumArray[count];
count ++;
}
return total;
}
public static int loopSum3(int[] SumArray){

int count = 0;
int total = 0;
do {
 total = SumArray[count] ;
count ++;


} while(count < SumArray.length);

return total;
}


public static void main(String... args){

int[] numberArray1 = {1,2,3,4,5};
int[] numberArray2 ={2,3,4,5,6};
int[] numberArray3 = {4,5,7,8,9};

int total1 = loopSum(numberArray1);
int total2 = loopSum2(numberArray2);
int total3 = loopSum3(numberArray3);
System.out.printf("sum using for loop = %d %n",total1);
 System.out.printf("sum using while loop = %d %n",total2);
System.out.printf("sum using Do while loop = %d %n",total3);
}
}
