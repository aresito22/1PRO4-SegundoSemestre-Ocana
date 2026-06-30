package service;

import dao.OrderDAOImpl;
import dao.OrderItemDAOImpl;
import dao.ProductDAOImpl;
import model.Order;
import model.OrderItem;
import model.Product;
import util.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderDAOImpl orderDAO = new OrderDAOImpl();
    private OrderItemDAOImpl itemDAO = new OrderItemDAOImpl();
    private ProductDAOImpl productDAO = new ProductDAOImpl();

    @Override
    public void create(Order order) throws Exception {
        if (order.getItems() == null || order.getItems().isEmpty()) {
            throw new IllegalArgumentException("El pedido debe tener al menos un item.");
        }

        // validate stock before touching the database
        for (OrderItem item : order.getItems()) {
            Product product = productDAO.read(item.getProductId());
            if (product == null) {
                throw new IllegalArgumentException("ID " + item.getProductId() + " no existe.");
            }
            if (item.getQuantity() > product.getQuantity()) {
                throw new IllegalArgumentException("Stock insuficiente para producto: " + product.getName());
            }
        }

        Connection con = null;
        try {
            con = DatabaseConnection.getConnection();
            con.setAutoCommit(false);

            // insert the order header
            orderDAO.create(order);

            // insert each item and reduce stock
            for (OrderItem item : order.getItems()) {
                item.setOrderId(order.getId());
                itemDAO.create(item);

                // reduce product stock
                Product product = productDAO.read(item.getProductId());
                product.setQuantity(product.getQuantity() - item.getQuantity());
                productDAO.update(product);
            }

            con.commit();
            System.out.println("Pedido creado exitosamente. ID: " + order.getId());

        } catch (Exception e) {
            if (con != null) con.rollback();
            throw new Exception("Creación de pedido fallida, transacción cancelada: " + e.getMessage());
        } finally {
            if (con != null) {
                con.setAutoCommit(true);
                con.close();
            }
        }
    }

    @Override
    public void showDetail(int orderId) throws SQLException {
        orderDAO.showOrderDetail(orderId);
    }

    @Override
    public List<Order> list() throws SQLException {
        return orderDAO.list();
    }
}