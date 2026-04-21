package Ejercicio_02;

public class User {
    private String name;
    private String documentNumber;
    private Cellphone cellphone;

    public User(String name, String documentNumber) {
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

    public Cellphone getCellphone() {
        return cellphone;
    }

    public void setCellphone(Cellphone cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", cellphone=" + (cellphone != null ? cellphone.getImei() : "None") +
                '}';
    }
}