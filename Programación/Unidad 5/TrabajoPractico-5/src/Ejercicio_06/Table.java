package Ejercicio_06;

public class Table {
    private int number;
    private int capacity;

    public Table(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("Error: valor inválido.");
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
        return "Table{" +
                "number=" + number +
                ", capacity=" + capacity +
                '}';
    }
}