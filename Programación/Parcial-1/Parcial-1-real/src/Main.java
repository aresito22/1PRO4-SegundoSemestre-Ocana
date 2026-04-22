public class Main {
    public static void main(String[] args) {
        Course testCourse1 = new Course(10, "Programación", 20, 500);
        Course testCourse2 = new Course(11, "Piloto Privado de Avión", 40, 10000);
        Course testCourse3 = new Course("Bases de Datos", 15);

        testCourse1.updatePrice(10.5); // Porcentaje
        testCourse2.updatePrice(1000); // Cantidad

        System.out.println(testCourse1);
        System.out.println(testCourse2);
        System.out.println(testCourse3);
        System.out.println(" ");

        Course.showTotalCourses();
        System.out.println(" ");

        // Pruebas de datos inválidos
        testCourse1.setName("");
        testCourse2.setCourseDuration(-3);
        testCourse3.setPrice(-5);

        testCourse1.updatePrice(-5.0);
        testCourse1.updatePrice(-5);
    }
}
