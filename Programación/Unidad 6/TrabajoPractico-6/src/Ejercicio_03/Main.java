package Ejercicio_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("---TAREA 1---");
        Professor bernersLee = new Professor("1", "Tim Berners-Lee", "Informática");
        Professor oppenheimer = new Professor("2", "J. Robert Oppenheimer", "Física y Química");
        Professor albright = new Professor("3", "Madeleine Albright", "Relaciones Internacionales");

        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(bernersLee);
        professors.add(oppenheimer);
        professors.add(albright);

        Course computerScience = new Course("A", "Informática para Principiantes", bernersLee);
        Course webDesign = new Course("B", "Diseño web", bernersLee);
        Course physics = new Course("C", "Física Atómica", oppenheimer);
        Course history = new Course("D", "Historia Moderna", albright);
        Course politics = new Course("E", "Política Global", null);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(computerScience);
        courses.add(webDesign);
        courses.add(physics);
        courses.add(history);
        courses.add(politics);

        // 2
        System.out.println("\n---TAREA 2---");
        University ugc = new University("Universidad de Godoy Cruz");
        ugc.setProfessors(professors);
        ugc.setCourses(courses);

        // 3
        System.out.println("\n---TAREA 3---");
        ugc.assignProfessorToCourse("E", "3");

        // 4
        System.out.println("\n---TAREA 4---");
        ugc.listCourses();
        ugc.listProfessors();

        // 5
        System.out.println("\n---TAREA 5---");
        history.setProfessor(oppenheimer);
        System.out.println(history.getProfessor());
        System.out.println(oppenheimer.getCourses());
        System.out.println(albright.getCourses());

        // 6
        System.out.println("\n---TAREA 6---");
        ugc.deleteCourse("B");
        System.out.println(bernersLee.getCourses());

        // 7
        System.out.println("\n---TAREA 7---");
        ugc.deleteProfessor("2");
        physics.showInfo();

        // 8
        System.out.println("\n---TAREA 8---");
        System.out.println("Cantidad de cursos por profesor: ");
        for (Professor p : professors) {
            System.out.println(p.getName() + ": " + p.getCourses().size());
        }
    }
}