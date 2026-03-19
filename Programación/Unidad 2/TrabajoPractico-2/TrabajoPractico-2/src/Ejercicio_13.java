public class Ejercicio_13 {
    public static void recursivePrintArray(double[] prices, int index) {
        if (index == prices.length) {
            return;
        }
        System.out.println("    Precio: " + prices[index]);
        recursivePrintArray(prices, index + 1);
    }

    public static void main(String[] args) {
        double[] prices = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales: ");
        recursivePrintArray(prices, 0);

        prices[2] = 150.0;

        System.out.println("\nPrecios modificados: ");
        recursivePrintArray(prices, 0);
    }
}