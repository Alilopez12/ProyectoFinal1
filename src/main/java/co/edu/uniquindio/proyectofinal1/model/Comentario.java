package co.edu.uniquindio.proyectofinal1.model;

public class Comentario {
    private String comentario;
    private Publicacion publicacion;

    public Comentario(String comentario, Publicacion publicacion) {
        this.comentario = comentario;
        this.publicacion = publicacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "comentario='" + comentario + '\'' +
                ", publicacion=" + publicacion +
                '}';
    }
}
