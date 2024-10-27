package co.edu.uniquindio.proyectofinal1.model.builder;


import co.edu.uniquindio.proyectofinal1.model.Administrador;

public class AdministradorBuilder extends UsuarioBuilder<AdministradorBuilder> {

    @Override
    public Administrador build() {
        return new Administrador(nombre, apellidos, cedula, direccion, contraseña);
    }

    @Override
    protected AdministradorBuilder self() {
        return this;
    }

}
