package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        Product testProduct1 = new Product("Computadora", 1200.0);
        Product testProduct2 = new Product("Auriculares");

        testProduct1.applyDiscount(10.0);
        testProduct2.applyDiscount(50.0, 75.0);

        Product invalidProduct = new Product("Inválido", -50.0);

        System.out.println(testProduct1);
        System.out.println(testProduct2);
        Product.setVat(0.25);
        System.out.println(testProduct1);
        System.out.println(testProduct2);
    }
}
