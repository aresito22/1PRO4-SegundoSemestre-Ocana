package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        Book testBook = new Book("Amalia", "José Mármol", 0);
        testBook.setYear(2999); // Carga de dato inválido
        testBook.setYear(-1); // Carga de dato inválido
        testBook.setYear(1851); // Año válido y correcto

        System.out.println();
        testBook.showInfo();
    }
}