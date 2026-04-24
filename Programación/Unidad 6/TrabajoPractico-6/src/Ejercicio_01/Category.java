package Ejercicio_01;

public enum Category {
    FOOD("Productos comestibles"),
    ELECTRONICS("Dispositivos electrónicos"),
    CLOTHES("Prendas de vestir"),
    HOME("Artículos para el hogar");

    private final String description;

    private Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
