package co.edu.uniquindio.proyectofinal1.model.builder;

import co.edu.uniquindio.proyectofinal1.model.Vendedor;

public class VendedorBuilder extends UsuarioBuilder<VendedorBuilder>{

    @Override
    public Vendedor build() {
        return new Vendedor(nombre, apellidos, cedula, direccion, contraseña, null, null, null, null, null);
    }

    @Override
    protected VendedorBuilder self() {
        return this;
    }

}

