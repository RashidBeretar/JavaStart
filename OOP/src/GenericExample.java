import java.util.List;

public class GenericExample<T> {
    public void printList(List<T> list) {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
