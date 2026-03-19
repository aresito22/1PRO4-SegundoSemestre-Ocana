import java.util.Scanner;

public class Ejercicio_08 {
    public static double calculateFinalPrice(double listPrice, double tax, double discount) {
        return listPrice + (listPrice * tax) - (listPrice * discount);
    }

    public static boolean validListPrice(double listPrice) {
        if (listPrice < 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean validTax(double tax) {
        if (tax < 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean validDiscount(double discount) {
        if (discount < 0 || discount > 100) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double listPrice;
        double tax;
        double discount;

        do {
            System.out.print("Precio base del producto: ");
            listPrice = Double.parseDouble(sc.nextLine());
            if (!validListPrice(listPrice)) {
                System.out.println("Precio inválido.");
            }
        }
        while (!validListPrice(listPrice));

        do {
            System.out.print("Impuesto en porcentaje: ");
            tax = Double.parseDouble(sc.nextLine()) / 100.0;
            if (!validTax(tax)) {
                System.out.println("Impuesto inválido.");
            }
        }
        while (!validTax(tax));

        do {
            System.out.print("Descuento en porcentaje: ");
            discount = Double.parseDouble(sc.nextLine());
            if (!validDiscount(discount)) {
                System.out.println("Descuento inválido.");
            }
        }
        while (!validDiscount(discount));
        discount = discount / 100.0;

        System.out.println("\nEl precio final del producto es: " + calculateFinalPrice(listPrice, tax, discount));
    }
}