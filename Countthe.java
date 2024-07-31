import java.util.*;

class Countthe {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        int count = 0;
        
        while (s.length() > 0) {
            s = s.trim(); // Remove leading and trailing spaces
            int n = s.indexOf(' '); // Find the first space
            
            if (n == -1) { // No spaces left, this is the last word
                n = s.length();
            }
            
            String w = s.substring(0, n); // Extract the first word
            
            if (w.equals("the")) { // Check if the word is "the"
                count++;
            }
            
            if (n == s.length()) { // No more spaces left, exit loop
                break;
            }
            
            s = s.substring(n + 1); // Update s to remove the processed word
        }
        
        System.out.print("The number of times 'the' appears is: " + count);
    }
}
