import java.util.Scanner;

public class TestLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Display a string 99 times
        for (int i = 0; i < 99; i++) {
            System.out.println("Java is fun");
        }

        // 2. Display odd numbers from 0 to 99
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }

        // 3. Display even numbers from 0 to 99
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i);
        }

        // 4. Another way to display even numbers
        int x = 0;
        while (x < 100) {
            System.out.println(x);
            x += 2;
        }

        // 5. Sum of odd numbers from 0 to 99
        int oddSum = 0;
        for (int i = 1; i < 100; i += 2) {
            oddSum += i;
        }
        System.out.println("Sum of odd numbers: " + oddSum);

        // 6. Sum of even numbers from 0 to 99
        int evenSum = 0;
        for (int i = 0; i < 100; i += 2) {
            evenSum += i;
        }
        System.out.println("Sum of even numbers: " + evenSum);

        // 7. Sum of numbers between two numbers given by the user
        System.out.println("Please enter a start integer:");
        int startInt = scanner.nextInt();
        System.out.println("Please enter an end integer:");
        int endInt = scanner.nextInt();
        int numsSum = 0;
        int tmp = 0;
        if (startInt > endInt) {
            tmp = endInt;
            endInt = startInt;
            startInt = tmp;
        } else if (startInt == endInt) {
            System.out.println("Sum of numbers between the range: " + startInt);
        }
        for (int i = startInt; i <= endInt; i++) {
            numsSum += i;
        }
        System.out.println("Sum of numbers between the range: " + numsSum);
        scanner.close();
    }
}
