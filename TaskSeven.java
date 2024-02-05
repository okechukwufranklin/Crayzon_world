package fireDrillTwo;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String...args){
        Scanner input=new Scanner(System.in);
        int sum = 0;
        for(int counter =0;  counter < 10;counter ++){
            System.out.print("enter number;");
            double number = input.nextDouble();
            if(counter % 2 != 0) {
                sum += number;
                double result = number / 10;

                System.out.println(result);

            }

        }
        System.out.println(sum);

    }
}
