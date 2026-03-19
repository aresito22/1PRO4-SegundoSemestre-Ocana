import java.util.Scanner;

public class Ejercicio_01 {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Año: ");
        int year = Integer.parseInt(sc.nextLine());

        if (isLeapYear(year)) {
            System.out.println("El año " + year + " es bisiesto.");
        }
        else {
            System.out.println("El año " + year + " no es bisiesto.");
        }
    }
}