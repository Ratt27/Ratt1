import java.util.*;
class Palindromes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s,s1="",s2="";
System.out.println("enter the string");
s=sc.nextLine();
for(int i =0;i<s.length();i++)
{
char ch=s.charAt(i);
s1=s1+ch;
s2=ch+s2;
}
if(s1.equals(s2))
{
System.out.println("its  palindrome");

}
else
{
System.out.println("No palindrome");

}
}
}

