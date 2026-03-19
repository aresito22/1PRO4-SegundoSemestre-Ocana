import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Segundo número: ");
        int secondNumber = Integer.parseInt(sc.nextLine());

        double decimalFirstNumber = firstNumber;
        double decimalSecondNumber = secondNumber;

        System.out.println("División de enteros: " + (firstNumber/secondNumber));
        System.out.println("División de decimales: " + (decimalFirstNumber/decimalSecondNumber));
    }
}