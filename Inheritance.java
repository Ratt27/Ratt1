import java.util.*;

class Superclass {
    protected int i,j; // Protected to allow access in subclass

    void show() {
        System.out.println(i);
        System.out.println(j);
    }
}

class B extends Superclass {
    

    void sum() {
        System.out.println(i + j);
    }
}

public class Inheritance{
    public static void main(String args[]) {
        Superclass ob = new Superclass();
        ob.i = 10; // Set i to 10
        ob.show(); // This will print 10

        B ob1 = new B();
        ob1.i = 10; // Set i to 10 (inherited from Superclass)
        ob1.j = 20; // Set j to 20
        ob1.sum();  // This will print i + j = 10 + 20 = 30
        ob1.show();
    }
}
