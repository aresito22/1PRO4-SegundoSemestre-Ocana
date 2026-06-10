public enum PaymentMethod {
    CARD(1), TRANSFER(2), CASH(3);

    private int value;

    PaymentMethod(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}