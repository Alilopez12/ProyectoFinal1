package co.edu.uniquindio.proyectofinal1.service;


import co.edu.uniquindio.proyectofinal1.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal1.model.Usuario;
import java.util.List;

import java.awt.*;


public interface IMarketPlaceMapping {

    List<UsuarioDto> obtenerUsuarios();
    boolean agregarUsuario(UsuarioDto usuarioDto);

    java.util.List<UsuarioDto> getUsuariosDto(java.util.List<Usuario> listaUsuarios);

    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto);


}
