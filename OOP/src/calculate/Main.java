package calculate;

public class Main {
  public static void main(String[] args) {
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);

    double num1 = 10;
    double num2 = 2;
    char operator = '/';

    controller.calculate(num1, num2, operator);
  }
}
