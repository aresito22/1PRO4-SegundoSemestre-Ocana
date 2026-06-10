package Ejercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Order implements Payable, Notifiable {
    private List<Product> products;
    private Client client;
    private String status;

    public Order(Client client) {
        this.products = new ArrayList<>();
        this.client = client;
        this.status = "Creado";
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo.");
        }
        this.products.add(product);
    }

    public void setStatus(String status) {
        this.status = status;
        client.notify(status);
    }

    @Override
    public void notify(String status) {
        System.out.println("Order status changed to: " + status);
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.calculateTotal();
        }
        return total;
    }
}
