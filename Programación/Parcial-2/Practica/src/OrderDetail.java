import java.time.LocalDateTime;

public class OrderDetail extends Base {
    private int amount;
    private double subtotal;
    private Book book;

    public OrderDetail(int amount, Book book) {
        super();
        setAmount(amount);
        setBook(book);
        calculateSubtotal();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        this.amount = amount;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("El libro no puede ser null.");
        }
        this.book = book;
    }

    public void calculateSubtotal() {
        this.subtotal = book.getPrice() * this.amount;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "amount=" + amount +
                ", subtotal=" + subtotal +
                ", book=" + book +
                '}';
    }
}
