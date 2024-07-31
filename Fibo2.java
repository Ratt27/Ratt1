import java.util.*;

public class Fibo2 {
    public static void main(String args[]) {
        int term, a = 0, b = 1, c;
        System.out.print("Enter the desired Fibonacci term: ");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();
        
        // Print Fibonacci numbers until the desired term is reached or exceeded
        while (a < term) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        
        // If the term is found exactly, print it
        if (a == term) {
            System.out.println(a);
        }
        
        sc.close();
    }
}
