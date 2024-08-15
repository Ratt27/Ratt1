import java.util.*;

class Refer2 {
    public static void main(String args[]) {
        Point ob1 = new Point();
        Point ob2 = new Point();
        Point ob3 = new Point();

        ob1.input();
        ob2.input();
        ob3.midpoint(ob1, ob2);
        ob3.output();
    }
}

class Point {
    int x, y;
    Scanner sc = new Scanner(System.in);

        public Point() {
    }

        public Point(int a, int b) {
        x = a;
        y = b;
    }

    void input() {
        System.out.println("Enter the numbers:");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    void output() {
        System.out.println("The result is x = " + x);
        System.out.println("The result is y = " + y);
    }

    void midpoint(Point ob1, Point ob2) {
        x = (ob1.x + ob2.x) / 2;
        y = (ob1.y + ob2.y) / 2;
    }
}
