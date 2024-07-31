import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        int n, i;
        boolean isprime = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        
        // Check if the number is prime
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime) {
            int temp = n, rev = 0;
            // Calculate the reverse of the number
            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }
            // Check if the number is a palindrome
            if (rev == n) {
                System.out.println("Yes, the prime number is a palindrome");
            } else {
                System.out.println("The prime number is not a palindrome");
            }
        } else {
            System.out.println("The number is not prime");
        }
        
        scanner.close();
    }
}

