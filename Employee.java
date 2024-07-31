import java.util.*;
public class Employee
{
 
   String name,code;
double basic,DA,hra,net,pf;
 public Employee()
{
name="";
code="";
basic=0;
}
public Employee(String a,String b,double d)
{
name=a;
code=b;
basic=d;
}
public void compute()
{
DA=(10/100)*basic;
hra=(20/100)*basic;
pf=1000;
net=basic+DA+hra-pf;
}
public void display()
{
System.out.println("the name of the employee is:"+name);
System.out.println("the code of the employee is:"+code);

System.out.println("the net of the employee is:"+net);
}
public static void main(String args[])
{
Employee ob1=new Employee("RAT","3%5",2345);
ob1.compute();
ob1.display();
}
}




