package Ejercicio_11;

public class Song {
    private final String title;
    private final Artist artist;

    public Song(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }
}