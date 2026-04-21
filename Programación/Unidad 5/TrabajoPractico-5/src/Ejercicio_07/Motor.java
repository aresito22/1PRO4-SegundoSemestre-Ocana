package Ejercicio_07;

public class Motor {
    private String type;
    private String serialNumber;

    public Motor(String type, String serialNumber) {
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.isEmpty()) this.type = type;
        else System.out.println("Error: campo vacío.");
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (!serialNumber.isEmpty()) this.serialNumber = serialNumber;
        else System.out.println("Error: campo vacío.");
    }

    @Override
    public String toString() {
        return "Motor{type='" + type + "', serialNumber='" + serialNumber + "'}";
    }
}