package co.edu.uniquindio.proyectofinal1.service;

import co.edu.uniquindio.proyectofinal1.mapping.dto.ProductoDto;
import co.edu.uniquindio.proyectofinal1.mapping.dto.UsuarioDto;

import java.util.List;

public interface IModelFactoryServices {

    List<UsuarioDto> obtenerUsuarios();

    boolean agregarUsuario(UsuarioDto usuarioDto);

    boolean eliminarUsuario(String cedula);

    boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto);
}
