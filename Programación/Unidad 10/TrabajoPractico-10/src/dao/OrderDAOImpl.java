package dao;

import model.Order;
import model.OrderItem;
import util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl implements GenericDAO<Order> {

    @Override
    public void create(Order order) throws SQLException {
        String sql = "INSERT INTO orders (date, total) VALUES (?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setDate(1, Date.valueOf(order.getDate()));
            stmt.setDouble(2, order.getTotal());
            stmt.executeUpdate();
            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next()) {
                order.setId(keys.getInt(1));
            }
        }
    }

    @Override
    public Order read(int id) throws SQLException {
        String sql = "SELECT * FROM orders WHERE id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapRow(rs);
            }
        }
        return null;
    }

    @Override
    public void update(Order order) throws SQLException {
        String sql = "UPDATE orders SET date = ?, total = ? WHERE id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setDate(1, Date.valueOf(order.getDate()));
            stmt.setDouble(2, order.getTotal());
            stmt.setInt(3, order.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM orders WHERE id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    @Override
    public List<Order> list() throws SQLException {
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT * FROM orders";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                orders.add(mapRow(rs));
            }
        }
        return orders;
    }

    public void showOrderDetail(int orderId) throws SQLException {
        String sql =
                "SELECT o.id AS order_id, o.date, o.total, " +
                        "       p.name AS product_name, c.name AS category_name, " +
                        "       oi.quantity, oi.subtotal " +
                        "FROM orders o " +
                        "JOIN order_items oi ON o.id = oi.order_id " +
                        "JOIN products p ON oi.product_id = p.id " +
                        "JOIN categories c ON p.category_id = c.id " +
                        "WHERE o.id = ?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            ResultSet rs = stmt.executeQuery();

            System.out.println("=== Order Detail #" + orderId + " ===");
            double total = 0;
            while (rs.next()) {
                if (total == 0) {
                    System.out.println("Date: " + rs.getDate("date"));
                }
                System.out.println("Product: " + rs.getString("product_name") +
                        " | Category: " + rs.getString("category_name") +
                        " | Quantity: " + rs.getInt("quantity") +
                        " | Subtotal: $" + rs.getDouble("subtotal"));
                total = rs.getDouble("total");
            }
            System.out.println("Total: $" + total);
        }
    }

    private Order mapRow(ResultSet rs) throws SQLException {
        Order order = new Order();
        order.setId(rs.getInt("id"));
        order.setDate(rs.getDate("date").toLocalDate());
        order.setTotal(rs.getDouble("total"));
        return order;
    }
}