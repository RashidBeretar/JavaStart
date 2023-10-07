/**
 * IAlive
 */
public interface IAlive {
    boolean alive = true;

    default void sayHi() {
        System.out.println("Привет!");
    }
}
