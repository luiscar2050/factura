package edu.misena.factura.model;

import java.util.Date;

public class ItemFactura {
private Producto producto;
private int cantidad;

    public ItemFactura(Producto producto, int cantidad) {}

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
