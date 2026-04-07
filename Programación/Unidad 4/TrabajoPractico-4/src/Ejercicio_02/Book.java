package Ejercicio_02;

public class Book {
    private String title;
    private String author;
    private static String publisher = "Independiente";

    public Book(String title, String author) {
        this(title, author, Book.publisher);
    }

    public Book(String title, String author, String publisher) {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (!author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public static String getPublisher() {
        return publisher;
    }

    public static void setPublisher(String publisher) {
        if (!publisher.isEmpty()) {
            Book.publisher = publisher;
            System.out.println("Editorial actualizada.");
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public void updateTitle(String title) {
        setTitle(title);
    }

    public void updateTitle(String prefix, String title) {
        if (!prefix.isEmpty() && !title.isEmpty()) {
            String newTitle = prefix + " " + title;
            setTitle(newTitle);
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public static void updatePublisher(String publisher) {
        setPublisher(publisher);
    }

    @Override
    public String toString() {
        return "[ Nombre: " + title + " | Author: " + author + " | Editorial: " + publisher + " ]";
    }
}