package service;

import model.Product;
import java.sql.SQLException;
import java.util.List;

public interface ProductService {
    void create(Product product) throws Exception;
    Product read(int id) throws SQLException;
    void update(Product product) throws Exception;
    void delete(int id) throws SQLException;
    List<Product> list() throws SQLException;
    List<Product> listByCategory(int categoryId) throws SQLException;
}