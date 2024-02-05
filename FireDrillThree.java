package fireDrillTwo;
import java.util.Scanner;

public class FireDrillThree {

    public void TaskOne(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int Score = input.nextInt();

        int[] newScore = new int[10];
        for(int counter = 0;counter < newScore.length;counter ++){
            newScore[counter]+=Score;

        }


    }

    public static void main(String[] args) {
        FireDrillThree fireDrillThree = new FireDrillThree();

    }
    public static int[] TaskFive(int[] numberArray){
        int oddArray[] = new int[(numberArray.length) / 2];
        int index = 0;
        for(int count = 0 ; count < numberArray.length ; count++){
            if(count % 2 !=  0){
                oddArray[index] = numberArray[count];
                index ++;
            }
        }
        return oddArray;
    }

    public static int[] TaskFour(int[] numberArray){
        int evenArray[] = new int[(numberArray.length + 1) / 2];
        int index = 0;
        for(int count = 0 ; count < numberArray.length ; count++){
            if(count % 2 ==  0){
                evenArray[index] = numberArray[count];
                index ++;
            }
        }
        return evenArray;
    }

    public static int TaskSix(int[] numberArray){
        int evenArray[] = new int[(numberArray.length + 1) / 2];
        int index = 0;
        int sum = 0;
        for(int count = 0 ; count < numberArray.length ; count++){
            if(count % 2 ==  0){
                evenArray[index] = numberArray[count];
                index ++;

            }
        }
        for(int counter = 0; counter <evenArray.length;counter++){
            sum+=evenArray.length;
        }

        return sum;
    }
    public static int TaskSeven(int[] numberArray){
        int oddArray[] = new int[(numberArray.length) / 2];
        int index = 0;
        int sum = 0;
        for(int count = 0 ; count < numberArray.length ; count++){
            if(count % 2 !=  0){
                oddArray[index] = numberArray[count];
                index ++;
            }
        }
        for(int counter =0;counter<oddArray.length;counter++){
            sum+=oddArray.length;
        }

        return sum;
    }







}
