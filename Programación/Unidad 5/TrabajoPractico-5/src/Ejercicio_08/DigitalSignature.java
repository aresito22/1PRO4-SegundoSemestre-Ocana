package Ejercicio_08;

public class DigitalSignature {
    private String hashCode;
    private String date;

    public DigitalSignature(String hashCode, String date) {
        this.hashCode = hashCode;
        this.date = date;
    }

    public String getHashCode() {
        return hashCode;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "DigitalSignature{hash='" + hashCode + "', date='" + date + "'}";
    }
}