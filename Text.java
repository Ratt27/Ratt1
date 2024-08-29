import java.util.*;

class Text {
public static void main(String args[])
{
Text t1 = new Text("madam");
Text t2;
t2=t1.getReverse();
if(t1.isPalindrome(t2))
{
System.out.println("yes palindrome");
}
else
{
System.out.println("No palindrome");
}
}
    String str;

        Text(String word) {
        str = word;
    }

        void display() {
        System.out.println(str);
    }
       Text getReverse()
{
Text ob2= new Text("");
for (int i=0;i<str.length();i++)
{
ob2.str=str.charAt(i)+ob2.str;

}
return ob2;
}


        Boolean isPalindrome(Text t) {
      
        return str.equals(t.str);
            }

   }
