import java.util.Scanner;

class Display2 {
    private String s;
    private int count = 0;
    private int count2 = 0;

    public Display2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string from the user:");
        s = sc.nextLine();
    }

    void no_of_words() {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        // Adding 1 to count to consider the last word
        if (s.length() > 0) {
            count++;
        }
        System.out.println("The number of words: " + count);
    }

    void no_of_alphabets() {
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                count2++;
            }
        }
        System.out.println("The number of alphabets: " + count2);
    }

    public static void main(String[] args) {
        Display2 display = new Display2();
        display.no_of_words();
        display.no_of_alphabets();
    }
}
