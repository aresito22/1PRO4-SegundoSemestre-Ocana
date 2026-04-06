package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        Book testBook1 = new Book("Why Nations Fail", "Daron Acemoglu");
        Book testBook2 = new Book("Democracy in America", "Alexis De Tocqueville", "Editorial UTN");

        testBook1.updateTitle(""); // Inválido
        testBook1.updateTitle("The", "Hobbit"); // Versión con prefijo
        testBook1.updateTitle("Why Nations Fail"); // Versión sin prefijo

        System.out.println(testBook1);
        System.out.println(testBook2);
        Book.updatePublisher("Editorial MIT");
        System.out.println(testBook1);
        System.out.println(testBook2);
    }
}
