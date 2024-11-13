package co.edu.uniquindio.proyectofinal1.service;

public interface IAutenticacion {

    boolean autenticar(String usuario, String contrasena);
    String obtenerRolUsuario(String usuario);

}
