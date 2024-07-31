import java.util.*;

class Vowel {
    public static void main(String args[]) {
        String s;
        System.out.print("Enter the sentence: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        
        while (s.length() > 0) {
            s = s.trim();
            int n = s.indexOf(' ');
            if (n == -1) { // Handle the last word in the sentence
                n = s.length();
            }
            String w = s.substring(0, n);
            String v = w.substring(0, 1); // Convert to lowercase for comparison
            if ((v.equals("a") || v.equals("e") || v.equals("i") || v.equals("o") || v.equals("u"))&&(w.length()>2)) {
                System.out.println(w); // Changed to println for better readability
            }
            s = s.substring(n).trim();
        }
    }
}
