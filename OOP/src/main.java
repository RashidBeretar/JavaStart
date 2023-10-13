import java.util.List;

public class main {
    public static void main(String[] args) {
        // T1
        // Cat animal1 = new Cat("Барсик", 3);
        // Owner man1 = new Owner("Василий");
        // animal1.setOwner(man1);
        // animal1.greet();
        // /T1

        // T2
        // Rectangle rec = new Rectangle(15, 30);
        // System.out.println(rec.getWidth());
        // System.out.println(rec.getHeight());
        // System.out.println(rec.calculateArea());
        // System.out.println(rec.calculatePerimeter());
        // /T2
        
        // T3
        // animal1.sayHi();
        // man1.sayHi();
        // /T3
        
        // T4
        // IMyPredicate myPredicate = x -> x > 0;
        // System.out.println(myPredicate.whyamineeded(10));
        // /T4
        
        // T4
        Container<Integer> intContainer = new Container<Integer>(42);
        Container<String> stringContainer = new Container<>("Привет, мир!");
        Container<Double> doubleContainer = new Container<>(42.);

        intContainer.printElement();    // Вывод: Тип элемента: java.lang.Integer
        stringContainer.printElement(); // Вывод: Тип элемента: java.lang.String
        doubleContainer.printElement(); // Вывод: Тип элемента: java.lang.String

        
        GenericExample<Integer> intPrinter = new GenericExample<>();
        GenericExample<String> stringPrinter = new GenericExample<>();

        List<Integer> intList = List.of(1, 2, 3);
        List<String> stringList = List.of("Привет", "Мир");

        intPrinter.printList(intList); // Вывод: 1 2 3
        stringPrinter.printList(stringList); // Вывод: Привет Мир
        // T4
    }
}
