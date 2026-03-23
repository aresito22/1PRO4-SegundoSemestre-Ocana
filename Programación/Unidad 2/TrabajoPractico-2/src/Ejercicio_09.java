import java.util.Scanner;

public class Ejercicio_09 {
   public static double calculateShippingCost(double weight, String zone) {
       return switch (zone) {
           case "nacional" -> weight * 5.0;
           case "internacional" -> weight * 10.0;
           default -> 0.0; // Inalcanzable — la entrada es validada antes de llamar a este método
       };
   }

   public static double calculateFinalCost (double productPrice, double shippingCost) {
       return productPrice + shippingCost;
   }

   public static boolean validProductPrice (double productPrice) {
       return productPrice > 0;
   }

    public static boolean validWeight (double weight) {
        return weight > 0;
    }

   public static boolean validZone(String zone) {
       return zone.equals("nacional") || zone.equals("internacional");
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double productPrice;
       double productWeight;
       String zone;

       do {
           System.out.print("Precio del producto: ");
           productPrice = Double.parseDouble(sc.nextLine());
           if (!validProductPrice(productPrice)) {
               System.out.println("Precio inválido.");
           }
       }
       while (!validProductPrice(productPrice));

       do {
           System.out.print("Peso del producto: ");
           productWeight = Double.parseDouble(sc.nextLine());
           if (!validWeight(productWeight)) {
               System.out.println("Peso inválido.");
           }
       }
       while (!validWeight(productWeight));

       do {
           System.out.print("Zona: ");
           zone = (sc.nextLine()).toLowerCase();
           if (!validZone(zone)) {
               System.out.println("Zona inválida.");
           }
       }
       while (!validZone(zone));

       double shippingCost = calculateShippingCost(productWeight, zone);
       System.out.println("\nEl costo de envío es: " + shippingCost);
       System.out.println("El precio final es: " + calculateFinalCost(productPrice, shippingCost));
   }
}