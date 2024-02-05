package fireDrillTwo;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int counter = 0; counter < 10; counter++) {
            System.out.print("enter number;");
            int number = input.nextInt();
            if (number >= 0 || number <= 100) {
                sum += number;
            }


            System.out.println(sum);

        }
    }
}
