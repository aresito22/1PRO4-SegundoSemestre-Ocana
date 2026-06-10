package enumerables;

public enum FormaPago {
    TARJETA(1), EFECTIVO(2), TRANSFERENCIA(3);

    private int valor;

    FormaPago(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
