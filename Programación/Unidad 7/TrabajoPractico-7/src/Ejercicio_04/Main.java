package Ejercicio_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Milka");
        Cat cat = new Cat("Garfield");
        Dog dog = new Dog("Snoopy");

        List<Animal> animals = new ArrayList<>();
        animals.add(cow);
        animals.add(cat);
        animals.add(dog);

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
