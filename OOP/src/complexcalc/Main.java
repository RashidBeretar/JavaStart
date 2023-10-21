package complexcalc;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        ComplexDigit a = new ComplexDigit(4, 1);
        ComplexDigit b = new ComplexDigit(8, -7);

        System.out.println("Результат: " + calculator.performOperation(new Addition(), a, b));
        System.out.println("Результат: " + calculator.performOperation(new Multiplication(), a, b));
        System.out.println("Результат: " + calculator.performOperation(new Division(), a, b));
    }
}
