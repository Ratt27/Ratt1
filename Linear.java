import java.util.*;
class Linear
{
public static void main(String args[])
{
int n;
System.out.print("enter the size of array");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int array[]=new int[n];
System.out.print("enter the array elemnts:");
for(int i=0;i<array.length;i++)
{
array[i]=sc.nextInt();
}
int x;
System.out.print("enter the element to be searched");
x=sc.nextInt();
for(int i=0;i<array.length;i++)
{
if(array[i]==x)
{
System.out.print("the element has been found at position:"+(i+1));
}
}
}
}
