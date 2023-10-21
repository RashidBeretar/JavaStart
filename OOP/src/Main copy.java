

import bestcalculate.Controller;
import bestcalculate.Model;
import bestcalculate.View;

interface Operation {
  double execute(double a, double b);
}

class Addition implements Operation {
  @Override
  public double execute(double a, double b) {
    return a + b;
  }
}

class Subtraction implements Operation {
  @Override
  public double execute(double a, double b) {
    return a - b;
  }
}

class Multiplication implements Operation {
  @Override
  public double execute(double a, double b) {
    return a * b;
  }
}

class Calculator {
  public double performOperation(Operation operation, double a, double b) {
    return operation.execute(a, b);
  }
}

public class Main {
  public static void main(String[] args) {
    double a = 18;
    double b = 3;
    Operation addition = new Addition();
    Calculator calculator = new Calculator();
    double result = calculator.performOperation(addition, a, b);
    System.out.println("Результат: " + result);




    
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);

    double num1 = 10;
    double num2 = 2;
    char operator = '/';

    controller.calculate(num1, num2, operator);
  }
}
