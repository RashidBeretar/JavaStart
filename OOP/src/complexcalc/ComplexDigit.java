package complexcalc;

public class ComplexDigit {
    private double real;
    private double imaginary;

    public ComplexDigit(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return getReal() + " + " + getImaginary() + "i";
    }
}
