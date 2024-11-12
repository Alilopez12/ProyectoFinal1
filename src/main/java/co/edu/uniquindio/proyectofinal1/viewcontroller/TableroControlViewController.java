package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TableroControlViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnMostrar;

    @FXML
    private Label idProductos;

    @FXML
    private Label idContactos;

    @FXML
    private Label idMensajes;

    @FXML
    private Label idProductosPubli;

    private DashboardData dashboardData;


    @FXML
    void OnMostrar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        // Inicializa la instancia de DashboardData
        dashboardData = new DashboardData();

        // Vincula los Labels a las propiedades observables
        idMensajes.textProperty().bind(dashboardData.cantidadMensajesProperty().asString());
        idContactos.textProperty().bind(dashboardData.cantidadContactosProperty().asString());
        idProductos.textProperty().bind(dashboardData.cantidadProductosProperty().asString());
        idProductosPubli.textProperty().bind(dashboardData.cantidadProductosPublicadosProperty().asString());

        // Prueba de actualización de datos
        dashboardData.setCantidadMensajes(10);  // Ejemplo
        dashboardData.setCantidadContactos(5);
        dashboardData.setCantidadProductos(8);
        dashboardData.setCantidadProductosPublicados(3);
    }

    // Métodos para actualizar los datos desde otras partes de la aplicación
    public void actualizarDatos(int mensajes, int contactos, int productos, int productosPubli) {
        dashboardData.setCantidadMensajes(mensajes);
        dashboardData.setCantidadContactos(contactos);
        dashboardData.setCantidadProductos(productos);
        dashboardData.setCantidadProductosPublicados(productosPubli);
    }
}