import java.util.*;
 class outer// we can't make outer class static
{
 static int age;
public void show()
{
System.out.println("checking whether u are eligible to vote");
System.out.println("enter ur age");
Scanner sc= new Scanner(System.in);
age=sc.nextInt();
}
 static class inner// we can make inner class static
{
public void Age()
{
if(age>=18)
{
System.out.println(" u  are eligible to vote");
}
else
{
System.out.println("u are not eliggible to vote");
}
}
}
}
public class Demo2
{
public static  void main(String args[])
{
outer obj = new outer();
obj.show();
outer.inner obj1 = new outer.inner();// since inner class is static we do not need an object
obj1.Age();
}
}