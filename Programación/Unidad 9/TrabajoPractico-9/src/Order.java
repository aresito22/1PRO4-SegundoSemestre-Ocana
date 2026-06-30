import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order implements Comparable<Order>, Identifiable<Integer> {
    private Integer id;
    private LocalDate date;
    private List<Product<?>> products;
    private double total;

    public Order() {
        this.date = LocalDate.now();
        this.products = new ArrayList<>();
        this.total = 0;
    }

    public Order(Integer id, double total, LocalDate date) {
        this.id = id;
        this.total = total;
        this.date = date;
        this.products = new ArrayList<>();
    }

    public void add(Product<?> product) {
        this.products.add(product);
        this.total += product.getPrice();
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public int compareTo(Order other) {
        return Double.compare(this.total, other.total);
    }

    @Override
    public Integer getId() {
        return id;
    }
}
