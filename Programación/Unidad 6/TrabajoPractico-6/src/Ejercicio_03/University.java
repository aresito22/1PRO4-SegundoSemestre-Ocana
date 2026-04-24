package Ejercicio_03;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Professor> professors = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    public University(String name) {
        setName(name);
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

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        if (professors != null) {
            this.professors = professors;
        } else {
            System.out.println(ErrorMessages.NULL_PROFESSOR);
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

    public void addProfessor(Professor professor) {
        if (professor != null) {
            professors.add(professor);
            System.out.println("Profesor añadido.");
        } else {
            System.out.println(ErrorMessages.NULL_PROFESSOR);
        }
    }

    public void addCourse(Course course) {
        if (course != null) {
            courses.add(course);
            System.out.println("Curso añadido");
        } else {
            System.out.println(ErrorMessages.NULL_COURSE);
        }
    }

    public void assignProfessorToCourse(String courseCode, String professorId) {
        // Verificar que el profesor exista
        Professor professorToAssign = null;
        boolean existingProfessor = false;
        for (Professor p : professors) {
            if (p.getId().equals(professorId)) {
                professorToAssign = p;
                existingProfessor = true;
                break;
            }
        }

        // Verificar que el curso exista
        Course courseToUpdate = null;
        boolean existingCourse = false;
        for (Course c : courses) {
            if (c.getCode().equals(courseCode)) {
                courseToUpdate = c;
                existingCourse = true;
            }
        }

        if (existingProfessor && existingCourse) {
            courseToUpdate.setProfessor(professorToAssign);
            professorToAssign.addCourse(courseToUpdate);
        } else {
            System.out.println("No se encontró el profesor y/o curso.");
        }
    }

    public void listProfessors() {
        System.out.println("Profesores:");
        for (Professor p : professors) {
            p.showInfo();
        }
    }

    public void listCourses() {
        System.out.println("Cursos:");
        for (Course c : courses) {
            c.showInfo();
        }
    }

    public void searchProfessorId(String id) {
        boolean existingProfessor = false;
        for (Professor p : professors) {
            if (p.getId().equals(id)) {
                p.showInfo();
                existingProfessor = true;
                break;
            }
        }

        if (!existingProfessor) {
            System.out.println("Profesor no encontrado.");
        }
    }

    public void searchCourseCode(String code) {
        boolean existingCourse = false;
        for (Course c : courses) {
            if (c.getCode().equals(code)) {
                c.showInfo();
            }
        }

        if (!existingCourse) {
            System.out.println("Curso no encontrado.");
        }
    }

    public void deleteCourse(String code) {
        Course toDelete = null;
        Professor toDeleteProfessor = null;
        boolean existingCourse = false;
        for (Course c : courses) {
            if (c.getCode().equals(code)) {
                existingCourse = true;
                toDelete = c;
                toDeleteProfessor = c.getProfessor();
            }
        }

        if (existingCourse) {
            courses.remove(toDelete);
            toDeleteProfessor.deleteCourse(toDelete);
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    public void deleteProfessor(String id) {
        Professor toDelete = null;
        boolean existingProfessor = false;
        for (Professor p : professors) {
            if (p.getId().equals(id)) {
                toDelete = p;
                existingProfessor = true;
            }
        }

        // Iterar por los cursos y si tienen el profesor a borrar, setear profesor en null
        for (Course c : courses) {
            if (c.getProfessor() != null && c.getProfessor().equals(toDelete)) {
                c.setProfessor(null);
            }
        }

        professors.remove(toDelete);
    }
}