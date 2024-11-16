package co.edu.uniquindio.proyectofinal1.controller;

import co.edu.uniquindio.proyectofinal1.model.Vendedor;

public class VendedorController {

    public void agregarContacto(Vendedor vendedor, Vendedor vendedorContacto) {
        String resultado = vendedor.agregarContacto(vendedorContacto);
        System.out.println(resultado);
    }
}