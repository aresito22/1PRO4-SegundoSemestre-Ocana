package Ejercicio_04;

public class Customer {
    private String name;
    private String documentNumber;
    private CreditCard creditCard;

    public Customer(String name, String documentNumber) {
        this.name = name;
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        if (!documentNumber.isEmpty()) {
            this.documentNumber = documentNumber;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", creditCard=" + (creditCard != null ? creditCard.getNumber() : "None") +
                '}';
    }
}