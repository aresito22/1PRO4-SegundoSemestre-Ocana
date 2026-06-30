import java.util.List;

public class Finder<T extends Identifiable<K>, K> {
    public T find(List<? extends T> list, K id) {
        for (T item : list) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}