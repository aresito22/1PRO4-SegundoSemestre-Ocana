package Ejercicio_10;

public class Main {
    static void main(String[] args) {
        Holder h = new Holder("Luis", "1122");
        BankAccount acc = new BankAccount("0000123", 500.0, h, "1234", "2026-04-01");
        h.setAccount(acc);
        System.out.println(acc);
        System.out.println(h);
    }
}