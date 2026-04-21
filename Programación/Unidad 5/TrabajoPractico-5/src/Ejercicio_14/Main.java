package Ejercicio_14;

public class Main {
    static void main(String[] args) {
        Project p = new Project("Final_Video", 10);
        VideoEditor editor = new VideoEditor();
        editor.export("MP4", p);
    }
}