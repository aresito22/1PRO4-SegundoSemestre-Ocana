package Ejercicio_05;

public class Spaceship {
    private String name;
    private double fuel;
    private double distance; // Atributo creado para método despegar y avanzar
    private static final double MAX_CAPACITY = 100.0;

    public Spaceship (String name, double fuel) {
        this.name = name;
        this.fuel = fuel;
        this.distance = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        else {
            System.out.println("Inválido: campo vacío.");
        }
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        if (fuel >= 0 && fuel <= MAX_CAPACITY) {
            this.fuel = fuel;
        }
        else {
            System.out.println("Valor de combustible inválido.");
        }
    }

    public void takeOff() {
        if (fuel >= 5) {
            distance = 5.0; // Utilizo '=' en vez de '+=' porque se supone que, al despegar, partimos de una base que representa el 0
            fuel -= distance; // 1 litro de consumo por milla avanzada
            System.out.println("Despegado exitosamente. " + distance + " millas náuticas de la base.");
            System.out.println("Combustible actual" + fuel + " litros.");
        }
        else {
            System.out.println("Combustible insuficiente para el despegue.");
        }
    }

    public void advance(double distance) {
        if (distance > 0 && distance <= fuel) {
            this.distance += distance;
            this.fuel -= distance; // 1 litro de consumo por milla avanzada
            System.out.println("Avanzado exitosamente. " + distance + " millas náuticas de la base.");
            System.out.println("Combustible actual: " + fuel + " litros.");
        }
        else {
            System.out.println("Distancia inválida o combustible insuficiente.");
        }
    }

    public void reloadFuel(double fuel) {
        if (fuel > 0) {
            this.fuel += fuel;
            System.out.println("Recargado exitosamente. Combustible actual: " + fuel + "litros.");
        }
        else {
            System.out.println("Cantidad de combustible inválida.");
        }
    }

    public void showState() {
        System.out.println("Nombre: " + name);
        System.out.println("Combustible: " + fuel);
        System.out.println("Distancia de la base: " + distance);
    }
}