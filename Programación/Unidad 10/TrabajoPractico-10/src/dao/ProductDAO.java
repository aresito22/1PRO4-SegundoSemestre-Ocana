package dao;

import model.Product;
import java.sql.SQLException;
import java.util.List;

public interface ProductDAO extends GenericDAO<Product> {
    List<Product> listByCategory(int categoryId) throws SQLException;
    boolean existsCategory(int categoryId) throws SQLException;
}