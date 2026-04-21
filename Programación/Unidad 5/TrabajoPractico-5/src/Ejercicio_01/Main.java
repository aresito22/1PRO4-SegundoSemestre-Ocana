package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Person citizen = new Person("Juan Perez", "12345678");

        Passport newPassport = new Passport("ARG-999", "2026-04-17", citizen, "C:/docs/foto.jpg", "JPG");

        citizen.setPassport(newPassport);

        System.out.println("Datos del Titular");
        System.out.println(citizen.toString());

        System.out.println("Datos del Pasaporte");
        System.out.println(newPassport.toString());
    }
}