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

        // Perform all Java data types and operations(Arithmetic Operators, ) I learned
        // Data types:
        // 1. boolean
        // 2. byte
        // 3. short
        // 4. int
        // 5. long
        // 6. double
        // 7. float
        // 8. char
        // 9. String

        // 1. Boolean
        boolean a = true;
        boolean b = false;
        System.out.println(a == b);
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);

        // 2. Byte
        byte c = 1;
        System.out.println(c++);
        System.out.println(++c);

        // 3. short
        short d = 128;
        System.out.println(d--);
        System.out.println(--d);

        // 4. int
        int e = 10000;
        int f = 20000;
        System.out.println(e + f);
        System.out.println(e - f);
        System.out.println(e * f);
        System.out.println(e / f);
        System.out.println(e % f);
        e += 1;
        f -= 1;
        System.out.println(e);
        System.out.println(f);

        // 5. long
        long g = 2 ^ 33 + 1;
        long h = - 2 ^ 33;
        g /= h;
        System.out.println(g);
        g *= h;
        System.out.println(g);
        g %= h;
        System.out.println(g);
        System.out.println(g > h);
        System.out.println(g >= h);
        System.out.println(g < h);
        System.out.println(g <= h);

        // 6. double
        double i = 228.00;
        double j = 374.00;
        System.out.println(i / j);

        // 7. float
        float m = 3.4f;
        float n = 44.5f;
        System.out.println(m - n);

        // 8. char
        char p = 'a';
        char q = 'b';
        System.out.println(p == q);
        System.out.println(p != q);

        // 9. string
        String y = "Ilovetechbridge";
        String z = "Ithinkso";
        System.out.println(y + z);
        System.out.println(y == z);
        System.out.println(y != z);        


    }
}

