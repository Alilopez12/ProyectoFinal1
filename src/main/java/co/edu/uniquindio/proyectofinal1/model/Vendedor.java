package co.edu.uniquindio.proyectofinal1.model;

import co.edu.uniquindio.proyectofinal1.model.builder.ProductoBuilder;
import co.edu.uniquindio.proyectofinal1.model.builder.VendedorBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Vendedor extends Usuario{

    Collection<Producto> listaProductos = new ArrayList<>();
    Collection<Chat> listaChats = new ArrayList<>();
    private Muro muroProductos;
    private TableroDeControl tableroDeControl;
    private List<Vendedor> contactos;



    public Vendedor(String nombre, String apellidos, String cedula, String direccion, String contraseña, Collection<Producto> listaProductos, Collection<Chat> listaChats, Muro muroProductos, TableroDeControl tableroDeControl, List<Vendedor> contactos) {
        super(nombre, apellidos, cedula, direccion, contraseña);
        this.listaProductos = listaProductos;
        this.listaChats = listaChats;
        this.muroProductos = muroProductos;
        this.tableroDeControl = tableroDeControl;
        this.contactos = contactos;
    }

    public String agregarContacto(Vendedor contacto) {
        if (this.contactos.size() >= 10) {
            return "No se puede agregar más contactos, límite alcanzado.";
        } else if (this.contactos.contains(contacto)) {
            return "El contacto ya está en la lista.";
        } else {
            this.contactos.add(contacto);
            return "Contacto agregado con éxito.";
        }
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

    public List<Vendedor> getContactos() {
        return contactos;
    }

    public void setContactos(List<Vendedor> contactos) {
        this.contactos = contactos;
    }

    public static VendedorBuilder builder() {
        return new VendedorBuilder();
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "listaProductos=" + listaProductos +
                ", listaChats=" + listaChats +
                ", muroProductos=" + muroProductos +
                ", tableroDeControl=" + tableroDeControl +
                ", contactos=" + contactos +
                '}';
    }
}
