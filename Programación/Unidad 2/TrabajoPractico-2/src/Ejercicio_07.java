import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(sc.nextLine());
            if (nota > 10 || nota < 0) {
                System.out.println("Nota inválida.");
            }
            else {
                System.out.println("Nota guardada correctamente.");
            }
        }
        while (nota > 10 || nota < 0);
    }
}
