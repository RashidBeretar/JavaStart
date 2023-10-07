public class Cat {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void greet() {
        System.out.println("Мяу! Меня зовут " +  this.name + ". Мне " +  this.age + " года (лет). Мой владелец - " +  this.owner + ".");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
