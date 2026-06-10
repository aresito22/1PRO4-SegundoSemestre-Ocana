package Ejercicio_01;

public class PayPal implements Payment {
    @Override
    public double processPayment(double amount) {
        System.out.println("Procesando pago en PayPal de $" + amount);
        return amount;
    }
}