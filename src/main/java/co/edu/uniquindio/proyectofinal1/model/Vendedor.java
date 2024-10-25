package co.edu.uniquindio.proyectofinal1.model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
    List<Producto> ListProductos = new ArrayList<>();
    List<Chat> listChats = new ArrayList<>();
    private Muro muroProductos;
    private TableroDeControl tableroDeControl;

    public Vendedor(String nombre, String apellidos, String cedula, String direccion, String contraseña) {
        super(nombre, apellidos, cedula, direccion, contraseña);
    }

    public Vendedor(String nombre, String apellidos, String cedula, String direccion, String contraseña, List<Producto> listProductos, List<Chat> listChats, Muro muroProductos, TableroDeControl tableroDeControl) {
        super(nombre, apellidos, cedula, direccion, contraseña);
        ListProductos = listProductos;
        this.listChats = listChats;
        this.muroProductos = muroProductos;
        this.tableroDeControl = tableroDeControl;
    }

    public List<Producto> getListProductos() {
        return ListProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        ListProductos = listProductos;
    }

    public List<Chat> getListChats() {
        return listChats;
    }

    public void setListChats(List<Chat> listChats) {
        this.listChats = listChats;
    }

    public Muro getMuroProductos() {
        return muroProductos;
    }

    public void setMuroProductos(Muro muroProductos) {
        this.muroProductos = muroProductos;
    }

    public TableroDeControl getTableroDeControl() {
        return tableroDeControl;
    }

    public void setTableroDeControl(TableroDeControl tableroDeControl) {
        this.tableroDeControl = tableroDeControl;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "ListProductos=" + ListProductos +
                ", listChats=" + listChats +
                ", muroProductos=" + muroProductos +
                ", tableroDeControl=" + tableroDeControl +
                '}';
    }
}
