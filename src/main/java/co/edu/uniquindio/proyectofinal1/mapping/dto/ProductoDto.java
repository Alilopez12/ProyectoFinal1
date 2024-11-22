package co.edu.uniquindio.proyectofinal1.mapping.dto;

public record ProductoDto(
        String idProducto,
        String nombre,
        double precio,
        int cantDisponible
) {
}