import java.util.*;

public class Volumewith {
    public static void main(String args[]) {
        Volume ob1 = new Volume();
        ob1.Takeinput();
        ob1.Computevolume();
        ob1.Comparevolume();
    }
}

class Volume {
    // Instance variables
    double height, width, depth, height2;
    double vol1, vol2;

    void Takeinput() {
        System.out.println("Enter the dimensions of cuboid:");
        Scanner sc = new Scanner(System.in);
        height = sc.nextDouble();
        width = sc.nextDouble();
        depth = sc.nextDouble();
        System.out.println("Enter the dimension of cube:");
        height2 = sc.nextDouble();
        sc.close();
    }

    void Computevolume() {
        vol1 = height * width * depth;
        vol2 = height2 * height2 * height2;
        System.out.println("Volume of cuboid is: " + vol1);
        System.out.println("Volume of cube is: " + vol2);
    }

    void Comparevolume() {
        if (vol1 < vol2) {
            System.out.println("Cube is greater than cuboid");
        } else if (vol1 > vol2) {
            System.out.println("Cuboid is greater than cube");
        } else {
            System.out.println("Both volumes are equal");
        }
    }
}
