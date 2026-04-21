package Ejercicio_06;

public class Client {
    private String name;
    private String phone;

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (!phone.isEmpty()) {
            this.phone = phone;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}