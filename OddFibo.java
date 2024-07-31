import java.util.*;

public class OddFibo {
    public static void main(String args[]) {
        int term, a = 0, b = 1, c;
        System.out.print("Enter no of terms for number of times calculating fibonacci: ");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();
        for (int i = 0; i <= term; i++) {
            if(a%2!=0){
            System.out.println(a);}
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}
