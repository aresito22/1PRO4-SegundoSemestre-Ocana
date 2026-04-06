package Ejercicio_01;

public class Employee {
    private final int id;
    private String name;
    private String role;
    private double salary;

    private static int totalEmployees;

    public Employee(String name, String role) {
        this(name, role, 0);
    }

    public Employee(String name, String role, double salary) {

        setName(name);
        setRole(role);
        setSalary(salary);
        totalEmployees++;
        id = totalEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("\nError: campo vacío.");
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (!role.isEmpty()) {
            this.role = role;
        } else {
            System.out.println("\nError: campo vacío.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: salario igual o menor a 0");
        }
    }

    public void increaseSalary(double percentageIncrease) {
        if (percentageIncrease > 0) {
            double multiplier = (percentageIncrease / 100) + 1;
            salary *= multiplier;
            System.out.println("\nSalario de " + name + " actualizado. Nuevo salario: " + salary);
        } else {
            System.out.println("\nError: aumento igual o menor a 0");
        }
    }

    public void increaseSalary(int amountIncrease) {
       if (amountIncrease > 0) {
           salary += amountIncrease;
           System.out.println("\nSalario de " + name + " actualizado. Nuevo salario: " + salary);
       } else {
           System.out.println("\nError: aumento igual o menor a 0");
       }
    }

    public static void showTotalEmployees() {
        System.out.println("\nTotal de empleados: "+ totalEmployees);
    }

    @Override
    public String toString() {
        return "\n[ Nombre:  " + name + " | Puesto: " + role + " | Salario: " + salary + " | ID: " + id + " ]";
    }
}