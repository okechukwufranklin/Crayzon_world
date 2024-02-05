	import java.util.Calendar;
import java.util.Scanner;

public class AddDaysToUserInput {
    public static void main(String[] args) {
        // Example usage
        Scanner scanner = new Scanner(System.in);

        // Get a date from the user
        System.out.print("Enter a date (MM-dd-yyyy): ");
        String userInput = scanner.nextLine();

        // Add 7 days to the user-provided date
        String result = addDaysToUserInput(userInput, 7);

        // Display the result
        System.out.println("Result after adding 7 days: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to add days to a user-provided date
    public static String addDaysToUserInput(String userInput, int daysToAdd) {
      
            // Parse user input using Scanner
            Scanner dateScanner = new Scanner(userInput).useDelimiter("-");
            int month = dateScanner.nextInt();
            int day = dateScanner.nextInt();
            int year = dateScanner.nextInt();

            // Create a Calendar instance and set it to the user-provided date
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1); // Calendar months are zero-based
            calendar.set(Calendar.DAY_OF_MONTH, day);

            // Add the specified number of days
            calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);

            // Format the result date and return
            return String.format("%02d-%02d-%04d",
                    calendar.get(Calendar.MONTH) + 1, // Adjusting for zero-based months
                    calendar.get(Calendar.DAY_OF_MONTH),
                    calendar.get(Calendar.YEAR));
       
    }
}