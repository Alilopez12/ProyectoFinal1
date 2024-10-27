package co.edu.uniquindio.proyectofinal1.service;

import co.edu.uniquindio.proyectofinal1.model.EstadoProducto;
import co.edu.uniquindio.proyectofinal1.model.Producto;
import co.edu.uniquindio.proyectofinal1.model.Publicacion;
import co.edu.uniquindio.proyectofinal1.model.Usuario;

import java.util.List;

public interface ICrudProducto {
    boolean crearProducto(String nombre, String idProducto, String imagen, String categoria, double precio, EstadoProducto estadoProducto, List<Publicacion> listPublicaciones);
    boolean eliminarProducto(String idProducto);
    boolean modificarProducto(String nombre, String idProducto, String imagen, String categoria, double precio, EstadoProducto estadoProducto, List<Publicacion> listPublicaciones);
    Usuario buscarProducto(String idProducto);
    List<Producto> listarProductos();

    boolean verificarProductoExistente(String idProducto);
}
