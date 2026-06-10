package dominio;

import enumerables.Estado;
import enumerables.FormaPago;
import interfaces.Calculable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Base implements Calculable {
    private LocalDate fecha;
    private Estado estado;
    private double total;
    private FormaPago formaPago;
    private List<DetallePedido> detallePedidos;

    public Pedido(FormaPago formaPago) {
        fecha = LocalDate.now();
        estado = Estado.INVALIDO;
        total = 0.0;
        setFormaPago(formaPago);
        detallePedidos = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public double getTotal() {
        return total;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallePedidos;
    }

    public void setDetallePedidos(List<DetallePedido> detallePedidos) {
        this.detallePedidos = detallePedidos;
    }

    private void recalcularTotal() {
        total = 0;
        for (DetallePedido d : detallePedidos) {
            total += d.getSubtotal();
        }
    }

    @Override
    public void calcularTotal() {
        recalcularTotal();
    }

    public void validarPedido() {
        this.estado = Estado.CONFIRMADO;
    }

    public void addDetallePedido(int cantidad, Producto producto) {
        if (findDetallePedidoByProducto(producto) != null) {
            System.out.println("Producto ya existe en el pedido.");
            return;
        }

        if (cantidad > producto.getStock()) {
            System.out.println("Stock insuficiente.");
            return;
        }
        DetallePedido detalle = new DetallePedido(producto, cantidad);
        producto.validarVenta(cantidad);
        detallePedidos.add(detalle);
        recalcularTotal();
        this.estado = Estado.PENDIENTE;
    }

    public DetallePedido findDetallePedidoByProducto(Producto producto) {
        boolean encontrado = false;
        for (DetallePedido detallePedido : detallePedidos) {
            if (detallePedido.getProducto().equals(producto)) {
                encontrado = true;
                return detallePedido;
            }
        }
        if (!encontrado) {
            System.out.println("Producto " + producto.getNombre() + " no encontrado");
        }
        return null;
    }

    public void deleteDetallePedidoByProducto(Producto producto) {
        DetallePedido detalle = findDetallePedidoByProducto(producto);
        if (detalle != null) {
            detallePedidos.remove(detalle);
            recalcularTotal();
            if (detallePedidos.isEmpty()) {
                this.estado = Estado.INVALIDO;
            }
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                super.toString() +
                "fecha=" + fecha +
                ", estado=" + estado +
                ", total=" + total +
                ", formaPago=" + formaPago +
                ", detallePedidos=" + detallePedidos +
                '}';
    }
}
