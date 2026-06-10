package Ejercicio_04;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("...");
    }

    public void describeAnimal() {
        System.out.println("Soy " + getName() + " y mi sonido es:");
        makeSound();
    }
}