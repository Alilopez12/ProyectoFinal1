package co.edu.uniquindio.proyectofinal1.mapping.dto;

public record UsuarioDto(String nombre, String apellidos, String cedula, String direccion, String contraseña) {

    @Override
    public String toString() {
        return "UsuarioDto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", contraeña='" + contraseña + '\'' +
                '}';
    }

}

