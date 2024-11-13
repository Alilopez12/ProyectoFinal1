package co.edu.uniquindio.proyectofinal1.factory;

import co.edu.uniquindio.proyectofinal1.model.strategy.BusquedaManualStrategy;
import co.edu.uniquindio.proyectofinal1.model.strategy.SugerenciaPorContactosStrategy;
import co.edu.uniquindio.proyectofinal1.service.ISolicitudVinculoStrategy;

public class SolicitarVinculoFactory {
    public static ISolicitudVinculoStrategy obtenerEstrategia(String tipo) {
        switch(tipo) {
            case "BUSQUEDA_MANUAL":
                return new BusquedaManualStrategy();
            case "SUGERENCIA_CONTACTOS":
                return new SugerenciaPorContactosStrategy();
            default:
                throw new IllegalArgumentException("Tipo de busqueda no válida");
        }
    }
}
