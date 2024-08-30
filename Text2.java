class Text2 {
    String str;

    // Non-parameterized constructor
    Text2() {
        str = "Srijita";
    }

    void display() {
        System.out.println(str);
    }

    Text2 Piglatin() {
        Text2 ob1 = new Text2(); // Create a new object
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {

                String sh = str.substring(i);
                String ch = str.substring(0, i);
                String result = sh + ch + "ay";
                ob1.str = result; // Set the new object's string
                return ob1; // Return the new object
            }
        }
        ob1.str = str; // If no vowel is found, return the original string
        return ob1;
    }

    public static void main(String[] args) {
        Text2 obj = new Text2();
        obj = obj.Piglatin();
        obj.display();
    }
}
