package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        Hen henA = new Hen(1, 3, 0);
        Hen henB = new Hen(2, 2, 0);

        henA.setAge(-1); // Carga de dato inválido

        System.out.println();
        henA.layEgg();
        henA.layEgg();
        henB.layEgg();
        // La primera gallina pone dos huevos y la segunda pone solo uno

        System.out.println();
        henA.showState();
        henB.showState();
    }
}
