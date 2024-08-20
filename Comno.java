import java.util.*;

class Complex {
    int real, imaginary;

    // Parameterized constructor
    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    String GetValue() {
        return real + "+" + imaginary + "i";
    }

    // Method to add two complex numbers
    static Complex ComplexAdd(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    // Method to subtract two complex numbers
    static Complex ComplexSub(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    // Method to multiply two complex numbers
    static Complex ComplexPro(Complex c1, Complex c2) {
        int realPart = c1.real * c2.real - c1.imaginary * c2.imaginary;
        int imaginaryPart = c1.real * c2.imaginary + c1.imaginary * c2.real;
        return new Complex(realPart, imaginaryPart);
    }

    // Method to calculate the modulus of a complex number
    static double Complexmodulo(Complex n) {
        return Math.sqrt(Math.pow(n.real, 2) + Math.pow(n.imaginary, 2));
    }

    // Method to find the conjugate of a complex number
    Complex conjugate() {
        return new Complex(real, -imaginary);
    }
}
   
public class Comno {
    public static void main(String args[]) {
        Complex a = new Complex(5, 7);
        Complex b = new Complex(6, 2);
        Complex c = Complex.ComplexAdd(a, b); // Addition
        Complex d = Complex.ComplexSub(a, b); // Subtraction
        Complex e = Complex.ComplexPro(a, b); // Multiplication
        double f = Complex.Complexmodulo(a);

        System.out.println(a.GetValue()); // Prints: 5+7i
        System.out.println(b.GetValue()); // Prints: 6+2i
        System.out.println(c.GetValue()); // Prints: 11+9i
        System.out.println(d.GetValue()); // Prints: -1+5i
        System.out.println(e.GetValue()); // Prints: 16+44i
        System.out.println("Modulus of a: " + f);

        
        System.out.println("Conjugate of a: " + a.conjugate().GetValue());
        System.out.println("Conjugate of b: " + b.conjugate().GetValue());
        System.out.println("Conjugate of c: " + c.conjugate().GetValue());
        System.out.println("Conjugate of d: " + d.conjugate().GetValue());
        System.out.println("Conjugate of e: " + e.conjugate().GetValue());

           }
}
