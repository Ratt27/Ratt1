import java.util.*;
class ModifAssi31
{
    public static void main(String[] args)
    {
        Volume ob = new Volume(2);
        Volume ob1 = new Volume(3, 4);
        Volume ob2 = new Volume(2, 7, 6);
        Volume ob3= new Volume(ob);

        // Compute and display volumes for each instance
        ob.computeVolume();
        ob1.computeVolume();
        ob2.computeVolume();
        ob3.computeVolume();
    }
}

class Volume
{
    double length, width, height;

    // Constructor with one parameter
    Volume(double l)
    {
        length = l;
        width = 2;
        height = 4;
    }

    // Constructor with two parameters
    Volume(double l2, double w2)
    {
        length = l2;
        width = w2;
        height = 5;
    }

    // Constructor with three parameters
    Volume(double l3, double w3, double h3)
    {
        length = l3;
        width = w3;
        height = h3;
    }
 Volume(Volume Test)
    {
        length = Test.length;
        width = Test.width;
        height = Test.height;
    }



    // Method to compute and display the volume
    void computeVolume()
    {
        double volume = length * width * height;
        System.out.println("Volume: " + volume);
    }
}
