package Ejercicio_02;

public class Pet {
    private String name;
    private String species;
    private int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (!species.isEmpty()) {
            this.species = species;
        }
        else {
            System.out.println("Inválido: campo vacío.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else {
            System.out.println("Rango de edad inválido.");
        }
    }

    public void showInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Especie: " + species);
        System.out.println("Edad: " + age);
    }

    public void haveBirthday() {
        age += 1;
        System.out.println("Años cumplidos: " + age);
    }
}
