package enumerables;

public enum Estado {
    PENDIENTE(1), CONFIRMADO(2), TERMINADO(3), CANCELADO(4), INVALIDO(5);

    private int valor;

    Estado(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
