package Ejercicio_04;

public class Bank {
    private String name;
    private String cuit;

    public Bank(String name, String cuit) {
        this.name = name;
        this.cuit = cuit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        if (!cuit.isEmpty()) {
            this.cuit = cuit;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", cuit='" + cuit + '\'' +
                '}';
    }
}