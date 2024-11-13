package co.edu.uniquindio.proyectofinal1.model;

import co.edu.uniquindio.proyectofinal1.service.IAutenticacion;

public class AutenticacionProxy implements IAutenticacion {

    private AutenticacionReal autenticacionReal;

    public AutenticacionProxy() {
        this.autenticacionReal = new AutenticacionReal();
    }

    @Override
    public boolean autenticar(String usuario, String contrasena) {

        if (autenticacionReal.autenticar(usuario, contrasena)) {

            String rol = autenticacionReal.obtenerRolUsuario(usuario);
            cargarInterfazPorRol(rol);
            return true;

        } else {

            System.out.println("Autenticación fallida: usuario o contraseña incorrectos.");
            return false;
        }
    }

    @Override
    public String obtenerRolUsuario(String usuario) {
        return autenticacionReal.obtenerRolUsuario(usuario);
    }

    private void cargarInterfazPorRol(String rol) {
        switch (rol) {
            case "ADMIN":
                System.out.println("Cargando la interfaz de administrador...");

                break;
            case "VENDEDOR":
                System.out.println("Cargando la interfaz de vendedor...");

                break;
            default:
                System.out.println("Rol desconocido. No se puede cargar la interfaz.");
                break;
        }
    }
}