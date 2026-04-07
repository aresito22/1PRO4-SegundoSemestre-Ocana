package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        Account testAccount1 = new Account("Franco");
        Account testAccount2 = new Account("Mercedes", 1500);

        // Muestra de los números de cuenta
        System.out.println(testAccount1);
        System.out.println(testAccount2);

        testAccount2.withdraw(2000); // Retiro de más dinero del disponible
        testAccount2.checkBalance(1420); // Prueba de conversión a dólares

        Account.showTotalAccounts();
    }
}
