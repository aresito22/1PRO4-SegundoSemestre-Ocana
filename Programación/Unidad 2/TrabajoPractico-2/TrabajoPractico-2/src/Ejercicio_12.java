public class Ejercicio_12 {
    public static void main(String[] args) {
        double[] prices = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales: ");
        for (double price : prices) {
            System.out.println("    Precio: " + price);
        }

        prices[2] = 150.0;

        System.out.println("\nPrecios modificados:");
        for (double price : prices) {
            System.out.println("    Precio: " + price);
        }
    }
}