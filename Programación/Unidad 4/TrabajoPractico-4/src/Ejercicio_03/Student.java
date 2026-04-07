package Ejercicio_03;

public class Student {
    private String name;
    private double average;
    private static double passingGrade = 7.0;

    public Student(String name) {
        this(name, 0.0);
    }

    public Student(String name, double average) {
        setName(name);
        setAverage(average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            System.out.println("Nombre actualizado.");
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if (average >= 0 && average <= 10) {
            this.average = average;
            System.out.println("Promedio actualizado.");
        } else {
            System.out.println("Error: promedio inválido.");
        }
    }

    public static double getPassingGrade() {
        return passingGrade;
    }

    public static void setPassingGrade(double passingGrade) {
        if (passingGrade >= 0 && passingGrade <= 10) {
            Student.passingGrade = passingGrade;
            System.out.println("Nota de aprobación actualizada.");
        } else {
            System.out.println("Error: nota de aprobación inválida.");
        }
    }

    public void updateAverage(double average) {
        setAverage(average);
    }

    public void updateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        setAverage(average);
    }

    public boolean passed(double average) {
        return average >= passingGrade;
    }

    public static void changePassingGrade(double newPassingGrade) {
        if (newPassingGrade >= 0 && newPassingGrade <= 10) {
            passingGrade = newPassingGrade;
        }
    }

    @Override
    public String toString() {
        return "[ Nombre: " + name + " | Promedio: " + average + " | Aprobó: " + passed(average) + " ]";
    }
}
