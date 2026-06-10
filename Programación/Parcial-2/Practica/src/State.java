public enum State {
    PENDING(1), CONFIRMED(2), FINISHED(3), CANCELLED(4);

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}