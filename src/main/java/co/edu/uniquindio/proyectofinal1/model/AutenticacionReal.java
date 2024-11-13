package co.edu.uniquindio.proyectofinal1.model;

import co.edu.uniquindio.proyectofinal1.service.IAutenticacion;

import java.util.HashMap;
import java.util.Map;

public class AutenticacionReal implements IAutenticacion {

    private Map<String, String> usuarios = new HashMap<>();
    private Map<String, String> contrasenas = new HashMap<>();
    private Map<String, String> roles = new HashMap<>();

    public AutenticacionReal() {

        usuarios.put("adminUser", "admin");
        contrasenas.put("adminUser", "12345");
        roles.put("adminUser", "ADMIN");

        usuarios.put("vendedorUser", "vendedor");
        contrasenas.put("vendedorUser", "67890");
        roles.put("vendedorUser", "VENDEDOR");
    }

    @Override
    public boolean autenticar(String usuario, String contrasena) {
        return contrasenas.containsKey(usuario) && contrasenas.get(usuario).equals(contrasena);
    }

    @Override
    public String obtenerRolUsuario(String usuario) {
        return roles.getOrDefault(usuario, "UNKNOWN");
    }


}