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
            return true;
        }
        return false;
    }

    @Override
    public String obtenerRolUsuario(String usuario) {
        return autenticacionReal.obtenerRolUsuario(usuario);
    }

}