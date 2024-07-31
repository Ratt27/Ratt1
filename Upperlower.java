//convert all uppercase to lowercase and vice versa
import java.util.*;
class Upperlower
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s,s1="";
System.out.println("enter the string");
s=sc.nextLine();
for(int i =0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch>=65&&ch<=90)
{
ch=(char)(ch+32);}
else if(ch>=97&& ch<=122)
{
ch=(char)(ch-32);
}
s1=s1+ch;
//s1=ch+s1: to reverse the string

}
System.out.println(s1);
}
}