package Ejercicio_08;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ana", "ana@mail.com");
        Document doc = new Document("Contract", "Content text...", user, "HASH123", "2026-04-17");
        System.out.println(doc.toString());
    }
}