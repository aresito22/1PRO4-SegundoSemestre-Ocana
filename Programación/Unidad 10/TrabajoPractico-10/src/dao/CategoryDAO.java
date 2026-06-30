package dao;

import model.Category;
import java.sql.SQLException;

public interface CategoryDAO extends GenericDAO<Category> {
    boolean existsName(String name) throws SQLException;
}
