package Ejercicio_14;

public class Render {
    private final String format;

    public Render(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Render{formato='" + format + "'}";
    }
}