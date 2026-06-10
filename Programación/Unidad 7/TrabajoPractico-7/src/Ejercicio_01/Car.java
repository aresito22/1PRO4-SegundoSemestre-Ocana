package Ejercicio_01;

public class Car extends Vehicle {
    private int doorAmount;

    public Car(String make, String model, int doorAmount) {
        super(make, model);
        setDoorAmount(doorAmount);
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setDoorAmount(int doorAmount) {
        if (doorAmount > 0) {
            this.doorAmount = doorAmount;
        } else {
            System.out.println("Error: cantidad menor o igual a 0.");
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(doorAmount + " puertas");
    }
}
