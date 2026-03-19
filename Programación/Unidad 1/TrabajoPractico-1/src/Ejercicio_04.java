import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Segundo número: ");
        int secondNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Suma: " + (firstNumber + secondNumber));
        System.out.println("Resta: " + (firstNumber - secondNumber));
        System.out.println("Multiplicación: " + (firstNumber * secondNumber));
        System.out.println("División: " + (firstNumber / secondNumber));
    }
}