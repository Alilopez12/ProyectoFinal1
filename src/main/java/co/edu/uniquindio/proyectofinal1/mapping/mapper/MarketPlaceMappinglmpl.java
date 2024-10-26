package co.edu.uniquindio.proyectofinal1.mapping.mapper;



import co.edu.uniquindio.proyectofinal1.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal1.model.Usuario;
import co.edu.uniquindio.proyectofinal1.service.IMarketPlaceMapping;

import java.util.ArrayList;
import java.util.List;

public class MarketPlaceMappinglmpl implements IMarketPlaceMapping {

    @Override
    public List<UsuarioDto> obtenerUsuarios() {
        return List.of();
    }

    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto) {
        return false;
    }

    @Override
    public List<UsuarioDto> getUsuariosDto(List<Usuario> listaUsuarios) {
        if (listaUsuarios == null) {
            return null;
        }
        List<UsuarioDto> listaUsuariosDto = new ArrayList<UsuarioDto>(listaUsuarios.size());
        for (Usuario usuario : listaUsuarios) {
            listaUsuariosDto.add(usuarioToUsuarioDto(usuario));
        }
        return listaUsuariosDto;
    }

    @Override
    public UsuarioDto usuarioToUsuarioDto(Usuario usuario) {
        return new UsuarioDto(
                usuario.getNombre(),
                usuario.getApellidos(),
                usuario.getContraseña(),
                usuario.getDireccion(),
                usuario.getCedula());
    }

    @Override
    public Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto) {
        return Usuario.builder()
                .nombre(usuarioDto.nombre())
                .apellidos(usuarioDto.apellidos())
                .contraseña(usuarioDto.contraseña())
                .direccion(usuarioDto.direccion())
                .cedula(usuarioDto.cedula())
                .build();
    }



}
