import java.util.*;
 class outer
{
int age;
public void show()
{
System.out.println("in show");
}
class inner
{
public void config()
{
System.out.println("in config");
}
}
}
public class Demo
{
public static  void main(String args[])
{
outer obj = new outer();
obj.show();
outer.inner obj1 = obj.new inner();
obj1.config();
}
}