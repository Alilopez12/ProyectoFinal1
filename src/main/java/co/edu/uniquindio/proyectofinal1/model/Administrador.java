package co.edu.uniquindio.proyectofinal1.model;


import co.edu.uniquindio.proyectofinal1.model.builder.AdministradorBuilder;

public class Administrador extends Usuario{

    public Administrador(String nombre, String apellidos, String cedula, String direccion, String contraseña) {
        super(nombre, apellidos, cedula, direccion, contraseña);
    }

    public static AdministradorBuilder builder() {
        return new AdministradorBuilder();
    }

}
