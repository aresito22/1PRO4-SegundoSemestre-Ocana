package Ejercicio_03;

public class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}