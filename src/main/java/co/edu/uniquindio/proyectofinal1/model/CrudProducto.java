package co.edu.uniquindio.proyectofinal1.model;

import co.edu.uniquindio.proyectofinal1.model.builder.ProductoBuilder;

public class CrudProducto {
    private String idProducto;
    private String nombre;
    private double precio;
    private int cantDisponible;

    public CrudProducto() {
    }

    public CrudProducto(String idProducto, String nombre, double precio, int cantDisponible) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
    }

    public static ProductoBuilder builder() {
        return new ProductoBuilder();
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }



    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantDisponible=" + cantDisponible +
                '}';
    }
}
