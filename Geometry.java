import java.util.Scanner;

class Point {
    static float x1 = 4.0f;
    static float y1 = 3.0f;
    static float x2;
    static float y2;
    static double distance;

    // Static block for initializing static variables
    static float calculate {
        System.out.println("Enter the coordinates for x2 and y2:");
        Scanner sc = new Scanner(System.in);
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();

        // Calculate the distance after receiving the input
        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between the coordinates is: " + distance);
    }
}

class Geometry {
    public static void main(String[] args) {
        // Trigger the static block by referencing the Point class
        Point.calculate(); // This will load the Point class and execute the static block.
    }
}
