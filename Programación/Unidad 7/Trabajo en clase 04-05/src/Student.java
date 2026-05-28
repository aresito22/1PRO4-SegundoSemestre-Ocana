import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private double grade;
    private final int studentId;
    private static int studentCount = 0;

    public Student(String name, int age, double grade) {
        studentCount += 1;
        setName(name);
        setAge(age);
        setGrade(grade);
        studentId = studentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        while (true) {
            if (!name.isEmpty()) {
                this.name = name;
                break;
            } else {
                System.out.println("Error: campo vacío.");
            }
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        while (true) {
            if (age >= 0) {
                this.age = age;
                break;
            } else {
                System.out.println("Error: edad inválida.");
            }
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        while (true) {
            if (grade >= 0 && grade <= 10) {
                this.grade = grade;
                break;
            } else {
                System.out.println("Error: nota inválida.");
            }
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public int getStudentCount() {
        return studentCount;
    }
}
