package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MuroViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIngresarAlChat;

    @FXML
    private Button btnMeGusta;

    @FXML
    private Button btnVerMas;

    @FXML
    void OnIngresarAlChat(ActionEvent event) {

    }

    @FXML
    void OnMeGusta(ActionEvent event) {

    }

    @FXML
    void OnVerMas(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnIngresarAlChat != null : "fx:id=\"btnIngresarAlChat\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnMeGusta != null : "fx:id=\"btnMeGusta\" was not injected: check your FXML file 'muro-view.fxml'.";
        assert btnVerMas != null : "fx:id=\"btnVerMas\" was not injected: check your FXML file 'muro-view.fxml'.";

    }

}
