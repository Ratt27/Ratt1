import java.util.*;
public class Patterns{
public static void main(String args[])
{
int n,m;
System.out.println("enter the values of n and m:");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
m=sc.nextInt();


for(int i=1;i<=n;i++)//solid rectangle
{
for(int j=1;j<=m;j++)
{
System.out.print("*");
}
System.out.println();
}



for(int i=1;i<=n;i++)//hollow rectangle
{
for(int j=1;j<=m;j++)
{
if(i==1 || j==1 || i==n || j==m)
{System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}



for(int i=n;i>=1;i--)//inverted triangle
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}



for(int i=1;i<=n;i++)//mirror triangle
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}



for(int i=1;i<=n;i++)//half pyramid with numbers
{
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
int number=1;//flyods triangle
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(number+" ");
number++;
}
System.out.println();
}



for(int i=1;i<=n;i++)//01printing
{
for(int j=1;j<=i;j++)
{
int sum=i+j;
if(sum%2==0)
{
System.out.print("1 ");
}
else
{
System.out.print("0 ");
}

}
System.out.println();
}


for(int i=1;i<=n;i++)//Butterfly pattern
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
int spaces=2*(n-i);
for(int j=1;j<=spaces;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}

for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
int spaces=2*(n-i);
for(int j=1;j<=spaces;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int j=1;j<=n;j++)
{
System.out.print("*");
}
System.out.println();
}


for(int i=1;i<=n;i++)//number pyramid
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.println();
}


for(int i=1;i<=n;i++)//palindromic pyramid
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int j=i;j>=1;j--)
{
System.out.print(j);
}
for(int j=2;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}


for (int i = 1; i <= n; i++) // Top part of the diamond
{
    for (int j = 1; j <= n - i; j++)
    {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
for (int i = n - 1; i >= 1; i--) // Bottom part of the diamond
{
    for (int j = 1; j <= n - i; j++)
    {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++)
    {
        System.out.print("*");
    }
    System.out.println();
}


}
}