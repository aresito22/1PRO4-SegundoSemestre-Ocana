import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        String edad = sc.nextLine();

        System.out.println(nombre + ", " + edad + " años.");
    }
}