import java.util.*;
public class VolumeofBox
{
public static void main(String args[])
{
Volume ob1=new Volume(4,2,3);

ob1.Computevolume();
if(ob1.vol1>ob1.vol2)
{
System.out.println("volume of cuboid is greater than cube");
}
else if(ob1.vol1<ob1.vol2)
{
System.out.println("volume of cuboid is lesser than cube");
}
else
{
System.out.println("volume of cuboid is equal to  cube");
}

}
}
class Volume
{
double height,width,depth,vol1,vol2;
Volume(double h, double w, double d)
{
height=h;
width=w;
depth=d;
}
Volume(double h)
{
height=h;
}
void Computevolume()
{
vol1=height*width*depth;
System.out.println("Volume of cuboid is :"+vol1);
vol2=height*height*height;
System.out.println("Volume of cube is :"+vol2);
}

}
