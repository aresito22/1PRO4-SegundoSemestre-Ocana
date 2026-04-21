package Ejercicio_14;

public class VideoEditor {
    public void export(String format, Project project) {
        Render r = new Render(format);
        System.out.println("Exportando " + r + " del proyecto: " + project.getName());
    }
}