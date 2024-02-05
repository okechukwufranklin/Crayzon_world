import java.util.Calendar;
import java.util.Scanner;

public class MenstrualCycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome To Your Menstration App");
        System.out.println("This App helps you Calculate you next Cycle, Your Safe Day And Your Not Safe Day");

        System.out.println("what is your name");
        String Name = input.next();

        System.out.print("Enter Date of Last Menstrual cycle(MM-dd-yyyy):");
        String LastMenstrualCycle = input.next();
        System.out.print("How Long Did Last Menstrual Cycle Last for");
        int lengthMenstrualCycle = input.nextInt();

        String result = addDaysToDateEntered(LastMenstrualCycle,lengthMenstrualCycle);
        String EndOfSafeDay = addDaysToDateEntered(result,7);

        String notSafeDay = addDaysToDateEntered(result,8);
        System.out.println("Here Your Result "+ Name);


       System.out.println("your Next Menstrual Cycle would Most Likely begin on:" + result);
        System.out.println("According to research starting from the 1st day to 7 day you are considered not to be fertile and less likly to get pregnant so you can have fun from:  " +    result     +   "To"  +    EndOfSafeDay);
        System.out.println("According to research starting from the 8 day to 19 day you are considered to be fertile which could lead to pregnacy so you would want to abstan from sex on:" + notSafeDay);





    }
    public static String addDaysToDateEntered(String userInput, int daysToAdd){
        Scanner dataCollector = new Scanner(userInput).useDelimiter("-");
        int month = dataCollector.nextInt();
        int day = dataCollector.nextInt();
        int years = dataCollector.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,years);
        calendar.set(Calendar.MONTH,month - 1);
        calendar.set(Calendar.DAY_OF_MONTH,day);

        calendar.add(Calendar.DAY_OF_MONTH,daysToAdd);

        return String.format("%02d-%02d-%04d",
                calendar.get(Calendar.MONTH)+ 1,
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.YEAR));

    }




}
