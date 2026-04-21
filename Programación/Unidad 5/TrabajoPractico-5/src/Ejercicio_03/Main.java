package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Jorge Luis Borges", "Argentina");
        Publisher publisher = new Publisher("Sudamericana", "Buenos Aires");
        Book book = new Book("Ficciones", "9789875666471", author, publisher);

        System.out.println(author.toString());
        System.out.println(publisher.toString());
        System.out.println(book.toString());
    }
}