import java.util.Scanner;

public class Ejercicio_06 {
    public static int countPositiveInts(int[] numbers) {
        int positiveInts = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                positiveInts += 1;
            }
        }
        return positiveInts;
    }

    public static int countNegativeInts(int[] numbers) {
        int negativeInts = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                negativeInts += 1;
            }
        }
        return negativeInts;
    }

    public static int countZeroes(int[] numbers) {
        int zeroes = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zeroes += 1;
            }
        }
        return zeroes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Número "+ (i + 1) + ": ");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("\nNúmeros positivos: " + countPositiveInts(numbers));
        System.out.println("Números negativos: " + countNegativeInts(numbers));
        System.out.println("Ceros: " + countZeroes(numbers));
    }
}