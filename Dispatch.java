import java.util.*;
 class A  // parent
{
 public void show()
{
System.out.println("in A show");
}
}
class B extends A
{
public void show()
{
System.out.println("in B show");
}

}

 class C extends A
{
public void show()
{
System.out.println("in C show");
}

}

// here obj is behaving differently with diffrent objects:: polymorphism
 //which method it will call is not sure at first it is decided at the runtime thus run //time polymorphism, and the concept is known as dynamic method dispatch
 public class Dispatch
{
public static void main(String args[])
{
A obj = new A();// so here can we do this?
// obj is a variable and of type A
// reference of a super class and object of a  subclass
obj.show();
obj= new B();// it is now refering to the object Of B
obj.show();
   
obj = new C();
obj.show();
}
}