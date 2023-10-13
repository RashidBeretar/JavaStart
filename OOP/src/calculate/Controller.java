package calculate;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model newModel, View view) {
        model = newModel;
        this.view = view;
    }

    public void calculate(double num1, double num2, char operator) {
        double result;
        try {
            switch (operator) {
                case '+':
                    result = model.add(num1, num2);
                    break;
                case '-':
                    result = model.subtract(num1, num2);
                    break;
                case '*':
                    result = model.multiply(num1, num2);
                    break;
                case '/':
                    result = model.divide(num1, num2);
                    break;
                default:
                    view.printError("Неверная операция");
                    return;
            }
            view.printResult(result);
        } catch (ArithmeticException e) {
            view.printError(e.getMessage());
            // calculate(num1, num2, operator); возможный пример повторного вызова функции
        }
    }
}