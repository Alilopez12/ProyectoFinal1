package co.edu.uniquindio.proyectofinal1.model;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private String titulo;
    List<Mensaje> listMensajes = new ArrayList<>();

    public Chat(String titulo, List<Mensaje> listMensajes) {
        this.titulo = titulo;
        this.listMensajes = listMensajes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Mensaje> getListMensajes() {
        return listMensajes;
    }

    public void setListMensajes(List<Mensaje> listMensajes) {
        this.listMensajes = listMensajes;
    }

    @Override
    public String  toString() {
        return "Chat{" +
                "titulo='" + titulo + '\'' +
                ", listMensajes=" + listMensajes +
                '}';
    }
}
