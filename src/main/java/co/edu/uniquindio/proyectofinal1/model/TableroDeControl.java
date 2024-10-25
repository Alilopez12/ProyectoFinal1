package co.edu.uniquindio.proyectofinal1.model;

public class TableroDeControl {
    private int cantidadMensajes;
    private int cantidadProductos;
    private int cantidadContactos;

    public TableroDeControl(int cantidadMensajes, int cantidadProductos, int cantidadContactos) {
        this.cantidadMensajes = cantidadMensajes;
        this.cantidadProductos = cantidadProductos;
        this.cantidadContactos = cantidadContactos;
    }

    public int getCantidadMensajes() {
        return cantidadMensajes;
    }

    public void setCantidadMensajes(int cantidadMensajes) {
        this.cantidadMensajes = cantidadMensajes;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public int getCantidadContactos() {
        return cantidadContactos;
    }

    public void setCantidadContactos(int cantidadContactos) {
        this.cantidadContactos = cantidadContactos;
    }

    @Override
    public String toString() {
        return "TableroDeControl{" +
                "cantidadMensajes=" + cantidadMensajes +
                ", cantidadProductos=" + cantidadProductos +
                ", cantidadContactos=" + cantidadContactos +
                '}';
    }
}
