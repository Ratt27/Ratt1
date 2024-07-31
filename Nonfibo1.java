import java.util.*;

public class Nonfibo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of non-Fibonacci series: ");
        int length = sc.nextInt();
        
        Nonfibo1 obj = new Nonfibo1();  // Create an instance of Nonfibo1
        obj.generateNonfibo(length);    // Call the non-static method on the instance
    }

    public void generateNonfibo(int length) {
        int a = 1, b = 2, c = a + b;
        System.out.println("NON FIBONACCI SERIES :");
        for (int i = 0; i < length; ) {
            c = a + b;
            while (b + 1 < c) {
                System.out.print((b + 1) + " ");
                b++;
                i++;
                if (i >= length) {
                    break;
                }
            }
            a = b;
            b = c;
        }
        System.out.println();
    }
}
