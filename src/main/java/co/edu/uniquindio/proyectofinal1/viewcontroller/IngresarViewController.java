package co.edu.uniquindio.proyectofinal1.viewcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;

import java.net.URL;
import java.util.ResourceBundle;

public class IngresarViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBack;

    @FXML
    private MenuButton btnRol;

    @FXML
    private Button btnRegistrarse;


    @FXML
    void OnRol(ActionEvent event) {

    }

    @FXML
    void OnRegistrarse(ActionEvent event) {

    }

    @FXML
    void Onback(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file 'ingresar-view.fxml'.";
        assert btnRol != null : "fx:id=\"btnRol\" was not injected: check your FXML file 'ingresar-view.fxml'.";
        assert btnRegistrarse != null : "fx:id=\"btnRegistrarse\" was not injected: check your FXML file 'ingresar-view.fxml'.";

    }
}
