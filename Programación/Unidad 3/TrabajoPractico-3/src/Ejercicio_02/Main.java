package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        Pet testPet = new Pet("Garfield", "Gato", 1);
        testPet.setAge(-1); // Prueba de dato inválido
        testPet.setAge(5); // Prueba de dato válido

        System.out.println();
        testPet.showInfo(); // Muestra de datos

        System.out.println();
        testPet.haveBirthday();
        testPet.haveBirthday();
    }
}