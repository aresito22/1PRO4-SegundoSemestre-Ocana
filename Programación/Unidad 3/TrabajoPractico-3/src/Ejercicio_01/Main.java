package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Student testStudent = new Student("Manuel", "Belgrano", "Primer año");

        // Prueba de datos inválidos
        testStudent.setName("");
        testStudent.setLastName("");
        testStudent.setYear("");
        testStudent.setGrade(-1.0);
        testStudent.setGrade(-11.0);

        // Carga de datos válidos
        testStudent.setGrade(7.0);

        testStudent.showInfo();

        // Prueba de método de cambio de calificaciones
        testStudent.increaseGrade(3.0); // Debería funcionar
        testStudent.increaseGrade(2.0); // No debería funcionar.
        testStudent.decreaseGrade(10.0); // Debería funcionar
        testStudent.decreaseGrade(2.0); // No debería funcionar
    }
}
