/* Create a small program in the next five minutes that takes user input using a scanner and
 * any data type. Display the value input. Then, perform some type of manipulation 
 * on that value and display that result.
 */

import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.println("Please enter an integer:");

        // Read the integer value from user input
        int userValue = scanner.nextInt();

        // Display the value
        System.out.println("You entered: " + userValue);

        // Perform manipulation (doubling the value)
        int doubledValue = userValue * 2;

        // Display the result
        System.out.println("The doubled value is: " + doubledValue);

        // Perform manipulation (moduling the value)
        int moduledValue = doubledValue % 100;

        // Display the result
        System.out.println("The value moduled with 100 is: " + moduledValue);
        
        // Close the scanner
        scanner.close();
    }
}

