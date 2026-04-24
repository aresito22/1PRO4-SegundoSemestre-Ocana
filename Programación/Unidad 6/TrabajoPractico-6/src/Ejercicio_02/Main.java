package Ejercicio_02;

// TAREAS A REALIZAR
public class Main {
    public static void main(String[] args) {
        // 1
        Library library = new Library("Biblioteca UTN");
        // 2
        Author MTwain = new Author("1", "Mark Twain", "Estados Unidos");
        Author JAusten = new Author("2", "Jane Austen", "Inglaterra");
        Author RBradbury = new Author("3", "Ray Bradbury", "Estados Unidos");
        // 3
        library.addBook("111", "Las Aventuras de Tom Sawyer", 1876, MTwain);
        library.addBook("112", "Las Aventuras de Huckleberry Finn", 1884, MTwain);
        library.addBook("113", "Orgullo y Prejuicio", 1813, JAusten);
        library.addBook("114", "Crónicas Marcianas", 1950, RBradbury);
        library.addBook("115", "Fahrenheit 451", 1953, RBradbury);

        // 4
        library.listBooks();
        // 5
        library.searchBookIsbn("114");
        // 6
        library.filterByYear(1884);
        // 7
        library.deleteBook("111");
        // 8
        System.out.println("Total de libros en " + library.getName() + ": " + library.getTotalBooks());
        // 9
        library.showAuthors();
    }
}
