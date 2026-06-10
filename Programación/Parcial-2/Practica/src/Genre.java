import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Genre extends Base {
    private String name;
    private String description;
    private List<Book> books = new ArrayList<>();

    public Genre(String name, String description, List<Book> books) {
        super();
        setName(name);
        setDescription(description);
        setBooks(books);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        this.description = description;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("El libro no puede ser null.");
        }
        this.books.add(book);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", books=" + books +
                '}';
    }
}
