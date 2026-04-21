package Ejercicio_06;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Martin Rodriguez", "555-1234");
        Table table = new Table(4, 6);
        Reservation reservation = new Reservation("2026-05-10", "21:00", client, table);

        System.out.println(client.toString());
        System.out.println(table.toString());
        System.out.println(reservation.toString());
    }
}