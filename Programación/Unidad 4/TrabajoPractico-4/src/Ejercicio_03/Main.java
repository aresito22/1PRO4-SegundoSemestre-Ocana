package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        double[] testStudentOneGrades = {7.8, 9.4, 8.1};
        double testStudentTwoGrades = 8.9;

        Student testStudent1 = new Student ("Sabrina");
        Student testStudent2 = new Student("Ismael", testStudentTwoGrades);

        testStudent1.updateAverage(testStudentOneGrades);
        testStudent2.updateAverage(9.1);

        System.out.println(testStudent1);
        System.out.println(testStudent2);
        Student.changePassingGrade(9.5);
        System.out.println(testStudent1);
        System.out.println(testStudent2);

    }
}
