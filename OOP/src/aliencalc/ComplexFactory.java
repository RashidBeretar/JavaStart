package aliencalc;

abstract class ComplexFactory {
    abstract Complex add(Complex other);
    abstract Complex subtract(Complex other);
    abstract Complex multiply(Complex other);
    abstract Complex divide(Complex other);
}