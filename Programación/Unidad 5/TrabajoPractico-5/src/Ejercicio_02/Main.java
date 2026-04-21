package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        User user = new User("Steve Jobs", "87654321");
        Battery battery = new Battery("Li-Ion", 1400);
        Cellphone cellphone = new Cellphone("123456789012345", "Apple", "iPhone", user, battery);

        user.setCellphone(cellphone);

        System.out.println(user.toString());
        System.out.println(cellphone.toString());
    }
}