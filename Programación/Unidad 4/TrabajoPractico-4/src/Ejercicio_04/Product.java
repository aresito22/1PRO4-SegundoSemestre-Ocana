package Ejercicio_04;

public class Product {
    private String name;
    private double basePrice;
    private static double vat = 0.21;

    public Product(String name) {
        this(name, 100.0);
    }

    public Product(String name, double basePrice) {
        setName(name);
        setBasePrice(basePrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            System.out.println("Nombre actualizado.");
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice >= 0) {
            this.basePrice = basePrice;
            System.out.println("Precio base actualizado.");
        } else {
            System.out.println("Error: precio base inválido.");
        }
    }

    public static double getVat() {
        return vat;
    }

    public static void setVat(double vat) {
        if (vat >= 0 && vat <= 1) {
            Product.vat = vat;
            System.out.println("IVA actualizado.");
        } else {
            System.out.println("Error: el IVA tiene que estar entre 0 y 1.");
        }
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage >= 0 && discountPercentage <= 100) {
            double multiplier = ((100 - discountPercentage) / 100);
            basePrice *= multiplier;
        } else {
            System.out.println("Descuento inválido.");
        }
    }

    public void applyDiscount(double discountPercentage, double priceFloor) {
        if (discountPercentage >= 0 && discountPercentage <= 100) {
            double multiplier = (100 - discountPercentage) / 100;
            double salePrice = basePrice * multiplier;
            basePrice = Math.max(salePrice, priceFloor);
        } else {
            System.out.println("Descuento inválido.");
        }
    }

    public double calculateFinalPrice() {
        return basePrice + (basePrice * vat);
    }

    @Override
    public String toString() {
        return "[ Nombre: " + name + " | Precio base: " + basePrice + " | Precio final: " + calculateFinalPrice() + " ]";
    }
}
