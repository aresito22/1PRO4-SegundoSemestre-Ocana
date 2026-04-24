package Ejercicio_03;

import java.util.ArrayList;

public class Professor {
    private String id;
    private String name;
    private String specialty;
    private ArrayList<Course> courses = new ArrayList<>();

    public Professor(String id, String name, String specialty) {
        setId(id);
        setName(name);
        setSpecialty(specialty);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (!id.isEmpty()) {
            this.id = id;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        if (!specialty.isEmpty()) {
            this.specialty = specialty;
        } else {
            System.out.println(ErrorMessages.EMPTY_FIELD);
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        if (courses != null) {
            this.courses = courses;
        } else {
            System.out.println(ErrorMessages.NULL_COURSE);
        }
    }

    public void addCourse(Course course) {
        boolean existingCourse = false;
        for (Course c : courses) {
            if (c.equals(course)) {
                existingCourse = true;
                break;
            }
        }

        if (!existingCourse) {
            courses.add(course);
            System.out.println("Curso añadido.");
        } else {
            System.out.println("El curso ya está asignado al profesor.");
        }
    }

    public void deleteCourse(Course course) {
        Course toDelete = null;
        for (Course c : courses) {
            if (c.equals(course)) {
                toDelete = c;
            }
        }

        if (toDelete != null) {
            courses.remove(toDelete);
            System.out.println("Curso eliminado.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    public void listCourses() {
        System.out.println("Cursos:");
        for (Course c : courses) {
            c.showInfo();
        }
    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + name);
        System.out.println("Especialidad: " + specialty);
        System.out.println("Cursos que enseña:");
        for (Course c : courses) {
            if (c.getProfessor().equals(this)) {
                System.out.println(c.getName());
            }
        }
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Profesor: " + name;
    }
}