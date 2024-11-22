package co.edu.uniquindio.proyectofinal1.service;


import co.edu.uniquindio.proyectofinal1.mapping.dto.ProductoDto;
import co.edu.uniquindio.proyectofinal1.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal1.model.Producto;
import co.edu.uniquindio.proyectofinal1.model.Usuario;

import java.util.List;

public interface IMarketPlaceMapping {
    List<UsuarioDto> getUsuariosDto(List<Usuario> listaUsuarios);
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto);

}
