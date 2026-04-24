package Ejercicio_01;

// TAREAS A REALIZAR
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // 1
        Product testProduct1 = new Product("F1", "Oreos", 5.0, 15, Category.FOOD);
        Product testProduct2 = new Product("E1", "Laptop", 1200.0, 10, Category.ELECTRONICS);
        Product testProduct3 = new Product("C1", "Zapatos", 50.0, 20, Category.CLOTHES);
        Product testProduct4 = new Product("H1", "Foco", 10.0, 30, Category.HOME);
        Product testProduct5 = new Product("H2", "Sábanas", 30.0, 25, Category.HOME);

        inventory.addProduct(testProduct1);
        inventory.addProduct(testProduct2);
        inventory.addProduct(testProduct3);
        inventory.addProduct(testProduct4);
        inventory.addProduct(testProduct5);

        // 2
        inventory.listProducts();
        // 3
        inventory.searchProductId("C1");
        // 4
        inventory.filterByCategory(Category.HOME);
        // 5
        inventory.deleteProduct("H1");
        inventory.listProducts();
        // 6
        inventory.updateStock("F1", 35);
        // 7
        System.out.println("Total de stock: " + inventory.getTotalStock());
        // 8
        inventory.showLargestStockProduct();
        // 9
        inventory.filterByPrice(1000, 3000);
        // 10
        inventory.showCategories();

    }
}
