package dominio;

import java.util.Objects;

public class Producto extends Base {
    private String nombre;
    private double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private boolean disponible;
    private Categoria categoria;

    public Producto(String nombre, double precio, String descripcion, int stock, String imagen, Categoria categoria) {
        super();
        setNombre(nombre);
        setPrecio(precio);
        setDescripcion(descripcion);
        setStock(stock);
        setImagen(imagen);
        this.categoria = categoria;
        categoria.addItem(this);
        this.disponible = stock > 0;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean getDisponible() {
        return disponible;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("Error: precio negativo.");
        }
        this.precio = precio;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Error: stock negativo.");
        }
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        if (imagen.isEmpty() || imagen.isBlank()) {
            throw new IllegalArgumentException("Error: la imagen es obligatoria.");
        }
        this.imagen = imagen;
    }

    public boolean isDisponible() {
        return disponible;
    }

    private boolean validarDisponibilidad() {
        if (this.stock > 0) {
            disponible = true;
            System.out.println("Producto disponible.");
            return true;
        } else {
            disponible = false;
            System.out.println("Producto no disponible.");
            return false;
        }
    }

    private void reducirStock(int cantidad) {
        if (this.stock > 0 || cantidad > 0) {
            if (cantidad <= this.stock) {
                stock -= cantidad;
                System.out.println(this.nombre + ": stock reducido en 1.");
            } else {
                System.out.println("Error: stock insuficiente.");
            }
        } else {
            System.out.println(this.nombre + ": el producto no tiene stock para reducir o cantidad inválida.");
        }
    }

    public boolean validarVenta(int cantidad) {
        if (this.stock > 0) {
            if (cantidad > 0 && validarDisponibilidad()) {
                this.reducirStock(cantidad);
                System.out.println("Venta válidad de " + this.nombre);
                if (stock == 0) {
                    disponible = false;
                    System.out.println("Advertencia: producto agotado.");
                }
                return true;
            } else {
                return false;
            }
        }  else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Producto producto)) return false;
        return Double.compare(precio, producto.precio) == 0 && stock == producto.stock && disponible == producto.disponible && Objects.equals(nombre, producto.nombre) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(imagen, producto.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, descripcion, stock, imagen, disponible);
    }

    @Override
    public String toString() {
        return "Producto{" +
                super.toString() +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", imagen='" + imagen + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
