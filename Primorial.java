import java.util.*;

public class Primorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of prime numbers: ");
        int n = sc.nextInt();
        int ptd = 1; // Initialize the product of primes
        
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break; // No need to continue if we found a divisor
                }
            }
            if (count == 0) {
                ptd *= i;
            }
        }
        
        System.out.print("The primorial is: " + ptd);
    }
}
