package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private LocalDate date;
    private double total;
    private List<OrderItem> items;

    public Order() {
        this.date = LocalDate.now();
        this.items = new ArrayList<>();
        this.total = 0.0;
    }

    public void addItem(OrderItem item) {
        items.add(item);
        total += item.getSubtotal();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public List<OrderItem> getItems() { return items; }
    public void setItems(List<OrderItem> items) { this.items = items; }

    @Override
    public String toString() {
        return "Order{id=" + id + ", date=" + date + ", total=" + total + ", items=" + items + "}";
    }
}