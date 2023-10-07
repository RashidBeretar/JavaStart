public class main {
    public static void main(String[] args) {
        // T1
        Cat animal1 = new Cat("Барсик", 3);
        Owner man1 = new Owner("Василий");
        animal1.setOwner(man1);
        animal1.greet();
        // /T1

        // T2
        Rectangle rec = new Rectangle(15, 30);
        System.out.println(rec.getWidth());
        System.out.println(rec.getHeight());
        System.out.println(rec.calculateArea());
        System.out.println(rec.calculatePerimeter());
        // /T2
        
        // T3
        animal1.sayHi();
        man1.sayHi();
        // /T3
    }
}
