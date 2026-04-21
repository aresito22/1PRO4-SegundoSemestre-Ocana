package Ejercicio_04;

public class CreditCard {
    private String number;
    private String expirationDate;
    private Customer customer;
    private Bank bank;

    public CreditCard(String number, String expirationDate, Customer customer, Bank bank) {
        this.number = number;
        this.expirationDate = expirationDate;
        this.customer = customer;
        this.bank = bank;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (!number.isEmpty()) {
            this.number = number;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        if (!expirationDate.isEmpty()) {
            this.expirationDate = expirationDate;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", customer=" + (customer != null ? customer.getName() : "None") +
                ", bank=" + (bank != null ? bank.getName() : "None") +
                '}';
    }
}