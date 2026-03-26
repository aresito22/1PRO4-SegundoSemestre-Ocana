package Ejercicio_03;

public class Book {
    private String title;
    private String author;
    private int year;
    private final int CURRENT_YEAR = 2026;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Inválido: campo vacío.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (!author.isEmpty()) {
            this.author = author;
        }
        else {
            System.out.println("Inválido: campo vacío.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (!(year < 0) && !(year > CURRENT_YEAR)) {
            this.year = year;
        }
        else {
            System.out.println("Año inválido.");
        }
    }

    public void showInfo() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Año: " + year);
    }
}