package co.edu.uniquindio.proyectofinal1.model;

import java.time.LocalDate;

public class Mensaje {
    private String mensaje;
    private LocalDate fechaEnvioMensaje;

    public Mensaje(String mensaje, LocalDate fechaEnvioMensaje) {
        this.mensaje = mensaje;
        this.fechaEnvioMensaje = fechaEnvioMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFechaEnvioMensaje() {
        return fechaEnvioMensaje;
    }

    public void setFechaEnvioMensaje(LocalDate fechaEnvioMensaje) {
        this.fechaEnvioMensaje = fechaEnvioMensaje;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "mensaje='" + mensaje + '\'' +
                ", fechaEnvioMensaje=" + fechaEnvioMensaje +
                '}';
    }
}
