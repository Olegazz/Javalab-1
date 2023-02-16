import java.util.Scanner;

public class Complex {
    static class MyExceptionClass extends Exception{

    };
    double re, im;
    public Complex(double real, double imag){
        re = real;
        im = imag;
    }
    public String toString(){
        if (im == 0){
            return re + "";
        }
        if(re == 0){
            return im + "i";
        }
        if(im < 0){
            return re + " - " + (-im) + "i";
        }
        return re + " + " + im + "i";
    }
    public Complex plus(Complex b){
        Complex a = this;
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex(real, imag);
    }
    public Complex multi(Complex b){
        Complex a = this;
        double real = a.re * b.re;
        double imag = a.im * b.im;
        return new Complex(real, imag);
    }
    public String trigonom(Complex b){
        double r = Math.sqrt(b.re * b.re + b.im * b.im);
        double cos = b.re/r;
        double sin = b.im/r;
        return (r + "*(" + cos + (sin>=0 ? "+" : "") + sin + "*i)");
    }
    public static void main(String[] args) throws MyExceptionClass{
        while (true) {
            System.out.println("Complex_numbers -1, ComplexMatrix - 2");
            Scanner console = new Scanner(System.in);
            int flag;
            flag = console.nextInt();
            if (flag == 1) {
                System.out.println("Enter two variables for the first complex number: ");
                Complex a = new Complex(console.nextInt(), console.nextInt());
                System.out.println("Enter two variables for the second complex number: ");
                Complex b = new Complex(console.nextInt(), console.nextInt());
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("a + b = " + b.plus(a));
                System.out.println("a * b = " + b.multi(a));
                System.out.println("trigonometricForm a = " + b.trigonom(a));
                System.out.println("trigonometricForm b = " + b.trigonom(b));
            }
            if (flag == 2) {
                Complex_matrix.Complex_mat();
            }
        }

    }
}