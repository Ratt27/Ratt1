import java.util.Scanner;

class Room {
    double length;
    double breadth;

    public Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double cal_area() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Room area: " + cal_area() + " square units.");
    }
}

class Bedroom extends Room {
    boolean hasAttachedBathroom;
    boolean hasStudyTable;
    boolean hasNightLamp;
    int numAttachedBathrooms;
    int numStudyTables;
    int numNightLamps;

    public Bedroom(double length, double breadth, boolean a, boolean b, boolean c) {
        super(length, breadth);
        hasAttachedBathroom = a;
        hasStudyTable = b;
        hasNightLamp = c;
    }

    public void setBedroomDetails(int bathrooms, int tables, int lamps) {
        if (hasAttachedBathroom) {
            numAttachedBathrooms = bathrooms;
        }
        if (hasStudyTable) {
            numStudyTables = tables;
        }
        if (hasNightLamp) {
            numNightLamps = lamps;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bedroom features:");
        System.out.println("Attached Bathroom: " + (hasAttachedBathroom ? "Yes, Number: " + numAttachedBathrooms : "No"));
        System.out.println("Study Table: " + (hasStudyTable ? "Yes, Number: " + numStudyTables : "No"));
        System.out.println("Night Lamp: " + (hasNightLamp ? "Yes, Number: " + numNightLamps : "No"));
    }
}

class DrawingRoom extends Room {
    boolean hasSofa;
    boolean hasWallCabinet;
    int numSofas;
    int numWallCabinets;

    public DrawingRoom(double length, double breadth, boolean m, boolean n) {
        super(length, breadth);
        hasSofa = m;
        hasWallCabinet = n;
    }

    public void setDrawingRoomDetails(int sofas, int cabinets) {
        if (hasSofa) {
            numSofas = sofas;
        }
        if (hasWallCabinet) {
            numWallCabinets = cabinets;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Drawing Room features:");
        System.out.println("Sofa: " + (hasSofa ? "Yes, Number: " + numSofas : "No"));
        System.out.println("Wall Cabinet: " + (hasWallCabinet ? "Yes, Number: " + numWallCabinets : "No"));
    }
}

public class Roomdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bedroom input
        Bedroom myBedroom = new Bedroom(12.0, 15.0, true, true, true);
        System.out.println("Bedroom Details:");

        if (myBedroom.hasAttachedBathroom) {
            System.out.print("Enter the number of attached bathrooms: ");
            int bathrooms = sc.nextInt();
            myBedroom.numAttachedBathrooms = bathrooms;
        }

        if (myBedroom.hasStudyTable) {
            System.out.print("Enter the number of study tables: ");
            int tables = sc.nextInt();
            myBedroom.numStudyTables = tables;
        }

        if (myBedroom.hasNightLamp) {
            System.out.print("Enter the number of night lamps: ");
            int lamps = sc.nextInt();
            myBedroom.numNightLamps = lamps;
        }

        myBedroom.display();
        System.out.println();

        // Drawing room input
        DrawingRoom myDrawingRoom = new DrawingRoom(20.0, 25.0, true, true);
        System.out.println("Drawing Room Details:");

        if (myDrawingRoom.hasSofa) {
            System.out.print("Enter the number of sofas: ");
            int sofas = sc.nextInt();
            myDrawingRoom.numSofas = sofas;
        }

        if (myDrawingRoom.hasWallCabinet) {
            System.out.print("Enter the number of wall cabinets: ");
            int cabinets = sc.nextInt();
            myDrawingRoom.numWallCabinets = cabinets;
        }

        myDrawingRoom.display();
    }
}
