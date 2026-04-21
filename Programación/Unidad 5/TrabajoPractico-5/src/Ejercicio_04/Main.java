package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ana Gomez", "23456789");
        Bank bank = new Bank("Banco Nacion", "30-11111111-1");
        CreditCard creditCard = new CreditCard("4540-1234-5678-9012", "12/28", customer, bank);

        customer.setCreditCard(creditCard);

        System.out.println(customer.toString());
        System.out.println(creditCard.toString());
    }
}