import java.util.*;

class Test {
    int a, b;

    Test(int x, int y) {
        a = x;
        b = y;
    }

    void math(Test ob) {
        ob.a = ob.a * 2;
        ob.b = ob.b / 2;
    }
}

class Test2 {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("Before call");
        System.out.println("a = " + ob.a);
        System.out.println("b = " + ob.b);
        ob.math(ob);
        System.out.println("After call");
        System.out.println("a = " + ob.a);
        System.out.println("b = " + ob.b);
    }
}
