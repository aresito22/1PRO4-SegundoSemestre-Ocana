package Ejercicio_01;

public class Product {
    private String id;
    private String name;
    private double price;
    private int amount;
    private Category category;

    public Product(String id, String name, double price, int amount, Category category) {
        setId(id);
        setName(name);
        setPrice(price);
        setAmount(amount);
        setCategory(category);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!id.isEmpty()) {
            this.id = id;
        } else {
            System.out.println(ErrorMessages.EMPTY_FIELD);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println(ErrorMessages.EMPTY_FIELD);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println(ErrorMessages.NEGATIVE_VALUE);
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println(ErrorMessages.NEGATIVE_VALUE);
        }
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        if (category != null) {
            this.category = category;
        } else {
            System.out.println(ErrorMessages.NULL_CATEGORY);
        }
    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre:" + name);
        System.out.println("Precio: " + price);
        System.out.println("Cantidad en stock: " + amount);
        System.out.println("Categoría: " + category);
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", category=" + category +
                '}';
    }
}