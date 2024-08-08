import java.util.*;

class Displaychar {
    public static void main(String args[]) {
        System.out.print("Enter string from user: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("1. User wants to display previous character");
        System.out.println("2. User wants to display next character");
        System.out.print("Enter your choice: ");
        
        int ch = sc.nextInt();
        sc.close();
        
        switch(ch) {
            case 1: {
                for(int i = 0; i < s.length(); i++) {
                    if (i == 0) {
                        System.out.println("There are no previous characters for index " + i);
                    } else {
                        System.out.println("The previous character of index " + i + " (" + s.charAt(i) + ") is " + s.charAt(i - 1));
                    }
                }
                break;
            }
            case 2: {
                for(int i = 0; i < s.length(); i++) {
                    if (i == s.length() - 1) {
                        System.out.println("There are no characters after index " + i);
                    } else {
                        System.out.println("The next character of index " + i + " (" + s.charAt(i) + ") is " + s.charAt(i + 1));
                    }
                }
                break;
            }
            default: {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}
