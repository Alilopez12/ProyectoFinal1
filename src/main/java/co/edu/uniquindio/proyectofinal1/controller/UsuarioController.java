package co.edu.uniquindio.proyectofinal1.controller;

import co.edu.uniquindio.proyectofinal1.factory.ModelFactory;
import co.edu.uniquindio.proyectofinal1.factory.SolicitarVinculoFactory;
import co.edu.uniquindio.proyectofinal1.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal1.model.Vendedor;
import co.edu.uniquindio.proyectofinal1.service.ISolicitudVinculoStrategy;
import co.edu.uniquindio.proyectofinal1.service.IUsuarioControllerService;

import java.util.List;

public class UsuarioController implements IUsuarioControllerService {
    ModelFactory modelFactory;
    public UsuarioController(){
        modelFactory = ModelFactory.getInstance();
    }
    public List<UsuarioDto> obtenerUsuarios(){
        return modelFactory.obtenerUsuarios();
    }

    @Override
    public  List<UsuarioDto> obtenerUsuariosDto(){
        return List.of();
    }
    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto){
        return modelFactory.agregarUsuario(usuarioDto);
    }

    @Override
    public boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto){
        return false;
    }

    @Override
    public boolean eliminarUsuario(String cedula){
        return false;
    }

    public void solicitarVinculo(Vendedor solicitante, String tipoEstrategia) {
        ISolicitudVinculoStrategy estrategia = SolicitarVinculoFactory.obtenerEstrategia(tipoEstrategia);
        Vendedor vendedorSeleccionado = estrategia.obtenerVendedor(solicitante);
    }
}
