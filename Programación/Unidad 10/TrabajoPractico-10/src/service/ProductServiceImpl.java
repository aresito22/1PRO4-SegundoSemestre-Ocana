package service;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import model.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductDAO dao = new ProductDAOImpl();

    @Override
    public void create(Product product) throws Exception {
        if (product.getName() == null || product.getName().isBlank()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0");
        }
        if (product.getQuantity() <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0.");
        }
        if (!dao.existsCategory(product.getCategoryId())) {
            throw new IllegalArgumentException("La categoría no existe.");
        }
        dao.create(product);
    }

    @Override
    public Product read(int id) throws SQLException {
        return dao.read(id);
    }

    @Override
    public void update(Product product) throws Exception {
        if (product.getName() == null || product.getName().isBlank()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0.");
        }
        if (product.getQuantity() <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0.");
        }
        dao.update(product);
    }

    @Override
    public void delete(int id) throws SQLException {
        dao.delete(id);
    }

    @Override
    public List<Product> list() throws SQLException {
        return dao.list();
    }

    @Override
    public List<Product> listByCategory(int categoryId) throws SQLException {
        return dao.listByCategory(categoryId);
    }
}