package co.edu.uniquindio.proyectofinal1.model;

import co.edu.uniquindio.proyectofinal1.model.builder.VendedorBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Vendedor extends Usuario{

    Collection<Producto> listaProductos = new ArrayList<>();
    Collection<Chat> listaChats = new ArrayList<>();
    private Muro muroProductos;
    private TableroDeControl tableroDeControl;

    public Vendedor(String nombre, String apellidos, String cedula, String direccion, String contraseña,
                    Collection<Producto> listaProductos, Collection<Chat> listaChats, Muro muroProductos, TableroDeControl tableroDeControl) {
        super(nombre, apellidos, cedula, direccion, contraseña);
        this.listaProductos = listaProductos;
        this.listaChats = listaChats;
        this.muroProductos = muroProductos;
        this.tableroDeControl = tableroDeControl;
    }

    public static VendedorBuilder builder() {
        return new VendedorBuilder();
    }

    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Collection<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Collection<Chat> getListaChats() {
        return listaChats;
    }

    public void setListaChats(Collection<Chat> listaChats) {
        this.listaChats = listaChats;
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
                "ListProductos=" + listaProductos +
                ", listChats=" + listaChats +
                ", muroProductos=" + muroProductos +
                ", tableroDeControl=" + tableroDeControl +
                '}';
    }


}
