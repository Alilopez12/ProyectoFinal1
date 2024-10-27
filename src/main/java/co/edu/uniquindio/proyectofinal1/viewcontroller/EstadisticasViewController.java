package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EstadisticasViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGenerar;

    @FXML
    private Button btnNotificaciones;

    @FXML
    private TextField txtVendedores;

    @FXML
    private TextField txtProductos;

    @FXML
    private Button btnEstadisticas;

    @FXML
    private TextField txtTransacciones;

    @FXML
    private Label txtNotificaciones;


    @FXML
    void initialize() {
        assert btnGenerar != null : "fx:id=\"btnGenerar\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert btnNotificaciones != null : "fx:id=\"btnNotificaciones\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert txtVendedores != null : "fx:id=\"txtVendedores\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert txtProductos != null : "fx:id=\"txtProductos\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert btnEstadisticas != null : "fx:id=\"btnEstadisticas\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert txtTransacciones != null : "fx:id=\"txtTransacciones\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert txtNotificaciones != null : "fx:id=\"txtNotificaciones\" was not injected: check your FXML file 'estadisticas-view.fxml'.";

    }

    public void onGenerar(ActionEvent actionEvent) {
    }

    public void onNotificaciones(ActionEvent actionEvent) {
    }

    public void onEstadisticas(ActionEvent actionEvent) {

    }
}
