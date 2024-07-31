import java.util.*;

public class Efibo1 {
    public static void main(String args[]) {
        int term, a = 0, b = 1, c;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();

        int lowerFibo = 0, upperFibo = 1; // To store the nearest Fibonacci numbers

        // Find Fibonacci numbers around the input term
        while (b < term) {
            lowerFibo = b; // Update lower Fibonacci number
            c = a + b;    // Calculate the next Fibonacci number
            a = b;        // Move to the next number
            b = c;        // Move to the next number
        }

               c=a+b;
        upperFibo = c; // Update upper Fibonacci number

        System.out.println("The two nearest Fibonacci numbers around " + term + " are: " + lowerFibo + " and " + upperFibo);
        sc.close();
    }
}
