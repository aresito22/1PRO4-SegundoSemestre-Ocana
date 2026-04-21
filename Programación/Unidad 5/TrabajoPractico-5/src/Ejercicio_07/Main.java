package Ejercicio_07;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "ENG123");
        Driver driver = new Driver("Juan Perez", "LIC-789");
        Vehicle vehicle = new Vehicle("ABC-123", "Toyota Hilux", motor, driver);
        driver.setVehicle(vehicle);
        System.out.println(driver.toString());
        System.out.println(vehicle.toString());
    }
}