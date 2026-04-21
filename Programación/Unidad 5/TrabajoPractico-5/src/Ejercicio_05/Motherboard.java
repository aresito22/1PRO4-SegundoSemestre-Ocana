package Ejercicio_05;

public class Motherboard {
    private String model;
    private String chipset;

    public Motherboard(String model, String chipset) {
        this.model = model;
        this.chipset = chipset;
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

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        if (!chipset.isEmpty()) {
            this.chipset = chipset;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                ", chipset='" + chipset + '\'' +
                '}';
    }
}