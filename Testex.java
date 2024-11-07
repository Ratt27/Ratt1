class Testex extends Thread
{
public void run()
{
try{

for(int i=1;i<=5;i++)
{
System.out.println(i+":"+Thread.currentThread().getName());
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
Testex t1 = new Testex();
t1.start();
Testex t2 = new Testex
();
t2.start();

}
}