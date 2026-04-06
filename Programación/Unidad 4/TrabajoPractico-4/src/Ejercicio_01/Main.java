package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Employee testEmployee1 = new Employee("Marcos", "Developer");
        Employee testEmployee2 = new Employee("Catalina", "Manager", 1500.50);

        testEmployee2.increaseSalary(-500); // Inválido
        testEmployee2.increaseSalary(0); // Inválido
        testEmployee1.increaseSalary(500);
        testEmployee1.increaseSalary(25.5);

        System.out.println(testEmployee1);
        System.out.println(testEmployee2);

        Employee.showTotalEmployees();
    }
}
