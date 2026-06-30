package service;

import model.Order;
import java.sql.SQLException;
import java.util.List;

public interface OrderService {
    void create(Order order) throws Exception;
    void showDetail(int orderId) throws SQLException;
    List<Order> list() throws SQLException;
}