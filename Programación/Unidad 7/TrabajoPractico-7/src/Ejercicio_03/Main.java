package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fulltime = new FullTimeEmployee("Joaquín", 1500000);
        ContractEmployee temp = new ContractEmployee("Germán", 35, 10000);

        List<Employee> employees = new ArrayList<>();
        employees.add(fulltime);
        employees.add(temp);

        for (Employee e : employees) {
            if (e instanceof FullTimeEmployee) {
                System.out.println(e.getName() + ": empleado de planta permanente.");
            } else if (e instanceof ContractEmployee) {
                System.out.println(e.getName() + ": empleado temporal.");
            }
            System.out.println("Sueldo: " + e.calculateSalary());
            System.out.println();
        }
    }
}
