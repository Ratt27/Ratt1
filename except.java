// handling exceptions:
 public  class except
{
public static void main(String args[])
{
int i=2;
int j=0;
int nums[]= new int[5];
try
{
j=8/i;// its better to put complicated statemnts here in this block
System.out.println(nums[1]);
System.out.println(nums[5]);
}
catch(ArithmeticException e)// when it throws an Exception , it is throwing an OBJECT
// here EXCEPTION is a class
{
System.out.println("something is wrong here. "+e);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("stay in ur limits "+e);
}
System.out.println(j);
System.out.println("bye");

}
}
