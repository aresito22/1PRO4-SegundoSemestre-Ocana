package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        Spaceship testSpaceship = new Spaceship("USS Enterprise", 50.0);
        testSpaceship.advance(55); // Distancia imposible por el combustible
        testSpaceship.setFuel(105.0); // Cantidad de combustible inválida (setFuel coloca desde 0)

        System.out.println();
        testSpaceship.advance(25); // Avance válido
        System.out.println();
        testSpaceship.showState();
    }
}
