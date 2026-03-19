import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        //String nombre = scanner.nextInt(); <- ERROR
        String nombre = scanner.nextLine(); // Error corregido: el dato que se está tomando es un String pero .nextInt() solo lee enteros. Aquí se usa el método correcto.
        System.out.println("Hola, " + nombre);
    }
}