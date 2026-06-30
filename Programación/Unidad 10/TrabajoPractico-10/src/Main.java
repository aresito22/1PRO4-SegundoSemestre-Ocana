import model.Category;
import model.Order;
import model.OrderItem;
import model.Product;
import service.*;

public class Main {
    public static void main(String[] args) {
        CategoryService categoryService = new CategoryServiceImpl();
        ProductService productService = new ProductServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        try {
            // --- CATEGORÍAS ---
            System.out.println("=== Creando Categorías ===");
            Category electronics = new Category("Electrónica", "Dispositivos y accesorios electrónicos");
            Category food = new Category("Alimentos", "Productos comestibles y bebidas");

            categoryService.create(electronics);
            categoryService.create(food);
            System.out.println("Creada: " + electronics);
            System.out.println("Creada: " + food);

            // --- PRODUCTOS ---
            System.out.println("\n=== Creando Productos ===");
            Product laptop = new Product("Laptop", "Laptop de alto rendimiento", 1500.0, 10, electronics.getId());
            Product phone = new Product("Teléfono", "Smartphone 128GB", 800.0, 20, electronics.getId());
            Product coffee = new Product("Café", "Café molido premium 500g", 15.0, 100, food.getId());

            productService.create(laptop);
            productService.create(phone);
            productService.create(coffee);
            System.out.println("Creado: " + laptop);
            System.out.println("Creado: " + phone);
            System.out.println("Creado: " + coffee);

            // --- LISTAR PRODUCTOS POR CATEGORÍA ---
            System.out.println("\n=== Productos de Electrónica ===");
            productService.listByCategory(electronics.getId())
                    .forEach(System.out::println);

            // --- CREAR PEDIDO (exitoso) ---
            System.out.println("\n=== Creando Pedido ===");
            Order order1 = new Order();
            OrderItem item1 = new OrderItem(laptop.getId(), 2, laptop.getPrice() * 2);
            OrderItem item2 = new OrderItem(coffee.getId(), 5, coffee.getPrice() * 5);
            order1.addItem(item1);
            order1.addItem(item2);

            orderService.create(order1);

            // --- MOSTRAR DETALLE DEL PEDIDO ---
            System.out.println("\n=== Detalle del Pedido ===");
            orderService.showDetail(order1.getId());

            // --- CREAR PEDIDO (simulación de rollback por stock insuficiente) ---
            System.out.println("\n=== Simulando Stock Insuficiente ===");
            try {
                Order order2 = new Order();
                // el teléfono tiene 20 unidades en stock, se solicitan 999
                OrderItem item3 = new OrderItem(phone.getId(), 999, phone.getPrice() * 999);
                order2.addItem(item3);
                orderService.create(order2);
            } catch (Exception e) {
                System.out.println("Error esperado: " + e.getMessage());
            }

            // --- LISTAR TODOS LOS PEDIDOS ---
            System.out.println("\n=== Todos los Pedidos ===");
            orderService.list().forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}