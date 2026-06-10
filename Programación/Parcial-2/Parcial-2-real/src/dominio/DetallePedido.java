package dominio;

public class DetallePedido extends Base {
    private Producto producto;
    private int cantidad;
    private double subtotal;
    private boolean valido;

    public DetallePedido(Producto producto, int cantidad) {
        setProducto(producto);
        setCantidad(cantidad);
        calcularSubtotal();
    }


    public void setProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Error: el producto no puede ser null.");
        }
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Error: cantidad menor a 0.");
        }
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    private void calcularSubtotal() {
        this.subtotal = cantidad * producto.getPrecio();
    }

    private void validar(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Error: el producto no puede ser null.");
        }
        producto.validarVenta(this.cantidad);
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                super.toString() +
                "producto=" + producto +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", valido=" + valido +
                '}';
    }
}