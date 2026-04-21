package Ejercicio_03;

public class Book {
    private String title;
    private String isbn;
    private Author author;
    private Publisher publisher;

    public Book(String title, String isbn, Author author, Publisher publisher) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (!isbn.isEmpty()) {
            this.isbn = isbn;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author=" + (author != null ? author.getName() : "None") +
                ", publisher=" + (publisher != null ? publisher.getName() : "None") +
                '}';
    }
}