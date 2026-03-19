import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int i = 1;

        System.out.println("Ingrese un número o presione 0 para finalizar.");
        System.out.println("Se sumarán solo los números pares.\n");

        do {
            System.out.print("Número " + i + ": ");
            num = Integer.parseInt(sc.nextLine());

            if (num % 2 == 0) {
                sum += num;
            }
            i += 1;
        }
        while (num != 0);

        System.out.println("\nSuma de números pares: " + sum);
    }
}