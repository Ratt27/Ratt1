import java.util.*;

class Outer {
    static int age;

    public void show() {
        System.out.println("Checking whether you are eligible to vote");
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
    }

    static class Inner {
        public void checkAge() {
            if (age >= 18) {
                System.out.println("You are eligible to vote");

                Inner2 obj2 = new Inner2(); // Create an instance of Inner2
               // Call the vote method
            } else {
                System.out.println("You are not eligible to vote");
            }
        }

        class Inner2 { // Moved Inner2 outside of the method and made it static
            static  {
                if (age == 18) {
                    System.out.println("First-time voter");
                } else {
                    System.out.println("Not a first-time voter");
                }
            }
        }
    }
}

public class Demo3 {
    public static void main(String args[]) {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = new Outer.Inner();
        obj1.checkAge(); // Correct method name and call
    }
}
