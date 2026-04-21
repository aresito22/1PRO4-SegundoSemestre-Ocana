package Ejercicio_02;

public class Battery {
    private String model;
    private int capacity;

    public Battery(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Error: valor inválido.");
        }
    }

    @Override
    public String toString() {
        return "Battery{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity + "mAh" +
                '}';
    }
}