package Ejercicio_13;

public class Main {
    static void main(String[] args) {
        User u = new User("Lucia", "lucia@mail.com");
        QRGenerator gen = new QRGenerator();
        gen.generate("www.utn.edu.ar", u);
    }
}