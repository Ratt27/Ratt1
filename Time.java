import java.util.Scanner;

class Time {
    int h, m;

    // Constructor
    public Time() {
        h = 0;
        m = 0;
    }

    // Method to take time input from the user
    void input() {
        System.out.println("Enter the time (hours and minutes): ");
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();
    }

    // Method to display the time
    void output() {
        System.out.println("Time: " + h + " hours and " + m + " minutes");
    }

    // Method to convert time to minutes
    int Time2Min() {
        return h * 60 + m;
    }

    // Method to convert minutes to time
    void Min2Time(int result) {
        h = result / 60;
        m = result % 60;
    }

    // Method to calculate the time difference
    void TimeDiff(Time ob1, Time ob2) {
        int X = ob1.Time2Min();
        int Y = ob2.Time2Min();
        int result;

        if (X > Y) {
            result = X - Y;
        } else {
            result = Y - X;
        }

        Min2Time(result);
    }

    // Main method
    public static void main(String[] args) {
        Time ob1 = new Time();
        Time ob2 = new Time();
        Time ob3 = new Time();

        ob1.input();
        ob2.input();
        ob3.TimeDiff(ob1, ob2);
        ob3.output();
    }
}
