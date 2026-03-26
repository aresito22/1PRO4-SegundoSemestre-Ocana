package Ejercicio_04;

public class Hen {
    private int henId;
    private int age;
    private int eggsLaid;

    public Hen(int henId, int age, int eggsLaid) {
        this.henId = henId;
        this.age = age;
        this.eggsLaid = eggsLaid;
    }

    public int getHenId() {
        return henId;
    }

    public void setHenId(int henId) {
        if (!(henId < 0)) {
            this.henId = henId;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!(age < 0)) {
            this.age = age;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public int getEggsLaid() {
        return eggsLaid;
    }

    public void setEggsLaid(int eggsLaid) {
        if (!(eggsLaid < 0)) {
            this.eggsLaid = eggsLaid;
        }
        else {
            System.out.println("Valor inválido.");
        }
    }

    public void layEgg() {
        eggsLaid += 1;
        System.out.println("ID " + henId + ": nuevo huevo puesto. " + eggsLaid + " huevos puestos en total.");
    }

    public void ageHen() { // Envejecer gallina
        age += 1;
        System.out.println("Edad actual: " + age);
    }

    public void showState() {
        System.out.println("ID: " + henId);
        System.out.println("Edad: " + age);
        System.out.println("Huevos puestos: " + eggsLaid);
    }
}
