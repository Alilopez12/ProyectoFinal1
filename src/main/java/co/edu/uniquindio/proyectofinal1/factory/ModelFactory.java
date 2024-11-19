package co.edu.uniquindio.proyectofinal1.factory;

import co.edu.uniquindio.proyectofinal1.controller.MediatorController;
import co.edu.uniquindio.proyectofinal1.controller.VendedorController;
import co.edu.uniquindio.proyectofinal1.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal1.mapping.mapper.MarketPlaceMappinglmpl;
import co.edu.uniquindio.proyectofinal1.model.*;
import co.edu.uniquindio.proyectofinal1.service.IModelFactoryServices;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ModelFactory implements IModelFactoryServices {

    private static ModelFactory instance;
    MarketPlace marketPlace;
    MarketPlaceMappinglmpl mapper;

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory() {
        mapper = new MarketPlaceMappinglmpl();
    }

    public MarketPlace getMarketPlace() {
        if (marketPlace == null) {
            marketPlace = inicializarDatos();
        }
        return marketPlace;
    }

    public void setMarketPlace(MarketPlace marketPlace) {
        this.marketPlace = marketPlace;
    }

    @Override
    public List<UsuarioDto> obtenerUsuarios() {
        return mapper.getUsuariosDto(marketPlace.getListUsuarios());
    }

    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto) {
        if (marketPlace.verificarUsuarioExistente(usuarioDto.cedula())) {
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
    public boolean eliminarUsuario(String cedula) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto) {
        return false;
    }


    public static MarketPlace inicializarDatos() {
        MarketPlace marketPlace1 = new MarketPlace();

        // Crear los usuarios
        Usuario administrador = Administrador.builder()
                .nombre("Alicia")
                .apellidos("Montes Ceballos")
                .cedula("1254785624")
                .direccion("Montes de villa")
                .contraseña("25MNhgg")
                .build();

        // Crear los vendedores
        Vendedor vendedor1 = Vendedor.builder()
                .nombre("Macarena")
                .apellidos("López Martinez")
                .cedula("418956315")
                .direccion("Villa nueva")
                .contraseña("3351.kdn")
                .build();

        Vendedor vendedor2 = Vendedor.builder()
                .nombre("Carlos")
                .apellidos("González Pérez")
                .cedula("342857130")
                .direccion("Calle 45, Bogotá")
                .contraseña("1234.abcd")
                .build();

        Vendedor vendedor3 = Vendedor.builder()
                .nombre("Lucía")
                .apellidos("Ramírez Soto")
                .cedula("987654321")
                .direccion("Barrio el Prado")
                .contraseña("abcd.4321")
                .build();

        Vendedor vendedor4 = Vendedor.builder()
                .nombre("José")
                .apellidos("Martínez Herrera")
                .cedula("556823908")
                .direccion("Avenida Libertador")
                .contraseña("lima.3214")
                .build();

        Vendedor vendedor5 = Vendedor.builder()
                .nombre("Ana")
                .apellidos("Sánchez Gómez")
                .cedula("123987654")
                .direccion("Sector 7, Medellín")
                .contraseña("abcd.1234")
                .build();

        Vendedor vendedor6 = Vendedor.builder()
                .nombre("Miguel")
                .apellidos("Torres Mendoza")
                .cedula("453678902")
                .direccion("Calle del Sol")
                .contraseña("miko.5678")
                .build();

        Vendedor vendedor7 = Vendedor.builder()
                .nombre("Isabel")
                .apellidos("Fernández Ruiz")
                .cedula("674589130")
                .direccion("Av. 9 de julio")
                .contraseña("madrid.7890")
                .build();

        Vendedor vendedor8 = Vendedor.builder()
                .nombre("Javier")
                .apellidos("Gómez Martínez")
                .cedula("852147963")
                .direccion("Calle Bolívar")
                .contraseña("javi.2345")
                .build();

        Vendedor vendedor9 = Vendedor.builder()
                .nombre("Sofía")
                .apellidos("López Fernández")
                .cedula("763412980")
                .direccion("Calle 9 de Octubre")
                .contraseña("sofi.4567")
                .build();

        Vendedor vendedor10 = Vendedor.builder()
                .nombre("Felipe")
                .apellidos("Díaz Pérez")
                .cedula("347569102")
                .direccion("Paseo del Parque")
                .contraseña("felipe.8765")
                .build();

        Vendedor vendedor11 = Vendedor.builder()
                .nombre("Gabriela")
                .apellidos("Morales Sánchez")
                .cedula("236587413")
                .direccion("Calle del Norte")
                .contraseña("gabi.4321")
                .build();

        Vendedor vendedor12 = Vendedor.builder()
                .nombre("Eduardo")
                .apellidos("Castro Rodríguez")
                .cedula("541298763")
                .direccion("Avenida Central")
                .contraseña("edu.8765")
                .build();

        Vendedor vendedor13 = Vendedor.builder()
                .nombre("Raquel")
                .apellidos("Jiménez Ruiz")
                .cedula("625489037")
                .direccion("Calle 10")
                .contraseña("raquel.6789")
                .build();

        Vendedor vendedor14 = Vendedor.builder()
                .nombre("Fernando")
                .apellidos("Pérez García")
                .cedula("847102635")
                .direccion("Paseo de la Reforma")
                .contraseña("fer.2345")
                .build();

        Vendedor vendedor15 = Vendedor.builder()
                .nombre("María")
                .apellidos("Vázquez López")
                .cedula("983672541")
                .direccion("Calle Nueva")
                .contraseña("maria.5678")
                .build();


        // Crear los productos
        Producto producto1 = ObtencionFactory.getFactory("electrónica").crearProducto(
                "Smartphone", "ELEC001", "imagen 1", 3500000.0, EstadoProducto.PUBLICADO);

        Producto producto2 = ObtencionFactory.getFactory("juego").crearProducto(
                "Nevera", "HOG001", "imagen_nevera.jpg", 2000000.0, EstadoProducto.VENDIDO);

        Producto producto3 = ObtencionFactory.getFactory("ropa").crearProducto(
                "Camiseta Deportiva", "ROP001", "imagen_camiseta.jpg", 50000.0, EstadoProducto.CANCELADO);

        // Crear publicaciones
        Publicacion publicacion1 = new Publicacion(LocalDateTime.now(), 0, new ArrayList<>());
        publicacion1.setProducto(producto1); // Asociar el producto a la publicación

        Publicacion publicacion2 = new Publicacion(LocalDateTime.now().minusDays(1), 5, new ArrayList<>());
        publicacion2.setProducto(producto2); // Asociar el producto a la publicación


        // Agregar comentarios a los vendedores
        vendedor1.agregarComentario("ayyy oye me interesa ese cel", publicacion1.getProducto(), vendedor1);
        vendedor1.agregarComentario("Ese producto esta disponible? Me avisass", publicacion2.getProducto(), vendedor2);

        // Agregar los usuarios al marketplace
        marketPlace1.getListUsuarios().add(administrador);
        marketPlace1.getListUsuarios().add(vendedor1);
        marketPlace1.getListUsuarios().add(vendedor2);


        // Mostrar datos en consola para validar
        System.out.println("Comentarios de " + vendedor1.getNombre() + ": " + vendedor1.getComentarios());
        System.out.println("Comentarios de " + vendedor2.getNombre() + ": " + vendedor2.getComentarios());


        // Crear el controlador de vendedores
        VendedorController vendedorController = new VendedorController();
        MediatorController mediatorController = new MediatorController();

        // Agregar contacto
        vendedorController.agregarContacto(vendedor1, vendedor2); // Vendedor1 agrega a Vendedor2
        vendedorController.agregarContacto(vendedor2, vendedor1); // Vendedor2 agrega a Vendedor1

        // Mostrar la cantidad de contactos de cada vendedor
        System.out.println("Contactos de " + vendedor1.getNombre() + ": " + vendedor1.getContactos().size());
        System.out.println("Contactos de " + vendedor2.getNombre() + ": " + vendedor2.getContactos().size());

        return marketPlace1; // Agregar el return para el objeto marketPlace
    }

}

