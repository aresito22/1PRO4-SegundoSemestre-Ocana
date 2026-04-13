package Ejercicio_05;

public class Account {
    private String accountHolder;
    private double balance;
    private static int lastNumber = 100;
    private final int NUMBER;
    private static int totalAccounts = 0;

    public Account(String accountHolder) {
        this(accountHolder, 0);
    }

    public Account(String accountHolder, double initialBalance) {
        setAccountHolder(accountHolder);
        setBalance(initialBalance);
        NUMBER = ++lastNumber;
        totalAccounts += 1;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (!accountHolder.isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance; // No hay validación porque un balance puede llegar a ser negativo.
    }

    public double checkBalance() {
        return balance;
    }

    public double checkBalance(double dollarExchangeRate) {
        return balance / dollarExchangeRate;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Saldo depositado. Saldo actual: " + balance);
        } else {
            System.out.println("Error: cantidad de depósito inválida.");
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Retiro exitoso. Saldo actual: " + balance);
        } else {
            System.out.println("Error: cantidad a retirar inválida.");
        }
    }

    public static void showTotalAccounts() {
        System.out.println("Cuentas totales: " + totalAccounts);
    }

    @Override
    public String toString() {
        return "[ Número: " + NUMBER + " | Titular: " + accountHolder + " | Saldo: " + String.format("%.2f", balance) + " ]";
    }
}