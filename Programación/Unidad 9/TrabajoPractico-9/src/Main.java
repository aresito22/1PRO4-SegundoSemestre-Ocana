import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // --- Productos ---
        Product<Integer> p1 = new Product<Integer>(1, "Leche", 1500.0);
        Product<Integer> p2 = new Product<Integer>(2, "Pan", 800.0);
        Product<Integer> p3 = new Product<Integer>(3, "Queso", 4500.0);

        // --- Carrito ---
        Cart<Product<Integer>> carrito = new Cart<>();
        carrito.add(p1);
        carrito.add(p2);
        carrito.add(p3);
        System.out.println("Total: $" + carrito.getTotal());

        carrito.remove(p2);
        System.out.println("Total tras eliminar Pan: $" + carrito.getTotal());

        // --- Pedidos ---
        List<Order> pedidos = new ArrayList<>();
        pedidos.add(new Order(1, 3200.0, LocalDate.of(2025, 3, 15)));
        pedidos.add(new Order(2, 1200.0, LocalDate.of(2025, 1, 10)));
        pedidos.add(new Order(3, 7800.0, LocalDate.of(2025, 6, 22)));

        // Ordenar por total via Comparable
        Collections.sort(pedidos);
        System.out.println("\nPedidos ordenados por total:");
        for (Order o : pedidos) {
            System.out.println("ID: " + o.getId() + " | Total: $" + o.getTotal());
        }

        // Ordenar por fecha via Comparator
        pedidos.sort(new OrderDateComparator());
        System.out.println("\nPedidos ordenados por fecha:");
        for (Order o : pedidos) {
            System.out.println("ID: " + o.getId() + " | Fecha: " + o.getDate());
        }

        // Buscar por ID
        Finder<Order, Integer> finder = new Finder<>();
        Order found = finder.find(pedidos, 2);
        if (found != null) {
            System.out.println("\nPedido encontrado: ID " + found.getId() + " | Total: $" + found.getTotal());
        } else {
            System.out.println("\nPedido no encontrado.");
        }
    }
}