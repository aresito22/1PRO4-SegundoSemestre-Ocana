package Ejercicio_03;

public class ContractEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
