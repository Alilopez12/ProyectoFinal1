package co.edu.uniquindio.proyectofinal1.model;

import co.edu.uniquindio.proyectofinal1.model.Producto;
import co.edu.uniquindio.proyectofinal1.model.Publicacion;

import java.time.LocalDateTime;
import java.util.List;

public class PublicacionFacade {

    /**
     * Crea una nueva publicación y la asocia al producto dado.
     *
     * @param producto El producto al que se asociará la publicación.
     * @param likes Cantidad inicial de likes para la publicación.
     * @return La publicación creada.
     */
    public Publicacion crearPublicacion(Producto producto, int likes) {
        // Crear una nueva publicación
        Publicacion publicacion = new Publicacion(LocalDateTime.now(), likes, null);

        // Asociar la publicación al producto
        producto.getListPublicaciones().add(publicacion);

        return publicacion;
    }

    /**
     * Devuelve las publicaciones asociadas a un producto.
     *
     * @param producto El producto para el cual se quieren obtener las publicaciones.
     * @return Lista de publicaciones asociadas.
     */
    public List<Publicacion> obtenerPublicaciones(Producto producto) {
        return producto.getListPublicaciones();
    }
}

