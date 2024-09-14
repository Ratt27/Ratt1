// use of FINAL keyword: how to stop allow inheriting from ur class
//final variable -> making it constant
//final method-> to stop overriding
// final class-> to stop inheritance
 class Calc
{
public final void show()// no one can override this final method!
{
System.out.println("in calc show");
}
public void add( int a, int b)
{
System.out.println(a+b);
}
}
class AdvCalc extends Calc
{
public  void show()
{
System.out.println("by john");
}

}
public class Fin
{
public static void main(String args[])
{
Calc obj = new AdvCalc();
obj.show();
obj.add(4,5);
}
}