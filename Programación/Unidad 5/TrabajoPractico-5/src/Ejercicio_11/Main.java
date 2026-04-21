package Ejercicio_11;

public class Main {
    static void main(String[] args) {
        Artist a = new Artist("Cerati", "Rock");
        Song s = new Song("Crimen", a);
        Player p = new Player();
        p.play(s);
    }
}