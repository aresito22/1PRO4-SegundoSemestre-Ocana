package Ejercicio_07;

public class Driver {
    private String name;
    private String license;
    private Vehicle vehicle;

    public Driver(String name, String license) {
        this.name = name;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) this.name = name;
        else System.out.println("Error: campo vacío.");
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        if (!license.isEmpty()) this.license = license;
        else System.out.println("Error: campo vacío.");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Driver{name='" + name + "', license='" + license + "', vehicle=" + (vehicle != null ? vehicle.getLicensePlate() : "None") + "}";
    }
}