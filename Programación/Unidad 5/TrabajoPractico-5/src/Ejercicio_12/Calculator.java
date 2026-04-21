package Ejercicio_12;

public class Calculator {
    public void calculate(Tax tax) {
        System.out.println("Calculando impuesto para " + tax.getTaxpayer().getName() + ": $" + tax.getAmount());
    }
}