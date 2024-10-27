package co.edu.uniquindio.proyectofinal1.factory;

import co.edu.uniquindio.proyectofinal1.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal1.mapping.mapper.MarketPlaceMappinglmpl;
import co.edu.uniquindio.proyectofinal1.model.*;
import co.edu.uniquindio.proyectofinal1.service.IModelFactoryServices;

import java.util.List;

public class ModelFactory implements IModelFactoryServices {
    
    private static ModelFactory instance;
    MarketPlace marketPlace;
    MarketPlaceMappinglmpl mapper;

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory(){
        mapper = new MarketPlaceMappinglmpl();
        marketPlace = inicializarDatos();
    }
    public  MarketPlace getMarketPlace(){
        return marketPlace;
    }

    public void setMarketPlace(MarketPlace marketPlace){
        this.marketPlace = marketPlace;
    }



    @Override
    public List<UsuarioDto> obtenerUsuarios(){
        return mapper.getUsuariosDto(marketPlace.getListUsuarios());
    }

    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto){
        if(marketPlace.verificarUsuarioExistente(usuarioDto.cedula())){
            Usuario newUsuario = mapper.usuarioDtoToUsuario(usuarioDto);
            getMarketPlace().crearUsuario(
                    newUsuario.getApellidos(),
                    newUsuario.getCedula(),
                    newUsuario.getContraseña(),
                    newUsuario.getDireccion(),
                    newUsuario.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarUsuario(String cedula){
        return false;
    }
    @Override
    public boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto) {
        return false;
    }

    public static MarketPlace inicializarDatos(){

        MarketPlace marketPlace1 = new MarketPlace();

        Usuario administrador = Administrador.builder()
                .nombre("Alicia")
                .apellidos("Montes Ceballos")
                .cedula("1254785624")
                .direccion("Montes de villa")
                .contraseña("25MNhgg")
                .build();

        Usuario vendedor1 = Vendedor.builder()
                .nombre("Macarena")
                .apellidos("López Martinez")
                .cedula("418956315")
                .direccion("Villa nueva")
                .contraseña("3351.kdn")
                .build();

        Usuario vendedor2 = Vendedor.builder()
                .nombre("Diego")
                .apellidos("Gonzales Guamacha")
                .cedula("762139856")
                .direccion("Armenia")
                .contraseña("Kiyh341Q=?")
                .build();

        Producto producto1 = Producto.builder()
                .nombre("Smartphone")
                .imagen("ImagenProducto1")
                .categoria("C")
                .precio(3500000.12)
                .estadoProducto(EstadoProducto.PUBLICADO)
                .build();

        Producto producto2 = Producto.builder()
                .nombre("Nevera")
                .imagen("ImagenProducto2")
                .categoria("B")
                .precio(34200800.50)
                .estadoProducto(EstadoProducto.VENDIDO)
                .build();




        marketPlace1.getListUsuarios().add(administrador);
        marketPlace1.getListUsuarios().add(vendedor1);
        marketPlace1.getListUsuarios().add(vendedor2);

        return marketPlace1;

    }
}

