package Ejercicio_02;

import java.util.Scanner;

public class Punto_02 {
    public static int convert(String text) {
        return Integer.parseInt(text);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número para convertir a entero: ");
        String text = sc.nextLine();

        try {
            System.out.println(convert(text));
        } catch (NumberFormatException e) {
            System.out.println("El valor no corresponde a un entero.");
        }
    }
}