//class->class= extends
//class->interface= implements
//interface->interface=extends


import java.util.*;
 interface A
{
void show();
void config();
}
interface X
{
void run();
}
 interface Y extends X  // inheritance is applicable here:
{}
class B implements A,Y  // here b can use two interfaces which was not possible in abstract, ONCE CLASS IMPLEMENTING MULTIPLE INTERFACES
{
  public void show()
{
System.out.println("u are in show:");
}
public void config()
{
System.out.println("in config");
}
public void run()
{
System.out.println("running...");
}
}

 class Moreinter
{
public static void main(String args[])
{
A obj;// if we use A then we can run only two methods show and config
obj= new B();
obj.show();
obj.config();
X obj1 = new B();
obj1.run();
}
}
