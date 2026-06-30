import java.util.ArrayList;
import java.util.List;

public class Cart<T extends Product<?>> {
    private List<T> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void add(T product) {
        this.products.add(product);
    }

    public void remove(T product) {
        this.products.remove(product);
    }

    public double getTotal() {
        double total = 0;
        for (T p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
