class Rectangle {
    int length;
    int breadth;

    // Constructor to initialize Rectangle object
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate the area of the rectangle
    int calculateArea() {
        return length * breadth;
    }

    // Method that accepts a Rectangle object as a parameter
    void displayRectangle(Rectangle r) {
        System.out.println("Length: " + r.length + ", Breadth: " + r.breadth + ", Area: " + r.calculateArea());
    }

    // Method that returns a Rectangle object
    Rectangle doubleDimensions() {
        return new Rectangle(this.length * 2, this.breadth * 2);
    }
}

public class Mainrectangle {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect1 = new Rectangle(4, 5);

        // Display the dimensions and area of rect1
        System.out.println("Original Rectangle:");
        rect1.displayRectangle(rect1);

        // Create a new Rectangle object with doubled dimensions
        Rectangle rect2 = rect1.doubleDimensions();

        // Display the dimensions and area of the new Rectangle object
        System.out.println("Rectangle with Doubled Dimensions:");
        rect2.displayRectangle(rect2);
    }
}
