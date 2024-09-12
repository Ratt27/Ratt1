import java.util.*;
 abstract class Car
{
// it is not necessary to have abstract methods only in abstract class it can have non abstract or both
public abstract void drive();// abstract method,"abstract keyword is used for declaring a method"
// here we are putting a semicolon thereby declaring it not defining the method and no one should be able to create object of it

public void playMusic()
{
System.out.println("play music");
}
}

 abstract class Wagon extends Car
{
// class which extends the abstract class having abstract method should be responsbile for defining the abstract method which has been declared earlier only
// now wagon is responsible to define the drive method!
 public abstract void flying();
 public void drive()
{
System.out.println("Driving..");
}
}

// now if the above class is unavle to define all the abstract method then we ahve to create another class and use abstract keyword for the above class and then we cannot create object of that class again in main 

// oppposite of abstract class is concrete class so we can create object of concrete class

class UpdateWagon extends Wagon
{
public void flying()
{
System.out.println("flying...");
}
}

public class Abs
{
public static void main(String args[])
{
Wagon obj= new UpdateWagon();//type of reference: Wagon
// here we can't create object of abstract class
obj.drive();// here we are callig drive of Wagon but not Car
obj.playMusic();
obj.flying();
}
}