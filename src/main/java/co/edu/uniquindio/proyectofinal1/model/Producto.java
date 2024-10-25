package co.edu.uniquindio.proyectofinal1.model;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombre;
    private String imagen;
    private String categoria;
    private double precio;
    private EstadoProducto estadoProducto;
    List<Publicacion> listPublicaciones = new ArrayList<>();

    public Producto(String nombre, String imagen, String categoria, double precio, EstadoProducto estadoProducto, List<Publicacion> listPublicaciones) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estadoProducto = estadoProducto;
        this.listPublicaciones = listPublicaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoProducto getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public List<Publicacion> getListPublicaciones() {
        return listPublicaciones;
    }

    public void setListPublicaciones(List<Publicacion> listPublicaciones) {
        this.listPublicaciones = listPublicaciones;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", imagen='" + imagen + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", estadoProducto=" + estadoProducto +
                ", listPublicaciones=" + listPublicaciones +
                '}';
    }
}
