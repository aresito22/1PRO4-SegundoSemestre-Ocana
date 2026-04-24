package Ejercicio_02;

import Ejercicio_01.ErrorMessages;

public class Book {
    private String isbn;
    private String title;
    private int releaseYear;
    private static final int CURRENT_YEAR = 2026;
    private Author author;

    public Book(String isbn, String title, int releaseYear, Author author) {
        setIsbn(isbn);
        setTitle(title);
        setReleaseYear(releaseYear);
        setAuthor(author);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (!isbn.isEmpty()) {
            this.isbn = isbn;
        } else {
            System.out.println(ErrorMessages.EMPTY_FIELD);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println(ErrorMessages.EMPTY_FIELD);
        }
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear <= CURRENT_YEAR) {
            this.releaseYear = releaseYear;
        } else {
            System.out.println(Ejercicio_02.ErrorMessages.INVALID_YEAR);
        }
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        if (author != null) {
            this.author = author;
        } else {
            System.out.println(Ejercicio_02.ErrorMessages.NULL_AUTHOR);
        }
    }

    public void showInfo() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author.getName());
        System.out.println("ISBN: " + isbn);
        System.out.println("Año de publicación: " + releaseYear);
        System.out.println(" ");
    }
}
