package Ejercicio_01;

public class Person {
    private String name;
    private String documentNumber;
    private Passport passport;

    public Person(String name, String documentNumber) {
        this.name = name;
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        if (!documentNumber.isEmpty()) {
            this.documentNumber = documentNumber;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", passport=" + (passport != null ? passport.getNumber() : "None") +
                '}';
    }
}