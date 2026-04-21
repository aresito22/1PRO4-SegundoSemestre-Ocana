package Ejercicio_07;

public class Vehicle {
    private String licensePlate;
    private String model;
    private Motor motor;
    private Driver driver;

    public Vehicle(String licensePlate, String model, Motor motor, Driver driver) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.motor = motor;
        this.driver = driver;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        if (!licensePlate.isEmpty()) this.licensePlate = licensePlate;
        else System.out.println("Error: campo vacío.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty()) this.model = model;
        else System.out.println("Error: campo vacío.");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Vehicle{licensePlate='" + licensePlate + "', model='" + model + "', motor=" + motor + ", driver=" + (driver != null ? driver.getName() : "None") + "}";
    }
}