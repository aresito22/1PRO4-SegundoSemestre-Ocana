import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order extends Base implements Calculatable {
    private LocalDate date;
    private State state;
    private double total;
    private PaymentMethod paymentMethod;
    private List<OrderDetail> orderDetails;
    private Client client;

    public Order(State state, PaymentMethod paymentMethod, List<OrderDetail> orderDetails, Client client) {
        super();
        this.date = LocalDate.now();
        setState(state);
        setPaymentMethod(paymentMethod);
        setOrderDetails(orderDetails);
        setClient(client);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getTotal() {
        return total;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        if (orderDetails == null) {
            this.orderDetails = new ArrayList<>();
        }
        this.orderDetails = orderDetails;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("El cliente no puede ser null.");
        }
        this.client = client;
    }

    @Override
    public double calculateTotal() {
        total = 0;
        for (OrderDetail orderDetail : orderDetails) {
            total += orderDetail.getSubtotal();
        }
        return total;
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }

    public OrderDetail findOrderDetailByBook(Book book) {
        boolean found = false;
        for (OrderDetail orderDetail : orderDetails) {
            if (orderDetail.getBook().equals(book)) {
                found = true;
                return orderDetail;
            }
        }
        if (!found) {
            System.out.println("No se encontró el libro.");
        }
        return null;
    }

    public void deleteOrderDetailByBook(Book book) {
        boolean found = false;
        for (OrderDetail orderDetail : orderDetails) {
            if (orderDetail.getBook().equals(book)) {
                found = true;
                orderDetails.remove(orderDetail);
            }
        }
        if (!found) {
            System.out.println("No se encontró el libro.");
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", state=" + state +
                ", total=" + total +
                ", paymentMethod=" + paymentMethod +
                ", orderDetails=" + orderDetails +
                ", client=" + client +
                '}';
    }
}
