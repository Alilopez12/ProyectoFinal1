package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EstadisticasViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnExportarEstadisticas;

    @FXML
    private Button btnGenerar;

    @FXML
    private Button btnGenerar1;

    @FXML
    private Button btnGenerar2;

    @FXML
    private Button btnNotificaciones;

    @FXML
    private TextField txtProductos;

    @FXML
    private TextField txtTransacciones;

    @FXML
    private TextField txtVendedores;

    @FXML
    void OnExportarEstadisticas(ActionEvent event) {

    }

    @FXML
    void OnGenerar(ActionEvent event) {

    }

    @FXML
    void OnGenerar1(ActionEvent event) {

    }

    @FXML
    void OnGenerar2(ActionEvent event) {

    }

    @FXML
    void OnNotificaciones(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnExportarEstadisticas != null : "fx:id=\"btnExportarEstadisticas\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert btnGenerar != null : "fx:id=\"btnGenerar\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert btnGenerar1 != null : "fx:id=\"btnGenerar1\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert btnGenerar2 != null : "fx:id=\"btnGenerar2\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert btnNotificaciones != null : "fx:id=\"btnNotificaciones\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert txtProductos != null : "fx:id=\"txtProductos\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert txtTransacciones != null : "fx:id=\"txtTransacciones\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert txtVendedores != null : "fx:id=\"txtVendedores\" was not injected: check your FXML file 'estadisticas-view.fxml'.";

    }

}
