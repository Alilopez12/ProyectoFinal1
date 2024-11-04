package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PerfilUsuarioViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarInformacion;

    @FXML
    void OnActualizarInformacion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnActualizarInformacion != null : "fx:id=\"btnActualizarInformacion\" was not injected: check your FXML file 'perfilusuario.fxml'.";

    }

}
