package Ejercicio_10;

public class SecurityKey {
    private final String code;
    private final String lastModification;

    public SecurityKey(String code, String lastModification) {
        this.code = code;
        this.lastModification = lastModification;
    }

    @Override
    public String toString() {
        return "Key{modified='" + lastModification + "'}";
    }
}