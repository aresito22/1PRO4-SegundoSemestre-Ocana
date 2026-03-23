import java.util.Scanner;

public class Ejercicio_02 {
    public static int determineLargestInt(int[] numbers) {
        int largestInt = numbers[0];
        for (int i = 1; i < (numbers.length); i++) {
            if (numbers[i] > largestInt) {
                largestInt = numbers[i];
            }
        }
        return largestInt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Número más grande: " + determineLargestInt(numbers));
    }
}