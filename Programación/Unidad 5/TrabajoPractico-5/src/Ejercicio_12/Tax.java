package Ejercicio_12;

public class Tax {
    private final double amount;
    private final Taxpayer taxpayer;

    public Tax(double amount, Taxpayer taxpayer) {
        this.amount = amount;
        this.taxpayer = taxpayer;
    }

    public double getAmount() {
        return amount;
    }

    public Taxpayer getTaxpayer() {
        return taxpayer;
    }
}