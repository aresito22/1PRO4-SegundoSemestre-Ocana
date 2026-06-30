public class Product<T> implements Identifiable<T> {
    private T id;
    private String name;
    double price;

    public Product(T id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public T getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
