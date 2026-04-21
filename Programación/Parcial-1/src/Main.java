public class Main {
    public static void main(String[] args) {
        Product.showCategories();
        System.out.println(" ");

        Product testProduct1 = new Product(1, "Computadora", "Electrónica", 5, 1500);
        Product testProduct2 = new Product(2, "Bloc", "Librería", 15, 10);
        Product testProduct3 = new Product("Reloj", "Indumentaria", 3);

        // Pruebas de productos inválidos
        Product testProduct4 = new Product(11, "Auto", "Vehículos", 5, 20000);
        Product testProduct5 = new Product("", "Hogar", 20);
        System.out.println(" ");

        testProduct1.applyDiscount(25.0);
        testProduct3.applyDiscount(15);

        // Prueba de descuentos inválidos
        testProduct2.applyDiscount(-1);
        testProduct2.applyDiscount(101);
        System.out.println(" ");

        System.out.println(testProduct1);
        System.out.println(testProduct2);
        System.out.println(testProduct3);
        System.out.println(" ");

        Product.showTotalProducts();
    }
}
