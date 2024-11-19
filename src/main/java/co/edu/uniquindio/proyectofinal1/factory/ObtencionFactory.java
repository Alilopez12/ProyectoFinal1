package co.edu.uniquindio.proyectofinal1.factory;

import co.edu.uniquindio.proyectofinal1.service.IProductoFactory;

public class ObtencionFactory {

    public static IProductoFactory getFactory(String categoria) {

        switch (categoria.toLowerCase()) {
            case "electrónica":
                return new ElectronicaFactory();
            case "juego":
                return new JuegoFactory();
            case "ropa":
                return new RopaFactory();
            default:
                throw new IllegalArgumentException("No hay categoria: " + categoria);
        }
    }
}
