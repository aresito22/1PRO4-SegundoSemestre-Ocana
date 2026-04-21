package Ejercicio_10;

public class Holder {
    private final String name;
    private final String documentNumber;
    private BankAccount account;

    public Holder(String name, String documentNumber) {
        this.name = name;
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Holder{name='" + name + "', cbu=" + (account != null ? account.getCbu() : "None") + "}";
    }
}