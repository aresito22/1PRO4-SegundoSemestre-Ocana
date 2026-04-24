package Ejercicio_02;

import Ejercicio_01.ErrorMessages;

public class Author {
    private String id;
    private String name;
    private String nationality;

    public Author(String id, String name, String nationality) {
        setId(id);
        setName(name);
        setNationality(nationality);
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if (!nationality.isEmpty()) {
            this.nationality = nationality;
        } else {
            System.out.println(ErrorMessages.EMPTY_FIELD);
        }
    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + name);
        System.out.println("Nacionalidad: " + nationality);
        System.out.println(" ");
    }
}
