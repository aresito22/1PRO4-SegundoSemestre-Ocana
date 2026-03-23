import java.util.Scanner;

public class Ejercicio_10 {
    public static int updateStock(int currentStock, int amountSold, int amountReceived) {
        return currentStock - amountSold + amountReceived;
    }

    public static boolean validStockModification(int stock) {
        return stock < 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentStock;
        int amountSold;
        int amountReceived;

        do {
            System.out.print("Stock actual: ");
            currentStock = Integer.parseInt(sc.nextLine());
            if (validStockModification(currentStock)) {
                System.out.println("Stock inválido.");
            }
        }
        while (validStockModification(currentStock));

        do {
            System.out.print("Cantidad vendida: ");
            amountSold = Integer.parseInt(sc.nextLine());
            if (validStockModification(amountSold)) {
                System.out.println("Cantidad vendida inválida.");
            }
        }
        while (validStockModification(amountSold));

        do {
            System.out.print("Cantidad recibida: ");
            amountReceived = Integer.parseInt(sc.nextLine());
            if (validStockModification(amountReceived)) {
                System.out.println("Cantidad recibida inválida.");
            }
        }
        while (validStockModification(amountReceived));

        System.out.println("\nNuevo stock: " + updateStock(currentStock, amountSold, amountReceived));
    }
}