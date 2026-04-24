package Ejercicio_03;

public class Course {
    private String code;
    private String name;
    private Professor professor;

    public Course(String code, String name, Professor professor) {
        setCode(code);
        setName(name);
        setProfessor(professor);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (!code.isEmpty()) {
            this.code = code;
        } else {
            System.out.println(ErrorMessages.EMPTY_FIELD);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println(ErrorMessages.EMPTY_FIELD);
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if (this.professor != null) {
            this.professor.deleteCourse(this);
        }

        this.professor = professor;

        if (professor != null && !professor.getCourses().contains(this)) {
            professor.addCourse(this);
        }
    }

    public void showInfo() {
        System.out.println("Código: " + code);
        System.out.println("Nombre: " + name);
        if (professor != null) {
            System.out.println("Profesor: " + professor.getName());
        } else {
            System.out.println("Sin profesor asignado.");
        }
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Curso: " + name;
    }
}