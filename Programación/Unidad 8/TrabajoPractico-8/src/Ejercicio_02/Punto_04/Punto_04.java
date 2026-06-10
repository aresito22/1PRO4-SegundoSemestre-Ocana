package Ejercicio_02.Punto_04;

import java.util.Scanner;

public class Punto_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su edad: ");
        int age = Integer.parseInt(sc.nextLine());

        if (age >= 0 && age <= 120) {
            throw new InvalidAgeException("Edad inválida.");
        }
        System.out.println("Su edad es " + age);
    }
}

