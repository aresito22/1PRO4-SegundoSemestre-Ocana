package Ejercicio_01;

public class CreditCard implements PaymentWithDiscount {
    @Override
    public double applyDiscount(double discount) {
        // discount is a percentage, e.g. 10 means 10% off
        return amount * (1 - discount / 100);
    }

    @Override
    public double processPayment(double amount) {
        return amount * 1.03;
    }
}