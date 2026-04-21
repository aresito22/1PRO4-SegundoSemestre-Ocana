package Ejercicio_11;

public class Player {
    public void play(Song song) {
        System.out.println("Reproduciendo: " + song.getTitle() + " de " + song.getArtist().getName());
    }
}