public class RecursiveMethods {

    // Method 1: Factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Method 2: Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method 3: Sum of Natural numbers
    public static int sumNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNaturalNumbers(n - 1);
    }

    // Method 4: Exponential
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    // Method 5: Reverse String
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("5th Fibonacci number: " + fibonacci(5));
        System.out.println("Sum of first 5 natural numbers: " + sumNaturalNumbers(5));
        System.out.println("2 to the power 3: " + power(2, 3));
        System.out.println("Reverse of 'Hello': " + reverseString("Hello"));
    }
}
