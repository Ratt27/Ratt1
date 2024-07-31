import java.util.*;

public class Nonfibo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term up to which you want the non-Fibonacci series: ");
        int term = sc.nextInt();
        
        Nonfibo2 obj = new Nonfibo2();  // Create an instance of Nonfibo2
        obj.generateNonfibo(term);    // Call the method on the instance
    }

    public void generateNonfibo(int term) {
        int a = 1, b = 2, c = a + b;
        System.out.println("NON FIBONACCI SERIES :");
        
        while (b <= term) {
            c = a + b;
            while (b + 1 < c && b + 1 <= term) {
                System.out.print((b + 1) + " ");
                b++;
            }
            a = b;
            b = c;
        }
        System.out.println();
    }
}
