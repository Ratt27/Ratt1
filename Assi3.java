import java.util.*;

class Assi3 {
    public static void main(String args[]) {
        double length , breadth , radius;
        int side;
         System.out.println("enter the values of length, breadth, radius and size");
         Scanner sc =new Scanner(System.in);
         length=sc.nextDouble();
         breadth=sc.nextDouble();
         radius=sc.nextDouble();
         side=sc.nextInt();
         
        Areaof ob = new Areaof();
        
        ob.Area(radius);
        ob.Area(length, breadth);
        ob.Area(side);
    }
}

class Areaof {
    double length, breadth, radius;
    int side;

    void Area(double r) {
        radius = r;
        System.out.println("The area of the circle is:");
        double area1 = 3.14f * radius * radius; 
        System.out.println(area1);
    }

    void Area(double l, double b) {
        length = l;
        breadth = b;
        System.out.println("The area of the rectangle is:");
        double area2 = length * breadth;
        System.out.println(area2);
    }

    void Area(int s) {
        side = s;
        System.out.println("The area of the square is:");
        double area3 = side * side;
        System.out.println(area3);
    }
}
