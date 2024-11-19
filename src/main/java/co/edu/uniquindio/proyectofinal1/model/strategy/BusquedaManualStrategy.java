package co.edu.uniquindio.proyectofinal1.model.strategy;

import co.edu.uniquindio.proyectofinal1.model.Vendedor;
import co.edu.uniquindio.proyectofinal1.service.ISolicitudVinculoStrategy;

import java.util.Scanner;

public class BusquedaManualStrategy implements ISolicitudVinculoStrategy {
    @Override
    public Vendedor obtenerVendedor(Vendedor solicitante) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el Vendedor al que desea enviar la solicitud:");
        for (Vendedor vendedor : solicitante.getContactos()) {
            System.out.println(vendedor.getNombre() + " " + vendedor.getApellidos());
        }

        System.out.print("Ingrese el nombre completo del vendedor: ");
        String nombreSeleccionado = scanner.nextLine().trim().toLowerCase();
        for (Vendedor vendedor : solicitante.getContactos()) {
            String nombreCompleto = (vendedor.getNombre() + " " + vendedor.getApellidos()).toLowerCase();
            if (nombreCompleto.equals(nombreSeleccionado)) {
                System.out.println("Solicitud enviada a: " + vendedor.getNombre() + " " + vendedor.getApellidos());
                return vendedor;
            }
        }

        System.out.println("No se encontró un vendedor con ese nombre.");
        return null;
    }
}
