package service;

import model.Category;
import java.sql.SQLException;
import java.util.List;

public interface CategoryService {
    void create(Category category) throws Exception;
    Category read(int id) throws SQLException;
    void update(Category category) throws Exception;
    void delete(int id) throws SQLException;
    List<Category> list() throws SQLException;
}