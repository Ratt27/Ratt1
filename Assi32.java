import java.util.*;

class Assi32 {
    public static void main(String args[]) {
        Addition ob = new Addition();
        
        ob.addition(1.5, 6.8);
        ob.addition(1.0f, 3.5f);  // Use float literals with 'f'
        ob.addition(4, 6);  // Add method for integers
    }
}

class Addition {
    // Define methods to handle different types of addition

    void addition(double v1, double v2) {
        double result = v1 + v2;
        System.out.println("The addition of doubles is: " + result);
    }

    void addition(float v1, float v2) {
        float result = v1 + v2;
        System.out.println("The addition of floats is: " + result);
    }

    void addition(int v1, int v2) {
        int result = v1 + v2;
        System.out.println("The addition of integers is: " + result);
    }
}
