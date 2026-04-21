package Ejercicio_09;

public class Patient {
    private final String name;
    private final String healthInsurance;

    public Patient(String name, String healthInsurance) {
        this.name = name;
        this.healthInsurance = healthInsurance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "'}";
    }
}