package service;

import dao.CategoryDAO;
import dao.CategoryDAOImpl;
import model.Category;

import java.sql.SQLException;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDAO dao = new CategoryDAOImpl();

    @Override
    public void create(Category category) throws Exception {
        if (category.getName() == null || category.getName().isBlank()) {
            throw new IllegalArgumentException("El nombre de la categoria no puede estar vacío.");
        }
        if (category.getDescription() == null || category.getDescription().isBlank()) {
            throw new IllegalArgumentException("La descripcion de la categoria no puede estar vacía.");
        }
        if (dao.existsName(category.getName())) {
            throw new IllegalArgumentException("Una categoría con ese nombre ya existe.");
        }
        dao.create(category);
    }

    @Override
    public Category read(int id) throws SQLException {
        return dao.read(id);
    }

    @Override
    public void update(Category category) throws Exception {
        if (category.getName() == null || category.getName().isBlank()) {
            throw new IllegalArgumentException("El nombre de la categoria no puede estar vacío.");
        }
        if (category.getDescription() == null || category.getDescription().isBlank()) {
            throw new IllegalArgumentException("La descripcion de la categoria no puede estar vacía.");
        }
        dao.update(category);
    }

    @Override
    public void delete(int id) throws SQLException {
        dao.delete(id);
    }

    @Override
    public List<Category> list() throws SQLException {
        return dao.list();
    }
}