import java.util.Scanner;

public class Ejercicio_03 {
    public static String determineLifeStage (int age) {
        String lifeStage;
        if (age < 12) {
            lifeStage = "Niño";
        }
        else if (age <= 17) {
            lifeStage = "Adolescente";
        }
        else if (age <= 59) {
            lifeStage = "Adulto";
        }
        else {
            lifeStage = "Adulto mayor";
        }
        return lifeStage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        if (edad < 0) {
            System.out.println("Edad inválida.");
        }
        else {
            System.out.println(determineLifeStage(edad));
        }
    }
}