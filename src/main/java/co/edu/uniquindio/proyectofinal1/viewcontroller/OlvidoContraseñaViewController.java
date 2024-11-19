package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class OlvidoContraseñaViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnEnviar;

    @FXML
    void OnBack(ActionEvent event) {

    }

    @FXML
    void OnEnviar(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Envío Exitoso");
        alert.setHeaderText(null);
        alert.setContentText("El correo se envió con éxito.");
        alert.showAndWait();

    }

    @FXML
    void initialize() {
        assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file 'olvidoContraseña-view.fxml'.";
        assert btnEnviar != null : "fx:id=\"btnEnviar\" was not injected: check your FXML file 'olvidoContraseña-view.fxml'.";

    }

}
