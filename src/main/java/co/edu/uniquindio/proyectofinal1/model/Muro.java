package co.edu.uniquindio.proyectofinal1.model;

import java.util.ArrayList;
import java.util.List;

public class Muro {
    List<Publicacion> listPublicacioness = new ArrayList<>();
    List<Chat> listChats = new ArrayList<>();

    public Muro(List<Publicacion> listPublicacioness, List<Chat> listChats) {
        this.listPublicacioness = listPublicacioness;
        this.listChats = listChats;
    }

    public List<Publicacion> getListPublicacioness() {
        return listPublicacioness;
    }

    public void setListPublicacioness(List<Publicacion> listPublicacioness) {
        this.listPublicacioness = listPublicacioness;
    }

    public List<Chat> getListChats() {
        return listChats;
    }

    public void setListChats(List<Chat> listChats) {
        this.listChats = listChats;
    }

    @Override
    public String toString() {
        return "Muro{" +
                "listPublicacioness=" + listPublicacioness +
                ", listChats=" + listChats +
                '}';
    }
}
