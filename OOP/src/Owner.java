public class Owner implements IAlive {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
}
