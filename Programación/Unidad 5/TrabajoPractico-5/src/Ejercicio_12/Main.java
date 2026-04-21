package Ejercicio_12;

public class Main {
    static void main(String[] args) {
        Taxpayer tp = new Taxpayer("Ramiro", "20-12345678-9");
        Tax t = new Tax(1500.0, tp);
        Calculator calc = new Calculator();
        calc.calculate(t);
    }
}