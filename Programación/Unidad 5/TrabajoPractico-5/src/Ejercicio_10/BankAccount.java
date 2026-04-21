package Ejercicio_10;

public class BankAccount {
    private final String cbu;
    private final double balance;
    private final SecurityKey key;
    private final Holder holder;

    public BankAccount(String cbu, double balance, Holder holder, String keyCode, String keyDate) {
        this.cbu = cbu;
        this.balance = balance;
        this.holder = holder;
        this.key = new SecurityKey(keyCode, keyDate);
    }

    public String getCbu() {
        return cbu;
    }

    @Override
    public String toString() {
        return "Account{cbu='" + cbu + "', key=" + key + ", holder=" + holder.getName() + "}";
    }
}