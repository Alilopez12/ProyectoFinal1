package co.edu.uniquindio.proyectofinal1.controller;

import co.edu.uniquindio.proyectofinal1.model.Comentario;
import co.edu.uniquindio.proyectofinal1.model.Publicacion;
import co.edu.uniquindio.proyectofinal1.model.Vendedor;

public class MediatorController {
    // agrega comentario y notifica al vendedor

    public void agregarComentario (Vendedor vendedor, Publicacion publicacion, String contenidoComentario) {
        Comentario comentario = new Comentario(contenidoComentario, publicacion, vendedor);

        // relaciona comentario con vededor
        vendedor.relacionComentario(comentario);
        System.out.println("Notificación: El vendedor " + vendedor.getNombre() + " ha recibido un nuevo comentario en la publicación: " + publicacion);
    }
}

