public class Product {
    private final int CODE;
    private String description;
    private String category;
    private int stockAmount;
    private double unitPrice;

    private static int totalProducts = 0;
    private static final String[] PERMISSIBLE_CATEGORIES = {"Electrónica", "Librería", "Indumentaria", "Hogar"};

    private static final String ERROR_1 = "Error: campo vacío.";
    private static final String ERROR_2 = "Error: el número no puede ser igual o menor a 0.";
    private static final String ERROR_3 = "Error: categoría no permitida.";
    private static final String ERROR_4 = "Error: precio resultante menor a 0.";

    public Product(String description, String category, int stockAmount) {
        this(totalProducts + 1, description, category, stockAmount, 50.0);
    }

    public Product(int CODE, String description, String category, int stockAmount, double unitPrice) {
        this.CODE = CODE;
        setDescription(description);
        setCategory(category);
        setStockAmount(stockAmount);
        setUnitPrice(unitPrice);
        totalProducts += 1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (!description.isEmpty()) {
            this.description = description;
        } else {
            System.out.println(ERROR_1);
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        boolean categoryPermitted = false;
        if (!category.isEmpty()) {
            for (String permissibleCategory : PERMISSIBLE_CATEGORIES) {
                if (permissibleCategory.equals(category)) {
                    categoryPermitted = true;
                    break;
                }
            }
            if (categoryPermitted) {
                this.category = category;
            } else {
                System.out.println(ERROR_3);
            }
        } else {
            System.out.println(ERROR_1);
        }
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        if (stockAmount >= 0) {
            this.stockAmount = stockAmount;
        } else {
            System.out.println(ERROR_2);
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        } else {
            System.out.println(ERROR_2);
        }
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public int getCODE() {
        return CODE;
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage <= 100 && discountPercentage >= 0) {
            double discount = (100 - discountPercentage) / 100;
            unitPrice *= discount;
        } else {
            System.out.println(ERROR_2);
        }
    }

    public void applyDiscount(int discountAmount) {
        if (discountAmount >= 0) {
            double newPrice = unitPrice - discountAmount;
            if (newPrice >= 0) {
                unitPrice = newPrice;
            } else {
                System.out.println(ERROR_4);
            }
        } else {
            System.out.println(ERROR_2);
        }
    }

    public static void showTotalProducts() {
        System.out.println("Productos totales: " + totalProducts);
    }

    public static void showCategories() {
        System.out.println("Categorías posibles: ");
        for (String permissibleCategory : PERMISSIBLE_CATEGORIES) {
            System.out.println("    -" + permissibleCategory);
        }
    }

    @Override
    public String toString() {
        return "Producto:" +
                "Código: " + CODE +
                ", Descripción: " + description + '\'' +
                ", Categoría: " + category + '\'' +
                ", Stock: " + stockAmount +
                ", Precio unitario: " + unitPrice;
    }
}
