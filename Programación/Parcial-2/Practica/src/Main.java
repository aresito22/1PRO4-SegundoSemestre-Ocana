import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> historyBooks = new ArrayList<>();
        Book ww2 = new Book("La segunda guera mundial", 150, "Nombre Apellido", 10, "1", true);
        Book coldWar = new Book("La guerra fría", 125, "Nombre Apellido", 10, "2", true);
        historyBooks.add(ww2);
        historyBooks.add(coldWar);

        List<Book> politicalBooks = new ArrayList<>();
        Book democracy = new Book("Democracia en América", 90, "Alexis de Tocqueville", 10, "3", true);
        Book dictatorship = new Book("Dictaduras y Dualidad de Criterios", 75, "Jeane Kirkpatrick", 10, "4", true);
        politicalBooks.add(democracy);
        politicalBooks.add(dictatorship);

        List<Book> businessBooks = new ArrayList<>();
        Book biz1 = new Book("Libro de Negocios", 95, "Nombre Apellido", 10, "5", true);
        Book biz2 = new Book("Libro de Negocios 2", 85, "Nombre Apellido", 10, "6", true);
        businessBooks.add(biz1);
        businessBooks.add(biz2);

        Genre history = new Genre("Historia", "Libros sobre eventos históricos.", historyBooks);
        Genre politics = new Genre("Política", "Libros sobre política", politicalBooks);
        Genre business = new Genre("Negocios", "Libros sobre negocios",  businessBooks);

        Client admin = new Client("Luján", "Crenna", "lujcre@mail.com", "123", "pass1", Role.ADMIN);
        Client client = new Client("Franco", "Ghiretti", "fraghi@mail.com", "456", "pass2", Role.CLIENT);

        List<OrderDetail> testOrderDetails1 = new ArrayList<>();
        OrderDetail testOrderDetail1 = new OrderDetail(1, ww2);
        OrderDetail testOrderDetail2 = new OrderDetail(2, coldWar);
        OrderDetail testOrderDetail3 = new OrderDetail(3, democracy);
        testOrderDetails1.add(testOrderDetail1);
        testOrderDetails1.add(testOrderDetail2);
        testOrderDetails1.add(testOrderDetail3);

        Order order1 = new Order(State.PENDING, PaymentMethod.CARD, testOrderDetails1, admin);
    }
}
