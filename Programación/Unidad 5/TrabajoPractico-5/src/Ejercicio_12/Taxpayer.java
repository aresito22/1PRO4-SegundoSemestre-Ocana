package Ejercicio_12;

public class Taxpayer {
    private final String name;
    private final String taxId;

    public Taxpayer(String name, String taxId) {
        this.name = name;
        this.taxId = taxId;
    }

    public String getName() {
        return name;
    }
}