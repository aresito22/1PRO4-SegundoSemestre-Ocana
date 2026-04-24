package Ejercicio_02;

import Ejercicio_01.Product;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        setName(name);
        this.books = new ArrayList<>();
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println(ErrorMessages.EMPTY_FIELD);
        }
    }

    public String getName() {
        return name;
    }

    public void addBook(String isbn, String title, int releaseYear, Author author) {
        Book book = new Book(isbn, title, releaseYear, author);
        books.add(book);
        System.out.println("Libro añadido.");
    }

    public void listBooks() {
        System.out.println("Libros:");
        for (Book b : books) {
            b.showInfo();
        }
    }

    public void searchBookIsbn(String isbn) {
        boolean bookFound = false;
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                System.out.println("Libro encontrado:");
                b.showInfo();
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Libro no encontrado.");
        }
    }

    public void deleteBook(String isbn) {
        Book toDelete = null;
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                toDelete = b;
                break;
            }
        }

        if (toDelete != null) {
            books.remove(toDelete);
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public int getTotalBooks() {
        return books.size();
    }

    public void filterByYear (int year) {
        System.out.println("Mostrando libros con año de publicación " + year + ":");
        for (Book b : books) {
            if (b.getReleaseYear() == year) {
                b.showInfo();
            }
        }
    }

    /*
    Función hecha para mostrar autores de la biblioteca sin repetirlos si es que hay más de un libro por autor.
    Se crea una lista vacía de autores, se itera por cada libro en la biblioteca y su autor no se encuentra en la lista,
    se añade a la lista.
     */
    public void showAuthors() {
        ArrayList<Author> uniqueAuthors = new ArrayList<>();
        boolean existingAuthor = false;

        for (Book b : books) {
            Author toTest = b.getAuthor();

            for (Author a : uniqueAuthors) {
                if (a.getName().equals(toTest.getName())) {
                    existingAuthor = true;
                    break;
                }
            }

            if (!existingAuthor) {
                uniqueAuthors.add(toTest);
            }
        }

        System.out.println("Autores:");
        for (Author a : uniqueAuthors) {
            a.showInfo();
        }
    }
}
