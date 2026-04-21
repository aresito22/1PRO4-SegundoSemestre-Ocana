package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Bill Gates", "34567890");
        Computer computer = new Computer("Dell", "SN-987654321", owner, "ASUS ROG Strix", "B550");

        owner.setComputer(computer);

        System.out.println(owner.toString());
        System.out.println(computer.toString());
    }
}