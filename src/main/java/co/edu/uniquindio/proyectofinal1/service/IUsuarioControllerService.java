package co.edu.uniquindio.proyectofinal1.service;


import co.edu.uniquindio.proyectofinal1.mapping.dto.UsuarioDto;

import java.util.List;

public interface IUsuarioControllerService {

    List<UsuarioDto> obtenerUsuariosDto();
    boolean agregarUsuario(UsuarioDto usuarioDto);
    boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto);
    boolean eliminarUsuario(String cedula);

}
