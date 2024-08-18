//find the number of ways in which u can invite n ppl, SINGLE or PAIRS

import java.util.*;
public class Recursion9
{
public static int callGuest(int n)
{
if(n<=1)
{
return 1;
}
int way1=callGuest(n-1);
int way2=(n-1)*callGuest(n-2);
return way1+way2;
}
public static void main(String args[])
{
int n=5;
System.out.println(callGuest(n));
}
}
