package Ejercicio_05;

public class Computer {
    private String brand;
    private String serialNumber;
    private Motherboard motherboard;
    private Owner owner;

    public Computer(String brand, String serialNumber, Owner owner, String motherboardModel, String motherboardChipset) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.owner = owner;
        this.motherboard = new Motherboard(motherboardModel, motherboardChipset);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!brand.isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (!serialNumber.isEmpty()) {
            this.serialNumber = serialNumber;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", owner=" + (owner != null ? owner.getName() : "None") +
                ", motherboard=" + motherboard +
                '}';
    }
}