import java.util.Scanner;

public class Ejercicio_11 {
    static final double DESCUENTO_ESPECIAL = 0.1;

    public static double calculateSpecialDiscount(double price) {
        return price * DESCUENTO_ESPECIAL;
    }

    public static boolean validPrice(double price) {
        return price > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;

        do {
            System.out.print("Precio del producto: ");
            price = Double.parseDouble(sc.nextLine());
            if (!validPrice(price)) {
                System.out.println("Precio inválido.");
            }
        }
        while (!validPrice(price));

        double appliedDiscount = calculateSpecialDiscount(price);
        System.out.println("\nDescuento especial aplicado: " + appliedDiscount);
        System.out.println("Precio final con descuento: " + (price - appliedDiscount));
    }
}