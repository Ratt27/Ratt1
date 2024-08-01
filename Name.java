import java.util.*;

class Name {
    public static void main(String[] args) {
        String s = "Mohan Das Karam Chand Gandhi";
        while (s.length() > 0) {
            s = s.trim();
            int n = s.indexOf(' ');
            if (n == -1) {
                
                n = s.length();
               String v=s.substring(0,n);
              System.out.print(v);
              break;
            }
            String w = s.substring(0, 1); // Get the first letter of the current word
            System.out.print(w+"."); // Print the initial
            s = s.substring(n+1); // Get the rest of the string after the current word
            
            s = s.trim(); // Trim any leading spaces for the next iteration
        }
        System.out.println(); // Print a new line at the end
    }
}

