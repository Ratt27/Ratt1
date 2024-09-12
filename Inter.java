import java.util.*;
interface A // its like a class where all the methods are by default public
{
void show();
void config();
}


 class B implements A //  we  want to create a concrete class so we have to define both the methods otherwise this class becomes abstract
{
 public void show()
{
System.out.println("implementing show");
}
 public void config()
{
System.out.println("implementing config");

}
}
 public class Inter
{
public static void main(String args[])
{
A obj;// A is type
obj= new B();
obj.show();
obj.config();
}
}