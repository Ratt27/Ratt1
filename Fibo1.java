import java.util.*;

public class Fibo1 {
    public static void main(String args[]) {
        int term, a = 0, b = 1, c;
        System.out.print("Enter term: ");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();
        for (int i = 1; i <= term; i++) {
          for(int j= term;j>=1;j--)

           { System.out.println(a);}
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}
