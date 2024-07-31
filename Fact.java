import java.util.*;
{
public class Fact
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int i,n,fact=1;
System.out.println("Enter a number");
n=sc.nextInt();
while(i<=n)
{
fact=fact*i;
}
i++;
System.out.println("the factorial is "+fact);
}
}
}
