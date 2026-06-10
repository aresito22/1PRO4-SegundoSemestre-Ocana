package Ejercicio_02;

import java.util.Scanner;

public class Punto_01 {
    public static double divide(double numerator, double denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return numerator / denominator;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numerador: ");
        double numerator = Double.parseDouble(sc.nextLine());
        System.out.print("Denominador: ");
        double denominator = Double.parseDouble(sc.nextLine());

        System.out.println(divide(numerator, denominator));
    }
}
