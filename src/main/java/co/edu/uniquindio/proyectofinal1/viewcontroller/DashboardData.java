package co.edu.uniquindio.proyectofinal1.viewcontroller;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class DashboardData {
    private  IntegerProperty cantidadMensajes = new SimpleIntegerProperty();
    private  IntegerProperty cantidadContactos = new SimpleIntegerProperty();
    private  IntegerProperty cantidadProductos = new SimpleIntegerProperty();
    private  IntegerProperty cantidadProductosPublicados = new SimpleIntegerProperty();

    public IntegerProperty cantidadMensajesProperty() {
        return cantidadMensajes;
    }

    public IntegerProperty cantidadContactosProperty() {
        return cantidadContactos;
    }

    public IntegerProperty cantidadProductosProperty() {
        return cantidadProductos;
    }

    public IntegerProperty cantidadProductosPublicadosProperty() {
        return cantidadProductosPublicados;
    }

    // Métodos para obtener y actualizar los valores
    public int getCantidadMensajes() {
        return cantidadMensajes.get();
    }

    public void setCantidadMensajes(int value) {
        cantidadMensajes.set(value);
    }

    public int getCantidadContactos() {
        return cantidadContactos.get();
    }

    public int getCantidadProductosPublicados() {
        return cantidadProductosPublicados.get();
    }

    public int getCantidadProductos() {
        return cantidadProductos.get();
    }

    public void setCantidadProductos(int value) {
        cantidadProductos.set(value);
    }

    public void setCantidadProductosPublicados(int value) {
        cantidadProductosPublicados.set(value);
    }

    public void setCantidadContactos(int cantidadContactos) {
        this.cantidadContactos.set(cantidadContactos);
    }
}
