package bestcalculate;

public class Model {
    Operation operation;

    
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}

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
