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
    private List<Comentario> comentarios = new ArrayList<>();




    public Vendedor(String nombre, String apellidos, String cedula, String direccion, String contraseña, Collection<Producto> listaProductos, Collection<Chat> listaChats, Muro muroProductos, TableroDeControl tableroDeControl, List<Vendedor> contactos) {
        super(nombre, apellidos, cedula, direccion, contraseña);
        this.listaProductos = listaProductos;
        this.listaChats = listaChats;
        this.muroProductos = muroProductos;
        this.tableroDeControl = tableroDeControl;
        this.contactos = new ArrayList<>();
        this.comentarios = new ArrayList<>();
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
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public boolean agregarComentario(String comentarioTexto, Producto producto, Vendedor vendedorQueComenta) {

        if (producto.getEstadoProducto() != EstadoProducto.PUBLICADO) {
            System.out.println("El producto no está en estado PUBLICADO.");
            return false;
        }

        if (!this.contactos.contains(vendedorQueComenta)) {
            System.out.println("No tienes permiso para comentar en este producto.");
            return false;
        }

        Publicacion publicacion = producto.getListPublicaciones().stream().findFirst().orElse(null);
        if (publicacion == null) {
            System.out.println("El producto no tiene una publicación asociada.");
            return false;
        }

        Comentario comentario = new Comentario(comentarioTexto, publicacion, vendedorQueComenta);
        publicacion.getListComentarios().add(comentario);

        System.out.println("Comentario agregado exitosamente.");
        return true;
    }

    private void notificarNuevoComentario(Comentario comentario) {
        //información del comentario y la publicación
        String comentarioTexto = comentario.getComentario();
        String productoAsociado = comentario.getPublicacion().getProducto().getNombre();

        // Notificación en consola (puedes integrar un sistema de eventos o enviar notificaciones reales)
        System.out.println("¡Nuevo comentario recibido!");
        System.out.println("Comentario: " + comentarioTexto);
        System.out.println("Producto: " + productoAsociado);
        System.out.println("Publicado en: " + comentario.getPublicacion().toString());
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