package co.edu.uniquindio.proyectofinal1.model;

import co.edu.uniquindio.proyectofinal1.factory.ModelFactory;
import co.edu.uniquindio.proyectofinal1.service.IAutenticacion;

public class AutenticacionReal implements IAutenticacion {

    private ModelFactory modelFactory;

    public AutenticacionReal() {
        this.modelFactory = ModelFactory.getInstance();
    }

    @Override
    public boolean autenticar(String usuario, String contrasena) {

        for (Usuario user : modelFactory.getMarketPlace().getListUsuarios()) {
            if (user.getCedula().equals(usuario) && user.getContraseña().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String obtenerRolUsuario(String usuario) {

        for (Usuario user : modelFactory.getMarketPlace().getListUsuarios()) {
            if (user.getCedula().equals(usuario)) {

                if (user instanceof Administrador) {
                    return "ADMIN";
                } else if (user instanceof Vendedor) {
                    return "VENDEDOR";
                }
            }
        }
        return "UNKNOWN";
    }
}