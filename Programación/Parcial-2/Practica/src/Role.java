public enum Role {
    ADMIN(1), CLIENT(2);

    private int value;

    Role(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}