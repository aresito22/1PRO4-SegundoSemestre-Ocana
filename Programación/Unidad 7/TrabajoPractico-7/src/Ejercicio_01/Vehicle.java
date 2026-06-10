package Ejercicio_01;

public class Vehicle {
    private String make;
    private String model;

    public Vehicle (String make, String model) {
        setMake(make);
        setModel(model);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (!make.isEmpty()) {
            this.make = make;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public void showInfo() {
        System.out.println(make + " " + model);
    }
}