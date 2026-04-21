package Ejercicio_13;

public class QRGenerator {
    public void generate(String value, User user) {
        QRCode qr = new QRCode(value);
        System.out.println("Generando " + qr + " para " + user.getName());
    }
}