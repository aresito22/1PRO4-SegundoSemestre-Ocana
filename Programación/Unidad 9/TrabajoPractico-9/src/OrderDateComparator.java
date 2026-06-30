import java.util.Comparator;

public class OrderDateComparator implements Comparator<Order> {
    @Override
    public int compare(Order a, Order b) {
        return a.getDate().compareTo(b.getDate());
    }
}
