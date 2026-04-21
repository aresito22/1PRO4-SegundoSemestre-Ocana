package Ejercicio_13;

public class QRCode {
    private final String value;

    public QRCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "QR{valor='" + value + "'}";
    }
}