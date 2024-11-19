package co.edu.uniquindio.proyectofinal1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    private Producto producto;
    private LocalDateTime fechaPublicacion;
    private int likes;
    List<Comentario> listComentarios = new ArrayList<>();


    public Publicacion(LocalDateTime fechaPublicacion, int likes, List<Comentario> listComentarios) {
        this.fechaPublicacion = fechaPublicacion;
        this.likes = likes;
        this.listComentarios = listComentarios;
    }
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comentario> getListComentarios() {
        return listComentarios;
    }

    public void setListComentarios(List<Comentario> listComentarios) {
        this.listComentarios = listComentarios;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "fechaPublicacion=" + fechaPublicacion +
                ", likes=" + likes +
                ", listComentarios=" + listComentarios +
                '}';
    }
}
