package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria extends Base {
    private String nombre;
    private String descripcion;
    private List<Producto> productos;

    public Categoria(String nombre, String descripcion) {
        setNombre(nombre);
        setDescripcion(descripcion);
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty() || nombre.isBlank()) {
            throw new IllegalArgumentException("Error: el nombre es obligatorio.");
        }
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.isEmpty() || descripcion.isBlank()) {
            throw new IllegalArgumentException("Error: la descripción es obligatoria.");
        }
        this.descripcion = descripcion;
    }

    public List<Producto> getProducto() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void addItem(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Error: el producto no puede ser null.");
        }
        this.productos.add(producto);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Categoria categoria)) return false;
        return Objects.equals(nombre, categoria.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, productos);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                super.toString() +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", productos=" + productos +
                '}';
    }
}
