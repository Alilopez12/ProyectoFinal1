package co.edu.uniquindio.proyectofinal1.model.builder;

import co.edu.uniquindio.proyectofinal1.model.Usuario;


public abstract class UsuarioBuilder<T extends UsuarioBuilder<T>> {
    protected String nombre;
    protected String apellidos;
    protected String cedula;
    protected String direccion;
    protected String contraseña;

    public T nombre(String nombre) {
        this.nombre = nombre;
        return self();
    }

    public T apellidos(String apellidos) {
        this.apellidos = apellidos;
        return self();
    }

    public T cedula(String cedula) {
        this.cedula = cedula;
        return self();
    }

    public T direccion(String direccion) {
        this.direccion = direccion;
        return self();
    }

    public T contraseña(String contraseña) {
        this.contraseña = contraseña;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public abstract Usuario build();


}


