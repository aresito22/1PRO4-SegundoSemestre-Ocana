package Ejercicio_05;

public class Owner {
    private String name;
    private String documentNumber;
    private Computer computer;

    public Owner(String name, String documentNumber) {
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

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", computer=" + (computer != null ? computer.getSerialNumber() : "None") +
                '}';
    }
}