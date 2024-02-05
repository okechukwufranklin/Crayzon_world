package fireDrillTwo;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int counter = 0; counter < 10; counter++) {
            System.out.print("enter number;");
            double number = input.nextDouble();
            if(number < 0|| number >100)
                System.out.println("invalid input");

              sum += number;



        }
         System.out.println(sum);
    }
}
