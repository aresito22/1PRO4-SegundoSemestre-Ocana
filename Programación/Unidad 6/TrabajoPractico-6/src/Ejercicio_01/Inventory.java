package Ejercicio_01;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        if (p != null) {
            products.add(p);
        } else {
            System.out.println(ErrorMessages.NULL_PRODUCT);
        }
    }

    public void listProducts() {
        System.out.println("Productos:");
        for(Product p : products) {
            p.showInfo();
        }
    }

    public void searchProductId(String id) {
        boolean productFound = false;
        for (Product p : products) {
            if (p.getId().equals(id)) {
                System.out.println("Producto encontrado:");
                System.out.println(p);
                productFound = true;
                break;
            }
        }

        if (!productFound) {
            System.out.println("Producto no encontrado.");
        }
    }

    public void deleteProduct(String id) {
        Product toDelete = null;
        for (Product p : products) {
            if (p.getId().equals(id)) {
                toDelete = p;
                break;
            }
        }

        if (toDelete != null) {
            products.remove(toDelete);
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void updateStock(String id, int newAmount) {
        Product toUpdate = null;
        for (Product p: products) {
            if (p.getId().equals(id)) {
                toUpdate = p;
                break;
            }
        }

        if (toUpdate != null) {
            if (newAmount >= 0) {
                toUpdate.setAmount(newAmount);
                System.out.println("Stock actualizado.");
            } else {
                System.out.println(ErrorMessages.NEGATIVE_VALUE);
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void filterByCategory(Category category) {
        System.out.println("Mostrando productos con categoría: " + category + ":");
        for (Product p : products) {
            if (p.getCategory().equals(category)) {
                p.showInfo();
            }
        }
    }

    public int getTotalStock() {
        int totalStock = 0;
        for (Product p : products) {
            totalStock += p.getAmount();
        }
        return totalStock;
    }

    public void showLargestStockProduct() {
        int largestStock = 0;
        Product largestStockProduct = null;
        for (Product p : products) {
            if (p.getAmount() > largestStock) {
                largestStockProduct = p;
                largestStock = largestStockProduct.getAmount();
            }
        }

        if (largestStockProduct != null) {
            System.out.println("Producto con mayor stock: ");
            System.out.println("  -" + largestStockProduct.getName());
            System.out.println("  -Stock: " + largestStockProduct.getAmount());
        } else {
            System.out.println(ErrorMessages.EMPTY_INVENTORY);
        }
    }

    public void filterByPrice(double min, double max) {
        if (max >= min) {
            System.out.println("Mostrando productos con precio mayor a " + min + " y menor a " + max + ":");
            for (Product p : products) {
                if (p.getPrice() >= min && p.getPrice() <= max) {
                    p.showInfo();
                }
            }
        } else {
            System.out.println(ErrorMessages.INVALID_MIN_MAX);
        }
    }

    public void showCategories() {
        System.out.println("Categorías disponibles:");
        for (Category c : Category.values()) {
            System.out.println("  -" + c + ": " + c.getDescription());
        }
    }
}