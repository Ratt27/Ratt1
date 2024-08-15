public class Recursion6
{
 public static boolean[] map = new boolean[26];//declaration and initialization of array
public static void removeDuplicates( String str, int idx, String newString)
{
if(idx==str.length())//base case:
{
System.out.println(newString);// when we reach the last index:
return;
}
char currChar= str.charAt(idx);
if(map[currChar-'a']==true)
{
removeDuplicates(str,idx+1,newString);
}
else
{
newString+=currChar;
map[currChar-'a']=true;
removeDuplicates(str,idx+1,newString);
}
}
 public static void main(String args[])
{
String str="abbccddeeff";
removeDuplicates(str,0,"");
}
}
