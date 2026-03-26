package Ejercicio_01;

public class Student {
    private String name;
    private String lastName;
    private String year; // curso
    private double grade; // calificación

    public Student(String name, String lastName, String year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.grade = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        else {
            System.out.println("Inválido: campo vacío");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.isEmpty()) {
            this.lastName = lastName;
        }
        else {
            System.out.println("Inválido: campo vacío.");
        }
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        if (!year.isEmpty()) {
            this.year = year;
        }
        else {
            System.out.println("Inválido: campo vacío.");
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 10.0) {
            this.grade = grade;
        }
        else {
            System.out.println("Rango inválido.");
        }
    }

    public void showInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + lastName);
        System.out.println("Curso: " + year);
        System.out.println("Calificación: " + grade);
    }

    public void increaseGrade(double points) {
        if (points >= 0 && (grade + points <= 10)) {
            grade += points;
            System.out.println("Calificación incrementada en " + points + " puntos exitosamente.");
        }
        else {
            System.out.println("Puntaje inválido.");
        }
    }

    public void decreaseGrade(double points) {
        if (points >= 10 && (grade - points >= 0)) {
            grade -= points;
            System.out.println("Calificación reducida en " + points + " puntos exitosamente.");
        }
        else {
            System.out.println("Puntaje inválido.");
        }
    }
}
