import java.util.Scanner;

public class Ejercicio_04 {
    public static void applyShowDiscount(double listPrice, char category) {
        double finalPrice;
        int discountAmount;

        switch (category) {
            case 'A':
                finalPrice = listPrice * 0.9;
                discountAmount = 10;
                break;
            case 'B':
                finalPrice = listPrice * 0.85;
                discountAmount = 15;
                break;
            case 'C':
                finalPrice = listPrice * 0.8;
                discountAmount = 20;
                break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }

        System.out.println("Precio original: "+ listPrice);
        System.out.println("Descuento aplicado: " + discountAmount + "%");
        System.out.println("Precio final: " + finalPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Precio original: ");
        double listPrice = Double.parseDouble(sc.nextLine());
        if (listPrice <= 0) {
            System.out.println("Precio inválido.");
            return;
        }

        System.out.print("Categoría: ");
        char category = sc.nextLine().toUpperCase().charAt(0);

        applyShowDiscount(listPrice, category);
    }
}