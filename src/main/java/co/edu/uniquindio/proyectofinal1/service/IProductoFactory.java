package co.edu.uniquindio.proyectofinal1.service;

import co.edu.uniquindio.proyectofinal1.model.EstadoProducto;
import co.edu.uniquindio.proyectofinal1.model.Producto;

public interface IProductoFactory {

    Producto crearProducto(String nombre, String idProducto, String imagen, double precio, EstadoProducto estado);

}
