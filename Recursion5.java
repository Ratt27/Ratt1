public class Recursion5 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        // Base case: If idx is out of bounds, stop the recursion
        if (idx == str.length()) {
            return;
        }

        char currChar = str.charAt(idx);

        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurance(str, idx + 1, element);
    }

    public static void main(String args[]) {
        String str = "Rattriz";
        findOccurance(str, 0, 'a');
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
