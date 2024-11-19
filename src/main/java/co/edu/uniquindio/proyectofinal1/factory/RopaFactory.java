package co.edu.uniquindio.proyectofinal1.factory;

import co.edu.uniquindio.proyectofinal1.model.EstadoProducto;
import co.edu.uniquindio.proyectofinal1.model.Producto;
import co.edu.uniquindio.proyectofinal1.service.IProductoFactory;

public class RopaFactory implements IProductoFactory {

    @Override
    public Producto crearProducto(String nombre, String idProducto, String imagen, double precio, EstadoProducto estado) {
        return Producto.builder()
                .nombre(nombre)
                .idProducto(idProducto)
                .imagen(imagen)
                .categoria("Ropa")
                .precio(precio)
                .estadoProducto(estado)
                .build();
    }
}
