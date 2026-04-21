package Ejercicio_02;

public class Cellphone {
    private String imei;
    private String brand;
    private String model;
    private Battery battery;
    private User user;

    public Cellphone(String imei, String brand, String model, User user, Battery battery) {
        this.imei = imei;
        this.brand = brand;
        this.model = model;
        this.user = user;
        this.battery = battery;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        if (!imei.isEmpty()) {
            this.imei = imei;
        } else {
            System.out.println("Error: campo vacío.");
        }
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

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "imei='" + imei + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", user=" + (user != null ? user.getName() : "None") +
                ", battery=" + battery +
                '}';
    }
}