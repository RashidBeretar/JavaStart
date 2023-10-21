package complexcalc;

public class Calculator {
    public ComplexDigit performOperation(Operation operation, ComplexDigit a, ComplexDigit b) {
        return operation.execute(a, b);
    }
}

interface Operation {
    ComplexDigit execute(ComplexDigit a, ComplexDigit b);
}

class Addition implements Operation {
    @Override
    public ComplexDigit execute(ComplexDigit a, ComplexDigit b) {
        double newReal = a.getReal() + b.getReal();
        double newImaginary = a.getImaginary() + b.getImaginary();

        ComplexDigit result = new ComplexDigit(newReal, newImaginary);

        LogFile logfile = LogFile.getInstance();
        logfile.logger("Складываем " + "(" + a + ") и (" + b + "). Получили " + result);

        return result;
    }
}

class Multiplication implements Operation {
    @Override
    public ComplexDigit execute(ComplexDigit a, ComplexDigit b) {
        double newReal = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double newImaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();

        ComplexDigit result = new ComplexDigit(newReal, newImaginary);

        LogFile logfile = LogFile.getInstance();
        logfile.logger("Умножаем " + "(" + a + ") и (" + b + "). Получили " + result);

        return result;
    }
}

class Division implements Operation {
    @Override
    public ComplexDigit execute(ComplexDigit a, ComplexDigit b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double newReal = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double newImaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;

        ComplexDigit result = new ComplexDigit(newReal, newImaginary);

        LogFile logfile = LogFile.getInstance();
        logfile.logger("Делим " + "(" + a + ") на (" + b + "). Получили " + result);

        return result;
    }
}
