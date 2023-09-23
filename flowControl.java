import java.util.Scanner;

public class flowControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take 2 numbers as input.
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Ensure the difference between the numbers is not less than 200
        if (Math.abs(num1 - num2) < 200) {
            System.out.println("Difference between the numbers is less than 200. Program will end.");
			scanner.close();
            return; // End the program if the difference is less than 200
			
        }

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        int sumDivisibleBy4 = 0;
        int sumDivisibleBy8 = 0;
        int sumOddAndNotDivisibleBy5 = 0;

        // Using for loop to sum up numbers
        for (int i = start; i <= end; i++) {
            switch (i % 8) { // Using switch statement
                case 0: // divisible by 8
                    sumDivisibleBy8 += i;
                    // Fallthrough since if a number is divisible by 8, it is also divisible by 4
                case 4: // divisible by 4 but not by 8
                    sumDivisibleBy4 += i;
                    break;
            }

            // Using if statement to check and sum up odd numbers not divisible by 5
            if (i % 2 != 0 && i % 5 != 0) {
                sumOddAndNotDivisibleBy5 += i;
            }
        }

        // Using while loop to display results
        int choice = 1;
        while (choice <= 3) {
            switch (choice) {
                case 1:
                    System.out.println("Sum of numbers that are even and divisible by 4 is: " + sumDivisibleBy4);
                    break;
                case 2:
                    System.out.println("Sum of numbers that are even and divisible by 8 is: " + sumDivisibleBy8);
                    break;
                case 3:
                    System.out.println("Sum of numbers that are not even and not divisible by 5 is: " + sumOddAndNotDivisibleBy5);
                    break;
            }
            choice++;
        }

        // Using do-while loop as an example, it's not needed logically here
        int counter = 0;
        do {
            System.out.println("Program Ended Successfully");
            counter++;
        } while (counter < 1);

		// Clode the scanner
		scanner.close();
    }
}
