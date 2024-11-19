package co.edu.uniquindio.proyectofinal1.model.strategy;

import co.edu.uniquindio.proyectofinal1.model.Vendedor;
import co.edu.uniquindio.proyectofinal1.service.ISolicitudVinculoStrategy;

import java.util.List;

public class SugerenciaPorContactosStrategy implements ISolicitudVinculoStrategy {
    @Override
    public Vendedor obtenerVendedor(Vendedor solicitante) {
        List<Vendedor> sugeridos = solicitante.getContactos();
        Vendedor mejorVendedor = null;
        int maxContactosComunes = 0;

        for (Vendedor vendedor : sugeridos) {
            int contactosComunes = contarContactosComunes(solicitante, vendedor);
            if (contactosComunes > maxContactosComunes) {
                maxContactosComunes = contactosComunes;
                mejorVendedor = vendedor;
            }
        }

        if (mejorVendedor != null) {
            System.out.println("Sugerencia enviada a: " + mejorVendedor.getNombre() + " " + mejorVendedor.getApellidos());
            return mejorVendedor;
        } else {
            System.out.println("No hay vendedores sugeridos.");
            return null;
        }
    }

    private int contarContactosComunes(Vendedor vendedor1, Vendedor vendedor2) {
        int contador = 0;
        for (Vendedor contacto1 : vendedor1.getContactos()) {
            for (Vendedor contacto2 : vendedor2.getContactos()) {
                if (contacto1.getCedula().equals(contacto2.getCedula())) {
                    contador++;
                }
            }
        }
        return contador;
    }
}

