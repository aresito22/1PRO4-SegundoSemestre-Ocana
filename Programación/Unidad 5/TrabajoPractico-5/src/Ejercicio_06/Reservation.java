package Ejercicio_06;

public class Reservation {
    private String date;
    private String time;
    private Client client;
    private Table table;

    public Reservation(String date, String time, Client client, Table table) {
        this.date = date;
        this.time = time;
        this.client = client;
        this.table = table;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (!date.isEmpty()) {
            this.date = date;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        if (!time.isEmpty()) {
            this.time = time;
        } else {
            System.out.println("Error: campo vacío.");
        }
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", client=" + (client != null ? client.getName() : "None") +
                ", table=" + (table != null ? table.getNumber() : "None") +
                '}';
    }
}