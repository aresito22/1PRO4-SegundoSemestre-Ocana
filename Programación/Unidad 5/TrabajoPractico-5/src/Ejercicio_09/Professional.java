package Ejercicio_09;

public class Professional {
    private final String name;
    private final String specialty;

    public Professional(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Professional{name='" + name + "'}";
    }
}