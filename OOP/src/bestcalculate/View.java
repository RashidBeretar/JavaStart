package bestcalculate;

public class View {
    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }

    // Тут могло быть логирование
    public void printError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }
}