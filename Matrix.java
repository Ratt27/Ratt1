import java.util.*;

class Matrix {
    int m, n;
    int mat[][];

    public static void main(String ar[]) {
        Matrix ob1 = new Matrix(2, 2); // Initialize a 2x2 matrix
        Matrix ob2 = new Matrix(2, 2); // Initialize another 2x2 matrix
        Matrix ob3 = new Matrix(2, 2); // Initialize a matrix for multiplication

        ob1.input();
        System.out.println("Original Matrix:");
        ob1.output();

        ob2.Transpose(ob1);
        System.out.println("\nTransposed Matrix:");
        ob2.output();

        ob3.Multiplication(ob1, ob2);
        System.out.println("\nMultiplication of Matrix:");
        ob3.output();

        if (ob1.isSymmetric()) {
            System.out.println("\nThe matrix is symmetric.");
        } else {
            System.out.println("\nThe matrix is not symmetric.");
        }
    }

    public Matrix(int x, int y) {
        m = x;
        n = y;
        mat = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element for position (" + i + "," + j + "):");
                mat[i][j] = sc.nextInt();
            }
        }
    }

    void output() {
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
        }
    }

    void Transpose(Matrix ob) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = ob.mat[j][i];
            }
        }
    }

    void Multiplication(Matrix p1, Matrix p2) {
        if (p1.n != p2.m) {
            System.out.println("Multiplication not possible.");
            return;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 0;
                for (int k = 0; k < p1.n; k++) {
                    mat[i][j] += p1.mat[i][k] * p2.mat[k][j];
                }
            }
        }
    }

    boolean isSymmetric() {
        if (m != n) {
            return false; // A non-square matrix can't be symmetric
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != mat[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
