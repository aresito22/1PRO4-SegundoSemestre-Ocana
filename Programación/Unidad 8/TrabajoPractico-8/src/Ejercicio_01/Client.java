package Ejercicio_01;

public class Client implements Notifiable {
    private String name;

    public Client(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede ser nulo.");
        }
        this.name = name;
    }

    @Override
    public void notify(String status) {
        System.out.println("Notificación para " + name + ": Su pedido está " + status);
    }
}
